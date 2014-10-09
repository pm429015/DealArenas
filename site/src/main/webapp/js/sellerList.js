
$(function() {
	
	$('.btn-toggle').click(function() {
	    $(this).find('.btn').toggleClass('active');  
	    
	    if ($(this).find('.btn-primary').size()>0) {
	    	$(this).find('.btn').toggleClass('btn-primary');
	    }
	    if ($(this).find('.btn-danger').size()>0) {
	    	$(this).find('.btn').toggleClass('btn-danger');
	    }
	    if ($(this).find('.btn-success').size()>0) {
	    	$(this).find('.btn').toggleClass('btn-success');
	    }
	    if ($(this).find('.btn-info').size()>0) {
	    	$(this).find('.btn').toggleClass('btn-info');
	    }
	    
	    $(this).find('.btn').toggleClass('btn-default');
	       
	});
	
	$(".models").click(function(){
		$(this).find('input:radio').prop('checked', true);
		
//		alert($('input[name="produce_model"]:checked').val());
	});
	
	$("#sellerList_next1").click(function(){
		var model = $('input[name="produce_model"]:checked').val();
		if ($('input[name="produce_model"]:checked').val() !== undefined && $('input[name="produce_model"]:checked').val() != "others" ) {
//			$('#produce_models').hide();
			
			// if else all produces
			$('#produce_img').empty();
			
			if (model =='iPhone 6') {
				$('#produce_img').append('<img src="/img/list/iphone_6.png" alt="iphone_6.png" /><h3>iPhone 6</h3>');
			}else if(model =='iPhone 6 Plus'){
				$('#produce_img').append('<img src="/img/list/iphone_6_plus.png" alt="iphone_6plus.png" /><h3>iPhone 6 Plus</h3>');
			}else if(model =='iPhone 5S'){
				$('#produce_img').append('<img src="/img/list/iphone_5s.png" alt="iphone_5s.png" /><h3>iPhone 5S</h3>');
			}else if(model =='iPhone 5C'){
				$('#produce_img').append('<img src="/img/list/iphone_5c.png" alt="iphone_5C.png" /><h3>iPhone 5C</h3>');
			}else if(model =='iPhone 5'){
				$('#produce_img').append('<img src="/img/list/iphone_5.png" alt="iphone_5.png" /><h3>iPhone 5</h3>');
			}else if(model =='iPhone 4S'){
				$('#produce_img').append('<img src="/img/list/iphone_4s.png" alt="iphone_4s.png" /><h3>iPhone 4S</h3>');
			}else if(model =='iPhone 4'){
				$('#produce_img').append('<img src="/img/list/iphone_4.png" alt="iphone_4.png" /><h3>iPhone 4</h3>');
			}else if(model =='iPhone 3GS'){
				$('#produce_img').append('<img src="/img/list/iphone_3gs.png" alt="iphone_3gs.png" /><h3>iPhone 3GS</h3>');
			}else{
				alert('抱歉，目前暫時不開放其他類型商品，歡迎您來與我們建議，謝謝');
			}
			
		}
		
	});
	
	$("#sellerList_next2").click(function(){
		var imei = $('#inputIMEI').val();
		if ($("#btn-box").hasClass('active') 
				&& $("#btn-functional").hasClass('active')&& $("#btn-good").hasClass('active') && imei != "") {
			alert(imei);
		}
	});
	
	$(".others").click(function(){
		
		alert('抱歉，目前暫時不開放其他類型商品，歡迎您來與我們建議，謝謝');
	});
	
	 $('#imei_tutorial').popover();
	 
	 
	 
});


function price_change(price){
	document.getElementById("seller_price").innerHTML = price+"元";
	
	var get_paid = price*0.9;
	document.getElementById("paid_title").innerHTML =  "現賺"+get_paid+"元";
}

function isNumber(event) {
	  if (event) {
	    var charCode = (event.which) ? event.which : event.keyCode;
	    if (charCode != 190 && charCode > 31 && 
	       (charCode < 48 || charCode > 57) && 
	       (charCode < 96 || charCode > 105) && 
	       (charCode < 37 || charCode > 40) && 
	        charCode != 110 && charCode != 8 && charCode != 46 )
	       return false;
	  }
	  return true;
	}

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
