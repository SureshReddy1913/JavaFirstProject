function calculate()
{
    var num1=document.getElementById("number1").value;
    var num2=document.getElementById("number2").value;
    var choice;
    if(document.getElementById("c1").checked){
        choice="+";
    }
    if(document.getElementById('c2').checked){
        choice="-";
    }
    if(document.getElementById('c3').checked){
        choice="*";
    }
    if(document.getElementById('c4').checked){
        choice="/";
    }
    var result=eval(num1+choice+num2);

    alert("answer is:- "+result);
    
}

var employees=[];

employees=[
    {
        id  : 1,
        name : "suresh",
        city : "Warangal"
    },
    {
        id  : 2,
        name : "ramesh",
        city : "Hanmakonda"
    },
    {
        id  : 3,
        name : "ganesh",
        city : "Bengaluru"
    },
    {
        id  : 4,
        name : "mahesh",
        city : "Hyderabad"
    },
    {
        id  : 5,
        name : "naresh",
        city : "Gurgaon"
    },
    {
        id  : 6,
        name : "lokesh",
        city : "Noida"
    },
]


function list_all_employees()
{
    var result="<table><thead><tr><th>id</th><th>name</th><th>city</th></tr></thead><tbody>";
    for(var i=0;i<employees.length;i++)
    {
        result+="<tr><td>"+employees[i].id+"</td><td>"+employees[i].name+"</td><td>"+employees[i].city+"</td></tr>";
    }
    result+="</tbody></table>";

    document.getElementById("result").innerHTML=result;

}

function search_for_employee()
{
    var result="<table><thead><tr><th>Id</th><th>Name</th><th>City</th></tr></thead><tbody>";
    var emp_name=document.getElementById("emp_name").value;
    for(var i=0;i<employees.length;i++)
    {
        if(employees[i].name==emp_name){
            result+="<tr><td>"+employees[i].id+"</td><td>"+employees[i].name+"</td><td>"+employees[i].city+"</td></tr>";
            break;
        }
    }
    result+="</tbody></table>";
    document.getElementById("result").innerHTML=result;
}