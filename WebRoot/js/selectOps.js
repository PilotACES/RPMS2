    function onSub(){
    	var selectName=document.getElementById("powerNameSelect");
    	var addName=document.getElementById("xuanze");
    	for(var i=0;i<selectName.options[i].length;i++){
    		if(selectName.options.selected==true){
    			for(var j=0;j<addName.options.length;j++){
    				if(selectName.options[i].value==addName.options[j].value){
    					var del=addName.options[j];
    					addName.options.remove(del);
    					break;
    				}
    			}
    			var option="<option value=\""+selectName.options[i].value+"\">"+selectName.options[i].text+"</option>";
    			addName.innerHTML=option;
    		}
    	}
    }
    
    function onDel(){
    	var addName=document.getElementById("xuanze");
    	for(var i=0;i<addName.options.length;i++){
    		if(addName.options[i].selected=true){
    			var del=addName.options[i];
    			addName.options.remove(del);
    		}
    	}
    }
    
    function selectedAll(){
    	var addName=document.getElementById("xuanze");
    	for(var i=0;i<addName.options.length;i++){
    		addName.otpions[i].selected=true;
    	}
    }