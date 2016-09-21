<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>角色管理</title>
<style type="text/css" title="currentStyle" media="screen">
     @import url(css/maincss1.css);
	 @import url(css/mainborder1.css);
</style>
<script src="js/valentine.js" type="text/javascript" charset="gb2312"></script>
<script src="js/information.js" type="text/javascript"></script>
</head>

<body onload="startit();">
<div id="icon">fourthfire</div>
<div id="userinfo">
<h5>欢迎</h5>
<h5></h5>
<h5><a href="../Out.do">注销</a></h5>
<h5><a href="../Out.do">退出</a></h5>
<h5>现在时间</h5>
<h5 id="year"></h5>
<h5>年</h5>
<h5 id="month"></h5>
<h5>月</h5>
<h5 id="day"></h5>
<h5>日</h5>
<h5 id="moreve"></h5>
<h5 id="hours"></h5>
<h5>:</h5>
<h5 id="minutes"></h5>
<h5>:</h5>
<h5 id="seconds"></h5>

</div>
<div id="topicon"></div>
<div id="center">
<div id="banner">
<div id="topimg"></div>
<ul id="bannerul">

<li class="bannerli" onmouseover="show(1);"><h5><a href="#">管理员管理</a></h5>
<ul class="bannerchild" id="banner1">
<li><a href="role/roleList.html">角色管理</a></li>
<li><a href="power/PowerList.do">权限管理</a></li>
<li><a href="rp/rolePowerList.html">角色权限管理</a></li>
<li><a href="user/userList.html">用户管理</a></li>
<li><a href="backup/backup.html">数据管理</a></li>
</ul>
</li>

<li class="bannerli" onmouseover="show(2);"><h5><a href="#" >楼栋管理</a></h5>
<ul class="bannerchild" id="banner2">
<li><a href="/build/buildAdd.jsp">增加楼栋</a></li>
<li><a href="build!list.action?pageNum=1">删除楼栋</a></li>
<li><a href="build!list.action?pageNum=1">查询楼栋</a></li>
<li><a href="build!list.action?pageNum=1">修改楼栋</a></li>
</ul>
</li>
<li class="bannerli" onmouseover="show(3);"><h5><a href="#">房间管理</a></h5>
<ul class="bannerchild" id="banner3">
<li><a href="../room/roomAdd.html">增加房间</a></li>
<li><a href="../room/roomList.html">删除房间</a></li>
<li><a href="../room/roomList.html">查询房间</a></li>
<li><a href="../room/roomList.html">修改房间</a></li>
</ul>
</li>
<li class="bannerli" onmouseover="show(4);"><h5><a href="#">业主管理</a></h5>
<ul class="bannerchild" id="banner4">
<li><a href="../owner/OwnerAdd.html">增加业主</a></li>
<li><a href="../owner/OwnerList.html">修改业主</a></li>
<li><a href="../owner/OwnerList.html">查询业主</a></li>
<li><a href="../owner/OwnerList.html">删除业主</a></li>
</ul>
</li>
<li class="bannerli" onmouseover="show(5);"><h5><a href="#">业主成员</a></h5>
<ul class="bannerchild" id="banner5">
<li><a href="../member/memberAdd.html">增加成员</a></li>
<li><a href="../member/memberList.html">修改成员</a></li>
<li><a href="../member/memberList.html">查询成员</a></li>
<li><a href="../member/memberList.html">删除成员</a></li>
</ul>
</li>
<li class="bannerli" onmouseover="show(6);">
<h5><a href="#">收费项目</a></h5>
<ul class="bannerchild" id="banner6">
<li><a href="../charge/chargeAdd.html">增加项目</a></li>
<li><a href="../charge/chargeList.html">修改项目</a></li>
<li><a href="../charge/chargeList.html">查询项目</a></li>
<li><a href="../charge/chargeList.html">删除项目</a></li>
</ul>
</li>
<li class="bannerli" onmouseover="show(7);"><h5><a href="#">业主缴费</a></h5>
<ul class="bannerchild" id="banner7">
<li><a href="../pay/payList.html">业主缴费</a></li>
<li><a href="../pay/payList.html">缴费单查询</a></li>
<li><a href="../pay/payList.html">修改收费记录</a></li>
<li><a href="../pay/pagestat.html">缴费统计</a></li>
<li><a href="../pay/payList.html">删除缴费</a></li>
</ul>
</li>

