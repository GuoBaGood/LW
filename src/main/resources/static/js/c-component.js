//以下代码只是为了展示相关效果，项目开发时可删除此文件自行编写相关效果

$("body").on("click",".ctable-checkbox i",function(){//表格复习框效果（不含多选）
	$(this).toggleClass("choice");
}).on("click",".c-checkbox",function(){//表单复习框效果（不含多选）
	$(this).toggleClass("choice");
}).on("click",".c-radio",function(){//表单单选框效果
	$(this).addClass("choice").siblings(".c-radio").removeClass("choice");
}).on("click",".c-slider span",function(){//滑块选择效果
	$(this).addClass("choice").siblings().removeClass("choice");
}).on("click",".c-form-label.label-single li",function(){//标签单选效果
	$(this).addClass("choice").siblings().removeClass("choice");
}).on("click",".c-form-label.label-double li",function(){//标签多选效果
	$(this).toggleClass("choice");
}).on("click",".ctag-box .ctag-list li",function(){//tag切换效果
	var thisBox = $(this).closest(".ctag-box");
	var index = $(this).index();
	$(this).addClass("choice").siblings().removeClass("choice");
	thisBox.find(".ctag-item").stop().hide().eq(index).stop().show();
})
//表格操作隐藏图标效果
$(".ctable-menuhide").hover(function(){
	$(this).find(".ctable-hidemenu").stop().fadeIn(300);
},function(){
	$(this).find(".ctable-hidemenu").stop().fadeOut(300);
})
//框架2，3左侧菜单文字超出隐藏鼠标hover显示
$(".cframe2-content,.cframe3-content").on("mouseenter",".cframe2-left-menu a",function(){
	$(this).attr("title",$(this).find("span").text());
})
