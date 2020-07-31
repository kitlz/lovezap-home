<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/7/22
  Time: 20:58
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
        <div class="panel-head"><strong class="icon-reorder"> myactivities</strong></div>
        <td>   -持续更新中- </td>
        <table class="table table-hover text-center">
            <c:forEach items="${ac}" var="ac">
                <tr>
                    <td>❥</td>
                    <td>${ac.activity}</td>
                    <td>times</td>
                    <td>${ac.times}</td>
                    <td>❤</td>
                    <td>hy</td>
                    <td>❤</td>
                </tr>
            </c:forEach>

        </table>
    </div>
        <div class="padding border-bottom">
            <ul class="search">
                <li>
                    <button type="button"  class="button border-green" id="checkall"><span class="icon-check"></span> 全选</button>
                    <button type="submit" class="button border-red"><span class="icon-trash-o"></span> 批量删除</button>
                    <a href="/lovezap/myactivities/add" type="button border-main" class="button border-main">添加</a>
                </li>
            </ul>
        </div>

        <table class="table table-hover text-center">
            <tr>
                <th width="120">items</th>
                <th>state</th>
                <th>towrite</th>
                <th>id</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${list}" var="ma">
                <tr>
                    <td><input type="checkbox" class="ids" name="ids" value="${ma.items}" />
                            ${ma.items}</td>
                    <td>${ma.state}</td>
                    <td>${ma.towrite}</td>
                    <td>${ma.id}</td>
                    <td><div class="button-group">
                        <a class="button border-sub" href="/lovezap/myactivities/update?id=${ma.id}" ><span class="icon-edit"></span> 修改</a>
                        <a class="button border-red" href="javascript:void(0)" onclick="del('${ma.items}')"><span class="icon-trash-o"></span> 删除</a> </div></td>
                </tr>
            </c:forEach>

        </table>
    </div>
</form>
<script type="text/javascript">


    function del(id) {
        if(confirm('真的删吗?')) {
            window.location.href = '/lovezap/myactivities/del?id=' + id
        }
    }
    $('#checkall').click(function(){
        $('.ids').each(function(index,element){
            $(element).prop('checked',true)
        })
    })

</script>
</body></html>