$(function() {
	/*
	$('.page-scroll a').bind('click', function(event) {
		var $anchor = $(this);
		$('html, body').stop().animate({
			scrollTop : $($anchor.attr('href')).offset().top
		}, 1000, 'easeInOutExpo');
		event.preventDefault();
	});

	$('.landing-btn a').bind('click', function(event) {
		var $anchor = $(this);
		$('html, body').stop().animate({
			scrollTop : $($anchor.attr('href')).offset().top
		}, 1000, 'easeInOutExpo');
		event.preventDefault();
	});
	*/
	$(".buyer-btn").bind("click",function(){
		ga('send', 'event', { eventCategory: 'buy-scroll', eventAction: 'click'});
		$('html, body').stop().animate({
			scrollTop : $("#buy").offset().top
		}, 1000, 'easeInOutExpo');
		event.preventDefault();
	});
	
	$(".seller-btn").bind("click",function(){
		ga('send', 'event', { eventCategory: 'sell-scroll', eventAction: 'click'});
		$('html, body').stop().animate({
			scrollTop : $("#sell").offset().top
		}, 1000, 'easeInOutExpo');
		event.preventDefault();
	});
});

//GA script
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
