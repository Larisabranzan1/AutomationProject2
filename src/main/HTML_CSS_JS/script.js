function clickMe() {
   var var1 = "abc";
   var var2 = 5;
   var var3 = false;
   //alert("Hello!!");
   readInputText();

}

function readInputText() {
    var usernameText = document.getElementById("username").value;
    //alert(usernameText);
    document.getElementById("result").innerHTML = "the username is " + usernameText;

    if (usernameText.length > 10) {
        alert("The max size of 10 has been exceeded");
        document.getElementById("username").style.color="red";
    }
}


function validate()

{
var username = document.getElementById("username");
var password = document.getElementById("pass");

if (username.value.trim() =="" ||password.value.trim
()=="")
{
 alert("No blank values allowed);
 return false;
 }
else
{
true;
}
}

