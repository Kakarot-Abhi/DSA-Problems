console.log("Hello");

const url = "http://localhost:8080/addTemplate"

var outerPackage = document.getElementById("outerPackage");
var problemName = document.getElementById("problemName");
var javaFileName = document.getElementById("javaFileName");
var methodName = document.getElementById("methodName");
var methodReturnType = document.getElementById("methodReturnType");
var methodReturnStatement = document.getElementById("methodReturnStatement");

var methodArguments = document.getElementById("methodArguments");
var problemStatement = document.getElementById("problemStatement");



function createTemplate()
{

let data = {
               "methodReturnType": document.getElementById("methodReturnType").value,
               "methodReturnStatement": document.getElementById("methodReturnStatement").value,
               "initialPackage": document.getElementById("outerPackage").value,
               "methodName": document.getElementById("methodName").value,
               "mainFileName": document.getElementById("javaFileName").value,
               "problemStatementQuestion": document.getElementById("problemStatement").value,
               "problemName": document.getElementById("problemName").value,
               "methodAllArgs": document.getElementById("methodArguments").value
           };

fetch(url, {
    method: 'POST',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    },
    body: JSON.stringify(data)
})
.then(response => response.json())
.then(response => console.log(JSON.stringify(response)))
}
