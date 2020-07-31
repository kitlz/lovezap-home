<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/7/22
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<div class="panel admin-panel">
    <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>addactivities</strong></div>
    <div class="body-content">

        <form method="post" class="form-x">
            <div class="form-group">
                <div class="label">

                </div>
                <div class="field">
                    <span style="color:red"> ${message}</span>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>id：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50"  name="id" data-validate="required:id" />
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>item：</label>
                </div>
                <div class="field">
                    <select name="item" class="input w50">
                        <c:forEach items="${ac}" var="ac">
                            <option value="${ac.id}">${ac.items}</option>
                        </c:forEach>
                    </select>
                    <div class="tips"></div>
                </div>
            </div>


            <div class="form-group">
                <div class="label">
                    <label>篮球已有共同记录：</label>
                </div>
                <div class="field">
                    <select name="item1" class="input w50">
                        <c:forEach items="${bb}" var="bb">
                            <option value="${bb.id}">篮球${bb.id}</option>
                        </c:forEach>
                    </select>
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>电影已有共同记录：</label>
                </div>
                <div class="field">
                    <select name="item2" class="input w50">
                        <c:forEach items="${mv}" var="mv">
                            <option value="${mv.id}">电影${mv.id}</option>
                        </c:forEach>
                    </select>
                    <div class="tips"></div>
                </div>
            </div>

                 <div class="form-group">
                     <div class="label">
                            <label>state：</label>
                        </div>
                        <div class="field">
                            <input type="text" class="input w50"  name="state" data-validate="required:state" />
                            <div class="tips"></div>
                     </div>
                 </div>

                 <div class="form-group">
                        <div class="label">
                            <label>towrite：</label>
                        </div>
                        <div class="field">
                            <input type="text" class="input w50"  name="towrite" data-validate="required:towrite" />
                            <div class="tips"></div>
                        </div>
                    </div>

            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 保存</button>
                </div>
            </div>
        </form>
    </div>
</div>

</body></html>
