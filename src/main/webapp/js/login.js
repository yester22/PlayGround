/***
 * 
 * 
 * @returns
 */
$(document).ready(function() {
	$("#btnLogin").click(function(){
		$("#frmLogin").attr("action", "/login").submit();
	});
});