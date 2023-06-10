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





function validateForm() {
  var x = document.registration.username.value;
  var y = document.registration.pass.value;
  var z = document.registration.passrepeat.value;
  var m = document.registration.txtarea1.value;
  var n = document.registration.email.value;
  var atposition = n.indexOf("@");
  var dotposition = n.lastIndexOf(".");

  if (x.length < 6) {
    alert("Username should be a minimum of 6 characters");
    return false;
  } else if (y.length < 8) {
    alert("Password should be a minimum of 8 characters");
    return false;
  } else if (y !== z) {
    alert("Passwords did not match");
    return false;
  } else if (m.trim() === "") {
    alert("Please enter an address");
    return false;
  } else if (atposition < 1 || dotposition < atposition + 2 || dotposition + 2 >= n.length) {
    alert("Please enter a valid email address");
    return false;
  }

  return true;
  }


// below code did not work, I will need some clarifications on it
  function validate() {
  var username = document.getElementById("username").value;
  var password = document.getElementById("pass").value;

  if (username.trim() === "" || password.trim() === "") {
    alert("No blank values allowed");
    return false;
  } else {
    return true;
  }
}
