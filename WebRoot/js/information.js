
function checkbuild(){
var buildName=document.form1.buildName.value;
if(buildName == null||buildName == ""){
alert("¥��������Ϊ�գ�");
document.form1.buildName.focus();
return false;
}
var buildStart=document.form1.buildStart.value;
   if(buildStart == null||buildStart == ""){
      alert("�������ڲ���Ϊ�գ����������룡");
	  document.form1.buildStart.focus();
	  return false;
    }
    var buildFinish=document.form1.buildFinish.value;
   if(buildFinish == null||buildFinish == ""){
      alert("�������ڲ���Ϊ�գ����������룡");
	  document.form1.buildFinish.focus();
	  return false;
    }else if(buildFinish < buildStart){
      alert("��ȷ���������ڣ�");
	  document.form1.buildFinish.focus();
	  return false;
    }else if(buildFinish == buildStart){
      alert("��ȷ���������ڣ�");
	  document.form1.buildFinish.focus();
	  return false;
    }
var buildLeak=document.form1.buildLeak.value;
if(buildLeak==null||buildLeak==""){
alert("©����Ϣ����Ϊ�գ�");
document.form1.buildLeak.focus();
return false;
}
var buildArea=document.form1.buildArea.value;
if(buildArea==null||buildArea==""){
alert("�����������Ϊ�գ�");
document.form1.buildArea.focus();
return false;
}else if(!(/^\d+\.\d*$/).exec(buildArea)){
alert("���������������Ӧ��Ϊ��������");
document.form1.buildArea.focus();
return false;
}

}

function checkcharge(){
var chargeName=document.form1.chargeName.value;
if(chargeName==null||chargeName==""){
alert("�շ���Ŀ������Ϊ�գ�");
document.form1.chargeName.focus();
return false;
}
var chargeUnit=document.form1.chargeUnit.value;
if(chargeUnit==null||chargeUnit==""){
alert("�շѱ�׼����Ϊ�գ�");
document.form1.chargeUnit.focus();
return false;
}else if(!(/^\d+\.\d*$/).exec(chargeUnit)){
alert("�շѱ�׼����������Ӧ��Ϊ��������");
document.form1.chargeUnit.focus();
return false;
}
}

