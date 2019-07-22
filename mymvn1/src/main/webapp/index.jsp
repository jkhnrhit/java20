<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>教师管理</title>
<style>
*{font-size: 12px;}
.c1{ width: 50px;}

</style>
<script type="text/javascript" src="jquery-1.8.3.js"></script>
<script type="text/javascript">
function turnPage(p_pno){
//pno给值
$('#p_id').val(p_pno);
//表单提交
$('form').submit();

}

</script>

</head>

<body>
<form action="teacher.htm?op=find" method="post">
<input id="p_id" type="hidden" name="pno" value="1"/>
<table  border="1">
  <tr>
    <td>工号:<input  type="text" name="tno" class="c1" value="${t.tno}"/></td>
    <td>姓名:<input  type="text" name="tname" class="c1" value="${t.tname}"/></td>
    <td>性别:<input  type="radio" value="男"  
    <c:if test="${t.tsex eq '男'}">
    checked="checked"
    </c:if>
     name="tsex"/>男<input value="女" 
      <c:if test="${t.tsex eq '女'}">
    checked="checked"
    </c:if>
     
      type="radio" name="tsex"/>女</td>
    
    <td>年龄:<input  type="text" name="minage" class="c1" value="${empty t.minage?0:t.minage}"/>岁到<input  type="text" name="maxage" class="c1" value="${empty t.maxage?0:t.maxage}" />岁(0表示不限制)</td>
    <td>职称:<input  type="text" value="${t.prof}" name="prof" class="c1"/></td>
    <td>部门:<select name="depart">
    <option value="">请选择</option>
    <option value="计算机系">计算机系</option>
    <option value="电子工程系">电子工程系</option>
   
    </select></td>
    <td><input type="submit" value="搜索"/></td>
  </tr>
  <c:forEach var="t1" items="${pv.list}">
  <tr>
    <td>${t1.tno}</td>
    <td>${t1.tname}</td>
    <td>${t1.tsex}</td>
    <td>${t1.tbirthday}</td>
    <td>${t1.prof}</td>
    <td>${t1.depart}</td>
    <td><input  type="button"  value="删除"/></td>
   
  </tr>
   </c:forEach>
  <tr>
    <td colspan="6">${pv.count}条,每页${pv.perPage},当前${pv.pno}/${pv.maxPage}&nbsp;<a href="javascript:turnPage(1)">首页</a>&nbsp;<a href="javascript:turnPage(${pv.pno-1})">上一页</a>&nbsp;<a href="javascript:turnPage(${pv.pno+1})">下一页</a>&nbsp;<a href="javascript:turnPage(${pv.maxPage})">尾页</a></td>
    <td>&nbsp;</td>
  </tr>
</table>
</form>



</body>
</html>
