<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title> 新闻后台管理系统</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/frame/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/frame/static/css/style.css">
    <link rel="icon" href="${pageContext.servletContext.contextPath }/frame/static/image/code.png">
	<script type="text/javascript" src="${pageContext.servletContext.contextPath }/frame/layui/layui.js"></script>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath }/frame/static/js/vip_comm.js"></script>
</head>
<body>
<!-- layout admin -->
<div class="layui-layout layui-layout-admin"> <!-- 添加skin-1类可手动修改主题为纯白，添加skin-2类可手动修改主题为蓝白 -->
    <!-- header -->
    <div class="layui-header my-header">
        <a href="index.html">
            <!--<img class="my-header-logo" src="" alt="logo">-->
            <div class="my-header-logo">新闻后台管理系统</div>
        </a>
        <div class="my-header-btn">
            <button class="layui-btn layui-btn-small btn-nav"><i class="layui-icon">&#xe65f;</i></button>
        </div>
        <!-- 顶部右侧添加选项卡监听 -->
        <ul class="layui-nav my-header-user-nav" lay-filter="side-top-right">
             
            <li class="layui-nav-item">
                <a class="name" href="javascript:;"><img src="${pageContext.servletContext.contextPath }/frame/static/image/code.png" alt="logo"> ${username } </a>
                <dl class="layui-nav-child">
                    <dd><a href="../car"><i class="layui-icon">&#x1006;</i>退出</a></dd>
                </dl>
            </li>
        </ul>
    </div>
    <!-- side -->
    <div class="layui-side my-side">
        <div class="layui-side-scroll">
            <!-- 左侧主菜单添加选项卡监听 -->
            <ul class="layui-nav layui-nav-tree" lay-filter="side-main">
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="layui-icon">&#xe620;</i>功能</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" href-url="change/news"><i class="layui-icon">&#xe621;</i>新闻审核</a></dd>
                        <dd><a href="javascript:;" href-url="change/comment"><i class="layui-icon">&#xe621;</i>评论审核</a></dd>
                    </dl>
                </li>
               
             </ul>

        </div>
    </div>
    <!-- body -->
    <div class="layui-body my-body">
        <div class="layui-tab layui-tab-card my-tab" lay-filter="card" lay-allowClose="true">
            <ul class="layui-tab-title">
                <li class="layui-this" lay-id="1"><span><i class="layui-icon">&#xe638;</i>欢迎页</span></li>
            </ul>
            <div class="layui-tab-content">
                <div class="layui-tab-item layui-show">
                    <iframe id="iframe" src="change/welcome" frameborder="0"></iframe>
                </div>
            </div>
        </div>
    </div>
    <!-- footer -->
    <div class="layui-footer my-footer">
        
    </div>
</div>
<script type="text/javascript">
layui.use(['layer','vip_nav'], function () {

    // 操作对象
    var layer       = layui.layer
        ,vipNav     = layui.vip_nav
        ,$          = layui.jquery;
/* 
    // 顶部左侧菜单生成 [请求地址,过滤ID,是否展开,携带参数]
    vipNav.top_left('./json/nav_top_left.json','side-top-left',false);
    // 主体菜单生成 [请求地址,过滤ID,是否展开,携带参数]
    vipNav.main('./json/nav_main.json','side-main',true);

    // you code ...

 */
});
</script>
</body>
</html>