function checkowner(){
   var text1=document.form1.name.value;
   if(text1 == null||text1 == ""||(/\n\s*\r/).exec(text1)){
      alert("��������Ϊ�գ����������룡");
	  document.form1.name.focus();
	  return false;
    }
   var text2=document.form1.native.value;
   if(text2 == null||text2 == ""||(/\n\s*\r/).exec(text2)){
      alert("���᲻��Ϊ�գ����������룡");
	  document.form1.native.focus();
	  return false;
    }
   var text3=document.form1.phone.value;
   if(text3 == null||text3 == ""){
      alert("��ϵ�绰����Ϊ�գ����������룡");
	  document.form1.phone.focus();
	  return false;
    }
   if(!(/\d{3}-\d{8}|\d{4}-\d{7}/).exec(text3)&&!(/^[1-9]\d*$/).exec(text3)){
     alert("��ϵ�绰���Ϸ���");
	 document.form1.phone.focus();
	 return false;
   }
   var text4=document.form1.iden.value;
   if(text4 == null||text4 == ""){
      alert("���֤�Ų���Ϊ�գ����������룡");
	  document.form1.iden.focus();
	  return false;
    }
   if(!(/\d{15}|\d{18}/).exec(text4)){
    alert("���֤�Ų��Ϸ���");
	document.form1.iden.focus();
	return false;
   }
   var text5=document.form1.dep.value;
   if(text5 == null||text5 == ""||(/\n\s*\r/).exec(text5)){
      alert("������λ����Ϊ�գ����������룡");
	  document.form1.dep.focus();
	  return false;
    }
   var text6=document.form1.roomId.value;
   if(text6 == null||text6 == ""){
      alert("��ѡ�񷿼䣡");
	  document.form1.roomId.focus();
	  return false;
    }
   var text7=document.form1.roleId.value;
   if(text7 == null||text7 == ""){
      alert("��ѡ���ɫ��");
	  document.form1.roleId.focus();
	  return false;
    }
   }

   function checkmember(){
   var text1=document.form1.ownerId.value;
   if(text1 == null||text1 == ""){
      alert("��ѡ��ҵ����");
	  document.form1.ownerId.focus();
	  return false;
    }
    var text2=document.form1.name.value;
   if(text2 == null||text2 == ""){
      alert("��������Ϊ�գ����������룡");
	  document.form1.name.focus();
	  return false;
    }
   var text3=document.form1.native.value;
   if(text3 == null||text3 == ""){
      alert("���᲻��Ϊ�գ����������룡");
	  document.form1.native.focus();
	  return false;
    }
   var text4=document.form1.phone.value;
   if(text4 == null||text4 == ""){
      alert("��ϵ�绰����Ϊ�գ����������룡");
	  document.form1.phone.focus();
	  return false;
    }
   if(!(/\d{3}-\d{8}|\d{4}-\d{7}/).exec(text4)&&!(/^[1-9]\d*$/).exec(text4)){
     alert("��ϵ�绰���Ϸ���");
	 document.form1.phone.focus();
	 return false;
   }
   var text5=document.form1.dep.value;
   if(text5 == null||text5 == ""){
      alert("������λ����Ϊ�գ����������룡");
	  document.form1.dep.focus();
	  return false;
    }
   }
   
   function checktype(){
   var text1=document.form1.name.value;
   if(text1 == null||text1 == ""){
      alert("���������Ϊ�գ����������룡");
	  document.form1.name.focus();
	  return false;
    }
   }
   
   function checkpayadd(){
   var text1=document.form1.chargeId.value;
   if(text1 == null||text1 == ""){
      alert("��ѡ���շ���Ŀ��");
	  document.form1.chargeId.focus();
	  return false;
    }
    var text2=document.form1.payMoney.value;
   if(text2 == null||text2 == ""){
      alert("Ӧ�ս���Ϊ�գ����������룡");
	  document.form1.payMoney.focus();
	  return false;
    }
   if(!(/^\d+\.\d*$/).exec(text2)){
     alert("Ӧ�ս���ʽ���Ϸ���");
	 document.form1.payMoney.focus();
	 return false;
   }
    var text3=document.form1.payReceive.value;
   if(text3 == null||text3 == ""){
      alert("ʵ�ս���Ϊ�գ����������룡");
	  document.form1.payReceive.focus();
	  return false;
    }
   if(text3 != 0.0){
     alert("ʵ�ս���ȷ��");
	 document.form1.payReceive.focus();
	 return false;
   }
    var text4=document.form1.payLack.value;
   if(text4 == null||text4 == ""){
      alert("Ƿ�ѽ���Ϊ�գ����������룡");
	  document.form1.payLack.focus();
	  return false;
    }
   if(text4 != text2){
     alert("Ƿ�ѽ���ȷ��");
	 document.form1.payLack.focus();
	 return false;
   }
	 var text5=document.form1.payDate.value;
   if(text5 == null||text5 == ""){
      alert("�ɷ����ڲ���Ϊ�գ����������룡");
	  document.form1.payDate.focus();
	  return false;
    }
   var text6=document.form1.ownerId.value;
   if(text6 == null||text6 == ""){
      alert("��ѡ��ҵ����");
	  document.form1.ownerId.focus();
	  return false;
    }
    var text7=document.form1.payState.value;
   if(text7 != 0){
      confirm("��ȷ��ҵ���Ƿ��ѽɷѣ�");
	  document.form1.payState.focus();
	  return false;
    }
    var text8=document.form1.payMonth.value;
   if(text8 == null||text8 == ""){
      alert("�ɷ��·ݲ���Ϊ�գ����������룡");
	  document.form1.payMonth.focus();
	  return false;
    }
   }
   
   function checkpaysend(){
   var text1=document.form1.payMoney.value;
   if(text1 == null||text1 == ""){
      alert("Ӧ�ս���Ϊ�գ����������룡");
	  document.form1.payMoney.focus();
	  return false;
    }
   if(!(/^\d+\.\d*$/).exec(text1)){
     alert("Ӧ�ս���ʽ���Ϸ���");
	 document.form1.payMoney.focus();
	 return false;
   }
    var text2=document.form1.payReceive.value;
   if(text2 == null||text2 == ""){
      alert("ʵ�ս���Ϊ�գ����������룡");
	  document.form1.payReceive.focus();
	  return false;
    } else if(!(/^\d+\.\d*$/).exec(text2)){
     alert("ʵ�ս���ʽ���Ϸ���");
	 document.form1.payReceive.focus();
	 return false;
   }
   if(text2 < text1){
     alert("ʵ�ս���ȷ��");
	 document.form1.payReceive.focus();
	 return false;
   }
    var text3=document.form1.payLack.value;
   if(text3 == null||text3 == ""){
      alert("Ƿ�ѽ���Ϊ�գ����������룡");
	  document.form1.payLack.focus();
	  return false;
    }
   if(text3 != 0.0){
     alert("Ƿ�ѽ���ȷ��");
	 document.form1.payLack.focus();
	 return false;
   }
   var text4=document.form1.payDate.value;
   if(text4 == null||text4 == ""){
      alert("�ɷ����ڲ���Ϊ�գ����������룡");
	  document.form1.payDate.focus();
	  return false;
    }
    var text5=document.form1.payState.value;
   if(text5 != 1){
      alert("��ȷ��ҵ���Ƿ�δ�ɷѣ�");
	  document.form1.payState.focus();
	  return false;
    }
   }
   
   function checkpayupdate(){
   var text1=document.form1.payMoney.value;
   if(text1 == null||text1 == ""){
      alert("Ӧ�ս���Ϊ�գ����������룡");
	  document.form1.payMoney.focus();
	  return false;
    } else if(!(/^\d+\.\d*$/).exec(text1)){
     alert("Ӧ�ս���ʽ���Ϸ���");
	 document.form1.payMoney.focus();
	 return false;
   }
     var text2=document.form1.payReceive.value;
   if(text2 == null||text2 == ""){
      alert("ʵ�ս���Ϊ�գ����������룡");
	  document.form1.payReceive.focus();
	  return false;
    } else if(!(/^\d+\.\d*$/).exec(text2)){
     alert("ʵ�ս���ʽ���Ϸ���");
	 document.form1.payReceive.focus();
	 return false;
   }
    var text3=document.form1.payLack.value;
   if(text3 == null||text3 == ""){
      alert("Ƿ�ѽ���Ϊ�գ����������룡");
	  document.form1.payLack.focus();
	  return false;
    }else if(!(/^\d+\.\d*$/).exec(text3)){
     alert("Ƿ�ѽ���ʽ���Ϸ���");
	 document.form1.payLack.focus();
	 return false;
   }
   }
   
   function checkmaterialadd(){
   var text1=document.form1.materialName.value;
   if(text1 == null||text1 == ""){
      alert("�������Ʋ���Ϊ�գ����������룡");
	  document.form1.materialName.focus();
	  return false;
    }
   var text2=document.form1.materialCount.value;
   if(text2 == null||text2 == ""){
      alert("������������Ϊ�գ����������룡");
	  document.form1.materialCount.focus();
	  return false;
    }
    var text3=document.form1.materialPrice.value;
   if(text3 == null||text3 == ""){
      alert("���۲���Ϊ�գ����������룡");
	  document.form1.materialPrice.focus();
	  return false;
    }else if(!(/^\d+\.\d*$/).exec(text3)){
     alert("���۸�ʽ����ȷ��");
	 document.form1.materialPrice.focus();
	 return false;
   }
   var text4=document.form1.typeId.value;
   if(text4 == null||text4 == ""){
      alert("��ѡ���������");
	  document.form1.typeId.focus();
	  return false;
    }
    var text5=document.form1.materialInDate.value;
   if(text5 == null||text5 == ""){
      alert("������ڲ���Ϊ�գ����������룡");
	  document.form1.materialInDate.focus();
	  return false;
    }
    var text6=document.form1.materialOutDate.value;
   if(text6 == null||text6 == ""){
      alert("�������ڲ���Ϊ�գ����������룡");
	  document.form1.materialOutDate.focus();
	  return false;
    }
    var text7=document.form1.materialStat.value;
   if(text7 != 1){
      alert("��ȷ�������Ƿ���⣡");
	  document.form1.materialStat.focus();
	  return false;
    }
   function checkmaterialadd(){
   var text1=document.form1.materialName.value;
   if(text1 == null||text1 == ""){
      alert("�������Ʋ���Ϊ�գ����������룡");
	  document.form1.materialName.focus();
	  return false;
    }
   var text2=document.form1.materialCount.value;
   if(text2 == null||text2 == ""){
      alert("������������Ϊ�գ����������룡");
	  document.form1.materialCount.focus();
	  return false;
    }
    var text3=document.form1.materialPrice.value;
   if(text3 == null||text3 == ""){
      alert("���۲���Ϊ�գ����������룡");
	  document.form1.materialPrice.focus();
	  return false;
    }else if(!(/^\d+\.\d*$/).exec(text3)){
     alert("���۸�ʽ����ȷ��");
	 document.form1.materialPrice.focus();
	 return false;
   }
   var text4=document.form1.typeId.value;
   if(text4 == null||text4 == ""){
      alert("��ѡ���������");
	  document.form1.typeId.focus();
	  return false;
    }
    var text5=document.form1.materialInDate.value;
   if(text5 == null||text5 == ""){
      alert("������ڲ���Ϊ�գ����������룡");
	  document.form1.materialInDate.focus();
	  return false;
    }
    var text6=document.form1.materialOutDate.value;
   if(text6 == null||text6 == ""){
      alert("�������ڲ���Ϊ�գ����������룡");
	  document.form1.materialOutDate.focus();
	  return false;
    }
    var text7=document.form1.materialStat.value;
   if(text7 != 1){
      alert("��ȷ�������Ƿ���⣡");
	  document.form1.materialStat.focus();
	  return false;
    }
	else if(text5 != text6){
      alert("��ȷ�����ʳ������ڻ������Ƿ���⣡");
	  document.form1.materialStat.focus();
	  return false;
    }
    
   }
   }

   function checkmaterialupdate(){
   var text1=document.form1.name.value;
   if(text1 == null||text1 == ""){
      alert("�������Ʋ���Ϊ�գ����������룡");
	  document.form1.name.focus();
	  return false;
    }
   var text2=document.form1.count.value;
   if(text2 == null||text2 == ""){
      alert("������������Ϊ�գ����������룡");
	  document.form1.count.focus();
	  return false;
    }
    var text3=document.form1.price.value;
   if(text3 == null||text3 == ""){
      alert("���۲���Ϊ�գ����������룡");
	  document.form1.price.focus();
	  return false;
    }else if(!(/^\d+\.\d*$/).exec(text3)){
     alert("���۸�ʽ����ȷ��");
	 document.form1.price.focus();
	 return false;
   }
    var text4=document.form1.InDate.value;
   if(text4 == null||text4 == ""){
      alert("������ڲ���Ϊ�գ����������룡");
	  document.form1.InDate.focus();
	  return false;
    }
    var text5=document.form1.OutDate.value;
   if(text5 == null||text5 == ""){
      alert("�������ڲ���Ϊ�գ����������룡");
	  document.form1.OutDate.focus();
	  return false;
    }
    var text6=document.form1.stat.value;
    if((text4 == text5)&& text6 == 0){
      alert("��ȷ�����ʳ������ڻ������Ƿ���⣡");
	  document.form1.stat.focus();
	  return false;
    }else if((text4 != text5)&& text6 == 1){
      alert("��ȷ�����ʳ������ڻ������Ƿ���⣡");
	  document.form1.stat.focus();
	  return false;
    }else if(text4 > text5){
      alert("��ȷ�����ʳ������ڣ�");
	  document.form1.stat.focus();
	  return false;
    }
    }
 function checkkey(){
	var oneway=document.forms[0].oneway.value;
	if(oneway == 0){
	  alert("��ѡ���������ͣ�");
	  document.forms[0].oneway.focus();
	  return false;
	}
    var onetext=document.forms[0].onetext.value;
   if(onetext == null||onetext == ""){
      alert("������ؼ��֣�");
	  document.forms[0].onetext.focus();
	  return false;
    }else if(!(/[\u4e00-\u9fa5]/).exec(onetext)&&!(/^\w+$/).exec(onetext)&&!(/^\d+\.\d*$/).exec(onetext)){
     alert("�ؼ��ָ�ʽ����ȷ��");
	 document.form1.onetext.focus();
	 return false;
   } 
   }  
