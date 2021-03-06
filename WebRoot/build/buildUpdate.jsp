<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
<style type="text/css" title="currentStyle" media="screen">
     @import url(css/maincss1.css);
	 @import url(css/mainborder1.css);
</style>
<link href="jquery-ui/jquery-ui.css" rel="stylesheet">
<script type="text/javascript" src="jquery-ui/external/jquery/jquery.js"></script>
<script type="text/javascript" src="jquery-ui/jquery-ui.js"></script>
<script type="text/javascript" src="js/datePicker.js"></script>
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
<li><a href="../role/roleList.html">角色管理</a></li>
<li><a href="../power/PowerList.do">权限管理</a></li>
<li><a href="../rp/rolePowerList.html">角色权限管理</a></li>
<li><a href="../user/userList.html">用户管理</a></li>
<li><a href="../backup/backup.html">数据管理</a></li>
</ul>
</li>

<li class="bannerli" onmouseover="show(2);"><h5><a href="#" >楼栋管理</a></h5>
<ul class="bannerchild" id="banner2">
<li><a href="build/buildAdd.jsp">增加楼栋</a></li>
<li><a href="build!list.action">删除楼栋</a></li>
<li><a href="build!list.action">查询楼栋</a></li>
<li><a href="build!list.action">修改楼栋</a></li>
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
<form name="form1" method="post" action="build!update.action?id=${build.id}" onsubmit="return checkbuild()">
<div id="index">
 </div>
<div id="table">
<table>
<caption>楼栋修改</caption>
<thead>
</thead>
<tbody>
<tr>
<td>楼栋编号</td>
<td><input type="text" readonly="readonly" disabled="disabled" name="buildId" value="${build.id}"></td>
</tr>
<tr>
<td>楼栋名</td>
<td><input name="buildName" type="text" value="${build.buildName}" /> </td>
<td>请输入中文，不得超过8位数</td>
</tr>
<tr>
<td>开工时间</td>
<td><input id="buildStart" name="buildStart" type="text" value="${build.buildStart}"/> </td>
<td>请输入中文，不得超过8位数</td>
</tr>
<tr>
<td>竣工时间</td>
<td><input id="buildFinish" name="buildFinish" type="text" value="${build.buildFinish}"/> </td>
<td>请输入中文，不得超过8位数</td>
</tr>
<tr>
<td>漏洞信息</td>
<td><input name="buildLeak" type="text" value="${build.buildLeak}" /> </td>
<td>请输入中文，不得超过8位数</td>
</tr>
<tr>
<td>建筑面积</td>
<td><input name="buildArea" type="text" value="${build.buildArea}" /> </td>
<td>请输入中文，不得超过8位数</td>
</tr>


</tbody>
<tfoot>
               <tr>
                 <td colspan="3">
                  <ul>
                     <li><input name="addnews" type="submit" value="确定"  class="button" onmouseout="this.className='button';" onmouseover="this.className='buttondown';" /></li>
                     <li><input name="sumselect" type="reset" value="重置"  class="button" onmouseout="this.className='button';" onmouseover="this.className='buttondown';" /></li>
                  </ul>
                 </td>
              </tr>
</tfoot>
</input>
</table>
</div>
</form>
</div>
<div id="foot">
<ul>
<li><a href="../welcome.html">首页</a></li>
<li><a href="../connectMang.html">联系管理员</a></li>
<li><a href="../project.html">项目说明</a></li>
<li><a href="../about.html">关于我们</a></li>
<li><a href="../onlinehelp.jsp">在线帮助</a></li>
</ul>

</div>
</div>
</body>
</html>