define(function(require){
	var $ = require('jquery');
	var vue = require('vue');
	var tip = require('frm/message');
	
	/**
	 * 创建模型
	 */
	var model = new vue({
		el:'#doorInfo',
		data:{
			menuListThree:[
				 {'id':'400601','name':'监狱AB门基本信息','url':'doorInfoPrison.html'}/*,
	             {'id':'400602','name':'外来人车进出记录','url':''},
				 {'id':'400603','name':'统计分析','url':''}*/
			]
		},
		methods:{
			openMenu:function(item){
				var id = item.id;
				var url = item.url;
				var obj = event.target;
				$("#menusTwo").find("li").each(function() {
					$(this).removeClass().addClass("menus2_li");
				});
				$(obj).removeClass().addClass("checked");
				$("#winIframe").attr("src",url);
			}
		}
	});
	
	$("#menusTwo").find("li:first").removeClass().addClass("checked");
	try {
		
	} catch (e) {
		console.error("初始化模块失败!", e);
	}
});