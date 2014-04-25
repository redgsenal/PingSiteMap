// main ajax to call the service
$(function() {
	console.log("ajax call");
	$.ajax({
		type : "POST",
		url : "http://localhost:8080/PingSiteMap/JsonDataService",
		data : { param1: "hellohoho"},
		success : function(data, textStatus, jqXHR ){
			console.log(data);
			console.log("success");
		},
		error : function ( jqXHR, textStatus, errorThrown ){
			console.log("fail..");
			console.log(textStatus);
		},
		dateType : "html"
	});	
});