<li class="bannerli" onmouseover="show(8);"><h5><a href="#">物资类别</a></h5>
<ul class="bannerchild" id="banner8">
<li><a href="../type/typeAdd.html">添加物资类别</a></li>
<li><a href="../type/typeList.html">修改物资类别</a></li>
<li><a href="../type/typeList.html">查询物资类别</a></li>
<li><a href="../type/typeList.html">删除物资类别</a></li>
</ul>
</li>

<li class="bannerli" onmouseover="show(9);"><h5><a href="#">物资设备</a></h5>
<ul class="bannerchild" id="banner9">
<li><a href="../material/materialAdd.html">入库</a></li>
<li><a href="../material/materialList.html">出库</a></li>
<li><a href="../material/materialList.html">查询物资</a></li>
<li><a href="../material/materialAdd.html">添加物资</a></li>
<li><a href="../material/materialList.html">修改物资</a></li>
</ul>
</li>

</ul>
</div>
<div id="main">
<form name="form1" method="post" action="build!find.action" onsubmit="return checkkey()">
<span class="style3">查询条件：</span>
<select id="condition" name="condition">
	<option value="0">--请选择--</option>
	<option value="1">楼栋名</option>
	<option value="2">开工时间</option>
	<option value="3">竣工时间</option>
	<option value="4">漏洞信息</option>
	<option value="5">建筑面积</option>
</select> 
<input type="text" name="onetext" value="请输入关键字"  id="txt1" onfocus="selectText();"/> 
<input type="submit" name="Submit" value="查询"/>
</form>
<form name="form2" method="post" action="build!delect.action" onsubmit="return befSubmit();">
<div id="table">
<table id="ec_table">
<caption>楼栋信息表</caption>
<thead>
<tr>
<th>选中</th>
<th onclick="sortTable('ec_table',1,'string')">楼栋名</th>
<th onclick="sortTable('ec_table',2,'string')">开工时间</th>
<th onclick="sortTable('ec_table',3,'string')">竣工时间</th>
<th onclick="sortTable('ec_table',4,'string')">漏洞信息</th>
<th onclick="sortTable('ec_table',5,'float')">建筑面积</th>
<th>修改</th>

</tr>
</thead>
<tbody>
<c:forEach items="${list.date}" var="builds">
<tr onmousemove="this.className='lightup';" onmouseout="this.className='lightdown';">
<td><input id="checkone" name="checkone" type="checkbox" value="${builds.id}" /></td>
<td>${builds.buildName}</td>
<td>${builds.buildStart}</td>
<td>${builds.buildFinish}</td>
<td>${builds.buildLeak}</td>
<td>${builds.buildArea}</td>
<td><a href="build!readyUpdate?id=${builds.id}">edit</a></td>
</tr>
</c:forEach>
</tbody>
<tfoot>
<tr>
                   <td colspan="7">
                      <h5>共${list.totalSize}条信息</h5>
                        <h5>当前第1页</h5>
         <ul>                            <li>首页</li>
                            <li><a href="../BuildAction!">前页</a></li>
                            <li>后页</li>
                            <li>末页</li>              
                            <li><span>转到</span>
                            <select name="" id="pagenumber" onchange="build();">
                            <c:forEach begin="1" end="${list.last}" step="1" var="i">                              
                                  <option value="${i}">第${i}页</option>
                            </c:forEach>                                                           
                            </select>
                            </li>
                         
                        </ul>                   
                        </td>
               </tr>
               <tr>
                 <td colspan="7">
                  <ul>
                
                     <li><input name="addnews" type="button" value="添加楼栋"  class="button" onmouseout="this.className='button';" onmouseover="this.className='buttondown';" onclick="window.location='build/buildAdd.jsp'"/></li>
                     <li><input name="sumselect" type="button" value="全部选择"  class="button" onmouseout="this.className='button';" onmouseover="this.className='buttondown';"  onclick="checkAll();"/></li>
                     <li><input name="delete" type="submit" value="删除楼栋"  class="button" onmouseout="this.className='button';" onmouseover="this.className='buttondown';" /></li>
               
                  </ul>
                 </td>
              </tr>
</tfoot>

</table>
</div>
</form>
</div>
</div>
<div id="foot">
<ul>
<li><a href="welcome.html">首页</a></li>
<li><a href="connectMang.html">联系管理员</a></li>
<li><a href="project.html">项目说明</a></li>
<li><a href="about.html">关于我们</a></li>
<li><a href="onlinehelp.jsp">在线帮助</a></li>
</ul>

</div>

</body>
</html>
