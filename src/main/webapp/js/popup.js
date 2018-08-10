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
			}
		}
	});
	
	const divWrite = new Vue({
		el: '#divWrite',
		data: {
		    message: 'Hello Vue!',
		    results : []
		},
		methods:{
			write : function () {
				
							
				
				$("#searchList").trigger("click");
			},
			cancelWrite : function () {
				$("#divList").show();
				$("#divWrite").hide();
			}
		}
	});
	
	
	
});



