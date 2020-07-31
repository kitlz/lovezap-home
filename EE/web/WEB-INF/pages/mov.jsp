<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/7/22
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="/css/pintuer.css">
    <link rel="stylesheet" href="/css/admin.css">
    <script src="/js/jquery.js"></script>
    <script src="/js/pintuer.js"></script>
</head>
<body>
<form method="post" action="">
    <div class="panel admin-panel">
        <div class="panel-head"><strong class="icon-reorder"> movies 事件编号 item 10000~15000</strong></div>
        <div class="padding border-bottom">
            <ul class="search">
                <li>
                    <button type="button"  class="button border-green" id="checkall"><span class="icon-check"></span> 全选</button>
                    <button type="submit" class="button border-red"><span class="icon-trash-o"></span> 批量删除</button>
                    <a href="/lovezap/movies/add" type="button border-main" class="button border-main">添加</a>
                </li>
            </ul>
        </div>
        <table class="table table-hover text-center">
            <tr>
                <th width="120">id</th>
                <th>电影名</th>
                <th>观影时间</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${list}" var="mo">
                <tr>
                    <td><input type="checkbox" class="ids" name="ids" value="${mo.id}" />
                            ${mo.id}</td>
                    <td>${mo.movie}</td>
                    <td>${mo.time}</td>

                    <td><div class="button-group">
                        <a class="button border-sub" href="/lovezap/movies/update?id=${mo.id}" ><span class="icon-edit"></span> 修改</a>
                        <a class="button border-red" href="javascript:void(0)" onclick="del('${mo.id}')"><span class="icon-trash-o"></span> 删除</a> </div></td>
                </tr>
            </c:forEach>

        </table>
    </div>
</form>
<script type="text/javascript">




    function del(id) {
        if(confirm('真的删吗?')) {
            window.location.href = '/lovezap/movies/del?id=' + id
        }
    }
    $('#checkall').click(function(){
        $('.ids').each(function(index,element){
            $(element).prop('checked',true)
        })
    })

</script>
</body></html>