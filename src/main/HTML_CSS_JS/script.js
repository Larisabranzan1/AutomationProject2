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

function validateForm() {
let x = document.registration.username.value; // not sure why it doesn't work
let y = document.registration.password.value;
let z = document.registration.Repeat.value;
let m = document.registration.address.value;
let n = document.registration.email.value;
var atposition=n.indexOf("@");
var dotposition=n.lastIndexOf(".");
}
if (x.length<6){
alert("username should be minimum 6 characters");
return false;
}

else if(y.length<8{
alert("Password should be minimum eight characters");
return false;
}


function matchPassword() {
 var pw1 = document.getElementById("pass");
  var pw2 = document.getElementById("passrepeat");
  if(pw1 != pw2)
  {
    alert("Passwords did not match");
  } else {
    alert("Password created successfully");
  }
}