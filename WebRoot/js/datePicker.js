$(document).ready(function(){
	$("#buildStart").datepicker({altFormat:'yy-mm-dd',
		dateFormat:'yy-mm-dd',
		firstDay:1,
		changeMonth:true,
		changeYear:true,
		onClose:function(date){
			$("#buildFinish").datepicker("option","minDate",date);
		}
	});
	$("#buildFinish").datepicker({altFormat:'yy-mm-dd',
		dateFormat:'yy-mm-dd',
		firstDay:1,
		changeMonth:true,
		changeYear:true,
		onClose:function(date){
	    	$("#buildStart").datepicker("option","maxDate",date);
	    }
	});
	    
}
		);