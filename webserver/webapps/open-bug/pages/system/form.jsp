<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<style>
		.input-text {width: 400px;}
	</style>
</head>

<body>
	<div class="wrapper">
	
		<div id="listDiv">
			<table class="list-table">
				<tr>
					<th width="60px">序号</th>
					<th width="100px">类型</th>
					<th width="200px">名称</th>
					<th width="400px">描述</th>
				</tr>
				<tr>
					<td class="sn">1</td>
					<td><div>查看页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">初始化页面</a></div></td>
					<td><div>查看初始化状态的页面</div></td>
				</tr>
				<tr>
					<td class="sn">2</td>
					<td><div>查看页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">待审核页面</a></div></td>
					<td><div>查看待审核状态的页面</div></td>
				</tr>
				<tr>
					<td class="sn">3</td>
					<td><div>查看页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">修改中页面</a></div></td>
					<td><div>查看修改中状态的页面</div></td>
				</tr>
				<tr>
					<td class="sn">4</td>
					<td><div>查看页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">回归测试中页面</a></div></td>
					<td><div>查看回归测试中状态的页面</div></td>
				</tr>
				<tr>
					<td class="sn">5</td>
					<td><div>查看页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">挂起页面</a></div></td>
					<td><div>查看挂起状态的页面</div></td>
				</tr>
				<tr>
					<td class="sn">6</td>
					<td><div>查看页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">关闭页面</a></div></td>
					<td><div>查看关闭状态的页面</div></td>
				</tr>
				<tr>
					<td class="sn">7</td>
					<td><div>操作页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">创建 & 编辑页面</a></div></td>
					<td><div>创建缺陷与编辑缺陷的页面</div></td>
				</tr>
				<tr>
					<td class="sn">8</td>
					<td><div>操作页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">指定修改页面</a></div></td>
					<td><div>指定缺陷修改人及更换缺陷修改人的页面</div></td>
				</tr>
				<tr>
					<td class="sn">9</td>
					<td><div>操作页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">审核不通过页面</a></div></td>
					<td><div>缺陷提交审核后，审核不通过的页面</div></td>
				</tr>
				<tr>
					<td class="sn">10</td>
					<td><div>操作页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">提交测试页面</a></div></td>
					<td><div>修改完缺陷后，提交测试人员测试的页面</div></td>
				</tr>
				<tr>
					<td class="sn">11</td>
					<td><div>操作页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">测试通过页面</a></div></td>
					<td><div>测试缺陷通过的页面</div></td>
				</tr>
				<tr>
					<td class="sn">12</td>
					<td><div>操作页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">测试不通过页面</a></div></td>
					<td><div>测试缺陷不通过的页面</div></td>
				</tr>
				<tr>
					<td class="sn">13</td>
					<td><div>操作页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">挂起页面</a></div></td>
					<td><div>将缺陷挂起的页面</div></td>
				</tr>
				<tr>
					<td class="sn">14</td>
					<td><div>操作页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">更换测试人页面</a></div></td>
					<td><div>更换测试缺陷责任人的页面</div></td>
				</tr>
				<tr>
					<td class="sn">15</td>
					<td><div>操作页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">直接关闭页面</a></div></td>
					<td><div>直接关闭缺陷的页面</div></td>
				</tr>
				<tr>
					<td class="sn">16</td>
					<td><div>操作页面</div></td>
					<td><div class="auto-link"><a href="#" onclick="openPage($(this));return false;">重启开启页面</a></div></td>
					<td><div>重新开启已关闭缺陷的页面</div></td>
				</tr>
			</table>
		</div>
	</div>
	
	<script>
		function openPage($a) {
			var flag = $("td:eq(0)", $a.closest("tr")).text().trim();
			location.href = top.basePath + "system/openPage.do?pageFlag=" + flag;
		}
		
		autoFrameHeight();
	</script>
</body>
</html>
