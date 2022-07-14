function callback(user) {
    var data_a = ["hong","park","kim","jang"];
    var w = 0;
    var result;
    var ok = false;
    while(w < data_a.length) {
        if(user==data_a[w]) {
            result = re1(w);
            console.log(user+"님 적림금은 "+result[1]+"이며, 등급은"+result[0]+"입니다.");
            ok=true;
            break;
        }
        w++;
    } 
    if(ok==false) {
        console.log("해당 사용자가 없습니다.");
    }
}