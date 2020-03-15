<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>Data-Table 表格</title>
    <link rel="stylesheet" href="../frame/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="../frame/static/css/style.css">
    <link rel="icon" href="../frame/static/image/code.png">
    <!--//表单样式的修改-->
    <style>
        .layui-form-label{
            width: 100px;
        }
        .layui-input-block {
            margin-left: 130px;
            min-height: 36px
        }
    </style>
</head>

<body class="body">
 
<!-- 工具集 -->
<div class="my-btn-box">
  
     
</div>
<!--&lt;!&ndash; 表格 &ndash;&gt;-->
<script type="text/javascript" src="../frame/layui/layui.js"></script>
<script type="text/javascript" src="../js/index.js"></script>
<table class="layui-hide" id="test" lay-filter="test"></table>
<!-- 表格操作按钮集 -->
<script type="text/html" id="barOption">
{{#  if(d.state =='0'){ }}
<a class="layui-btn layui-btn-mini layui-btn-normal" lay-event="del">待审核</a>
<a class="layui-btn layui-btn-mini layui-btn-danger" lay-event="edit">删除</a>
 
{{# } else { }}
<a class="layui-btn layui-btn-mini " >已审核</a>
<a class="layui-btn layui-btn-mini layui-btn-danger" lay-event="edit">删除</a>
{{# } }}
</script>
<script>
    layui.use(['table', 'form', 'layer', 'vip_table'], function () {

// 操作对象
        var form = layui.form
            , table = layui.table
            , layer = layui.layer
            , vipTable = layui.vip_table
            , $ = layui.jquery
        // 表格渲染
        var tableIns = table.render({
            elem: '#test'                  //指定原始表格元素选择器（推荐id选择器）
            , height: vipTable.getFullHeight()    //容器高度
            , toolbar: '#toolbarDemo'
            , title: '表'
            	, cols: [[     
                        {field: 'id', title: 'id', width: 80}
                      , {field: 'authon', title: '作者', width: 120}
                      , {field: 'type', title: '评论类容', width: 120}
                      , {field: 'time', title: '时间', width: 120}
                      , {field: 'content', title: '所看新闻', width: 120}
                      , {fixed: 'right', title: '操作', width: 150, align: 'center', toolbar: '#barOption'} //这里的toolbar值是模板元素的选择器 
                  ]]
                  , url: '../comment' 
            , method: 'get'
            , page: false
            , limits: [30, 60, 90, 150, 300]
            , loading: false
         
        ,done: function () {
            $("[data-field='id']").css('display','none');
        } 
        });
        //监听表格复选框选择 
        table.on('checkbox(demo)', function (obj) {
            console.log(obj)
        });
        //监听工具条
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            if (obj.event === 'edit') {
            	
           	  $.ajax({
                  url: "${pageContext.servletContext.contextPath }/delcommengtshenhe",
                   type: "POST",
                   data: {id: data.id},
                   success: function (msg) {
                	   tableIns.reload()
                  	  alert("评论审核成功");
                  	window.parent.location.reload();
                   }
               });
               
               
            }else if(obj.event === 'del'){
          	  $.ajax({
                  url: "${pageContext.servletContext.contextPath }/commengtshenhe",
                   type: "POST",
                   data: {id: data.id},
                   success: function (msg) {
                	   tableIns.reload()
                  	  alert("评论审核成功");
                  	window.parent.location.reload();
                   }
               });
        	
        }
            
        });
        
        function formToJson(formId) {
		    var serialArray = $(formId).serializeArray();
		    var jform = {};
		    for (var i = 0; i < serialArray.length; i++) {
		        jform[serialArray[i].name] = serialArray[i].value;
		  		  }
		    return jform;
			}
        
       function setFormValue(obj,data){
           form.on('submit(demo11)', function(massage) {
               $.ajax({
                   url:'${pageContext.servletContext.contextPath }/updatesllerCollect',
                   type:'POST',
          		data:$('#form2').serialize() ,
          		success:function (msg) {
                    var returnCode = msg.returnCode;//取得返回数据（Sting类型的字符串）的信息进行取值判断
                    if(returnCode==200){
                        layer.msg("修改成功", {icon: 6});
                        tableIns.reload()
                        parent.location.reload();
                        setTimeout(function(){
                           obj.update({
                         	  cNumber:massage.field.newcNumber,
                             });//修改成功修改表格数据不进行跳转
                             layer.closeAll();//关闭所有的弹出层
                        }, 1000);
                 
                    }else{
                        layer.msg("修改失败", {icon: 5});
                    }
                }
            })
        })
       }
        //添加采集设备
        $('#btn-add').on('click', function () {
            layer.open({
                type: 2,
                title: '汽车销售的添加',
                maxmin: true,
                area: ['420px', '330px'],
                shadeClose: false, //点击遮罩不会关闭
                content: 'sellAdd',//添加设备的from表单是在另一个html中，这是弹出方式的第三种方式
                done:function(){
                	layer.closeAll();
                }
            });
        });

      

        var $ = layui.$, active = {
            reload: function () {
                var demoReload = $('#demoReload');

                //执行重载
                table.reload('idTest', {
                    where: {
                        key: {
                            field: demoReload.val()
                        }
                    }
                });
            }
        };
        $('.demoTable .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

        // 刷新表格
        $('#btn-refresh').on('click', function () {
            tableIns.reload()
        });
    });
</script>
</body>
</html>
 