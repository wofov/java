let data;
var ct=0;
function wck(){
	if(window.XMLHttpRequest){
		return new XMLHttpRequest();
	}
}
function members(){
	
	if(data.readyState == XMLHttpRequest.DONE && data.status==200){
		member_list(data.response);
	}
	else if(data.status==404){
		error();		
	}
}
data = wck();
data.onreadystatechange = members;
data.open("GET","./index3.json",true);
data.send();

function member_list(jdata){
	var j = JSON.parse(jdata);
	//console.log(j);
	var total = j["members"].length;
	
	var f;
	var i=document.getElementById("bb");
	var tr, tr, text;
	for(f in j.members){
		tr=document.createElement("tr");
		td = document.createElement("td");
		td.append(total);
		tr.append(td);
		//i.append(tr);
		var ff;
		//getAttribute : 속성값 가져올 때(style,onclick,class)
		for(ff in j.members[f]){
			if(ff=="id"){
			tr.setAttribute("onclick","java_get('"+j.members[f][ff]+"')");
			}
			td = document.createElement("td");
			if(ff=="area"){
				ff="phone";
			}
			else if(ff=="phone"){
				ff="area";
			}
			//console.log(j.members[f][ff]);
			text = document.createTextNode(j.members[f][ff]);
			td.append(text);
			tr.append(td);
		}
		i.append(tr);
		total--;
	}
	console.log(j);
	//console.log(j.members[0]);
	var s ;
	for(s in j.members){
		var ss;
		for(ss in j.members[s]){
			console.log(j.members[s][ss]);
		}
		
	}
//	var i = document.getElementById("bb");
//	var tr,tr,text;
//	var ct=0;
//	Object.keys(j["members"]).forEach(function(a,b,c){
//			
//			tr = document.createElement("tr");
//			td = document.createElement("td");
//			text = ct;
//			td.append(text);
//			tr.append(td);
//			i.append(tr);
//			ct++;
//		Object.keys(j["members"][a]).forEach(function(aa,bb,cc){
//			td = document.createElement("td");
//			
//		//	console.log(j[a][aa]);
//			if(aa=="area"){
//				text = document.createTextNode(j["members"][a]["phone"]);
//			}
//			else if(aa=="phone"){
//				text = document.createTextNode(j["members"][a]["area"]);
//			}
//			else{
//				text = document.createTextNode(j["members"][a][aa]);
//			}
//			
//			td.append(text);
//			tr.append(td);
//			
//		});
//			i.append(tr);
//	});
//	
	

}

function error(){
	alert("해당 파일을 로드 할 수 없습니다.")
	return false;
	
}
function java_get(mid){
	location.href='./first.do?mid='+mid;
}