function checkroom(){
var buildid=document.form1.buildId.value;
if(buildid==null||buildid==""){
alert("��ѡ��¥����");
document.form1.buildId.focus();
return false;
}

var roomname=document.form1.roomName.value;
if(roomname==null||roomname==""){
alert("����������Ϊ�գ�");
document.form1.roomName.focus();
return false;
}
var roomdate=document.form1.roomDate.value;
if(roomdate==null||roomdate==""){
alert("ʱ�䲻��Ϊ�գ�");
document.form1.roomDate.focus();
return false;
}

var roomtype=document.form1.roomType.value;
if(roomtype==null||roomtype==""){
alert("���Ͳ���Ϊ�գ�");
document.form1.roomType.focus();
return false;
}
var roomarea=document.form1.roomArea.value;
if(roomarea==null||roomarea==""){
alert("�������Ϊ�գ�");
document.form1.roomArea.focus();
return false;
}else if(!(/^\d+\.\d*$/).exec(roomarea)){
alert("���Ҫ�Ǹ�������");
document.form1.roomArea.focus();
return false;
}
var roomPercent=document.form1.roomPercent.value;
if(roomPercent==null||roomPercent==""){
alert("�÷��ʲ���Ϊ�գ�");
document.form1.roomPercent.focus();
return false;
}else if(roomPercent <= 0.0 || roomPercent >= 1.0){
alert("�÷���Ҫ�Ǵ���0С��1������");
document.form1.roomPercent.focus();
return false;
}
}

