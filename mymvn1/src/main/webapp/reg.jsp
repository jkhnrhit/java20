<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-1.8.3.js"></script>
<script type="text/javascript">




$(document).ready(function(){
$("[name='qx']").change(function(){
var v_qx=$(this).val();
//发ajax请求
$.post("teacher.htm", { op: "jl", qx:v_qx,m:Math.random()},
   function(data){
 $("[name='jd']").empty();
 $("[name='jd']").append("<option>请选择</option>");
   var cs=$.parseJSON(data);
//alert(cs[0].cno+"  "+cs[0].cname);
for(var i=0;i<cs.length;i++)
{

$("[name='jd']").append($("<option value='"+cs[i].cno+"'>"+cs[i].cname+"</option>"));
}
   
  
   });

});


});

</script>


</head>
<body>
县区:<select name="qx" ><option value="1">涧西</option><option value="2">西工</option></select>
<br/>
街道:<select name="jd">
<option>请选择</option>

</select>


</body>
</html>