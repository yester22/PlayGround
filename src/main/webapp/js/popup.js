/**
 * 
 */
$(document).ready(function() {

	const btArea = new Vue({
		el: '#btArea',
		methods:{
			search:function() {
				tbPopup.search();
			},
			write : function() {
				$("#divList").hide();
				$("#divWrite").show();
				
				divWrite.load();
			}
		}
	});

	const tbPopup = new Vue({
		el: '#tbPopup',
		data: {
		    message: 'Hello Vue!',
		    results : [] 
		},
		methods:{
			search:function() {
				fetch("/admin/popup/list").then(res => res.json())
				.then(res => {
					if ( res.RESULT == "OK" ) {
						this.results = res.LIST;
					} else {
						alert ( res.MSG );
						return;
					}
				});
			},
			write : function () {
				//$("#searchList").trigger("click");
			}
		}
	});
	
	const divWrite = new Vue({
		el: '#divWrite',
		data: {
		    message: 'Hello Vue!',
		    results : [],
		    codeList : []
		},
		methods:{
			cancelWrite : function () {
				$("#divList").show();
				$("#divWrite").hide();
			},
			load : function()  {
				fetch("/admin/common/code/list?codeGrp=SPANDIV").then(res => res.json())
				.then(res => {
					if ( res.RESULT == "OK" ) {
						this.codeList = res.LIST;
					} else {
						alert ( res.MSG );
						return;
					}
				});			
			}
		}
	});
	
	
	
});



