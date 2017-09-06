<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="dist/css/layui.css" media="all">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

${sessionScope.uid}


<script src="js/jquery-1.2.6.pack.js" charset="utf-8"></script>
<script src="dist/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use('layer', function(){
        var layer = layui.layer;
        layer.prompt(
            {title:'大侠请留步！敢问大侠尊姓大名？',btn: ['就这个名','帮我取个']}
            ,function(value, index, elem){
                jQuery.ajax({url:"/all.do?p=adduser",async:false,data:{name:value}});
                layer.close(index);
                window.location.href="index.jsp";
            }
        );
    });

</script>

</body>
</html>