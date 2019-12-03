<%--
  Created by IntelliJ IDEA.
  User: 65157
  Date: 2019/12/3
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":"
            + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath %>"/>
    <title></title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/list.css"/>
    <script src="js/jquery-3.4.1.min.js"></script>
    <script>
        /**
         * 定义全局变量，上传文件的进度，用于进度条
         */
        var percentComplete = 0;

        /**
         * 弹出文件选择框
         */
        function upload() {
            //获得文件域对象
            var fileField = $("#file")[0];
            //弹出选择文件的窗口
            fileField.click();
        }

        /**
         * 上传文件
         * @param thisz
         */
        function uploadFile(thisz) {
            //获得文件的路径
            var filePath = thisz.value;
            //判断是否选择文件
            if (filePath) {
                //创建表单对象
                var formData = new FormData();
                //封装请求参数
                formData.append("method", "upload");
                formData.append("file", thisz.files[0]);
                //创建xhr对象
                var xhr = new XMLHttpRequest();
                //打开与服务器的连接
                xhr.open("post", "servlet/fileall");
                //注册状态改变事件
                xhr.onreadystatechange = function () {
                    //判断服务器是否成功响应
                    if (xhr.readyState == 4 && xhr.status == 200) {
                        //获得响应数据
                        var result = xhr.responseText;
                        //转换成JSON对象
                        var jsonData = eval("(" + result + ")")
                        //判断是否成功上传
                        if (jsonData.success) {

                        }
                    } else {

                    }
                }
            }
        }


    </script>
</head>
<body>

</body>
</html>