function checkpower(){
var powername=document.form1.powerName.value;
if(powername==null||powername==""){
alert("Ȩ��������Ϊ�գ�����д��");
document.form1.powerName.focus();
return false;
}
}

function checkrole(){
var rolename=document.form1.roleName.value;
if(rolename==null||rolename==""){
alert("��ɫ������Ϊ�գ�����д��");
document.form1.roleName.focus();
return false;
}
}
function auth()
{
    
    var username= document.form1.userName.value;
    //�û�����֤
    if(username==null || username=="")
    {
      alert("�ܱ�Ǹ,�û�������Ϊ�գ����������룡");
      document.forms[0].userName.focus();
      return false;
    }
    
    //������֤
    var pass = document.forms[0].pass.value;
    var passlength = document.forms[0].pass.value.length;
    if(pass==null || pass=="")
    {
      alert("�ܱ�Ǹ�����벻��Ϊ�գ����������룡");
      document.forms[0].pass.focus();
      return false;
    }
    if(passlength<6)
    {
      alert("�ܱ�Ǹ�����벻������6λ�����������룡");
      document.forms[0].pass.focus();
      return false;
    }
    //ҵ������֤
    var ownerId = document.forms[0].ownerId.value;
    if(ownerId==null || ownerId=="")
    {
      alert("�ܱ�Ǹ��ҵ���Ų���Ϊ�գ����������룡");
      document.forms[0].ownerId.focus();
      return false;
    }
}