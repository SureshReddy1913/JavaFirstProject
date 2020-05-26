var d="";
var loginers=[];
var v=" ";
    function take_input_fun(a){
        d=d+a;
       document.getElementById("result").value=d;
    }
    function solve(){
       d=eval(d);
       document.getElementById("result").value=d;
    }
    function clear_fun(){
        d="";
        document.getElementById("result").value=d;
    }
    function gen_report(){
        loginers.push(document.getElementById("username").value);
        document.getElementById("username").value="";
        document.getElementById("password").value="";
    }
    function see_report()
    {
        var el="",i;
        for(i=0;i<loginers.length;i++)
        {
            el+="<tr><td>"+loginers[i]+"</td>";
        }
        document.getElementById("rep").style.display="block";
        document.getElementById("rep").innerHTML+=el;
    }