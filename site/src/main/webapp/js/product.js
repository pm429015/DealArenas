//var product_results = document.getElementById("description").innerHTML;

var product_results = '{"手機受潮檢測":true,"觸控螢幕測試":true,"聽筒測試":false,"話筒測試":true,"手機撥接":true,"照相測試":true,"電源按鈕":true,"Home按鈕":true,"音量按鈕":true,"手機耳機孔":false,"衛星導航測試":true,"3G晶片":true,"WiFi晶片":true,"藍芽":false,"方向感測器":true,"陀螺儀":true,"接近感測器":true,"電子羅盤":false,"手機硬碟":true,"記憶體":true,"處理器":true}';
product_json = JSON.parse(product_results);

var product_li = "";

for(var key in product_json){
	if (product_json.hasOwnProperty(key)) {
		product_li +="<div class=\"col-md-3\"><h3 class=\"centered\">"+key+"</h3><img src='/img/phone_tests/"+key+".png\'  alt='"+key+"' /><img src='/img/phone_tests/"+product_json[key]+".png\'  alt='"+key+"' />"+"</li></div>";
	}
}

document.getElementById("demo").innerHTML = product_li;

// GA script
(function(i, s, o, g, r, a, m) {
	i['GoogleAnalyticsObject'] = r;
	i[r] = i[r] || function() {
		(i[r].q = i[r].q || []).push(arguments)
	}, i[r].l = 1 * new Date();
	a = s.createElement(o), m = s.getElementsByTagName(o)[0];
	a.async = 1;
	a.src = g;
	m.parentNode.insertBefore(a, m)
})(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

ga('create', 'UA-53951020-1', 'auto');
ga('send', 'pageview');
