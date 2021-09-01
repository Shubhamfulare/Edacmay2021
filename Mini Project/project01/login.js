const toggleForm = () => {
  const container = document.querySelector(".container");
  const section = document.querySelector("section");

  if (container.classList.contains("active")) {
    container.classList.remove("active");
    section.setAttribute("style", "background-color: #fee648");
    return;
  }
  container.classList.add("active");
  section.setAttribute("style", "background-color: //#region ");
};

const toggleLinks = Array.from(document.querySelectorAll(".signup a"));

toggleLinks.forEach((toggleLink) => {
  toggleLink.addEventListener("click", toggleForm);
});



function validate() {

  var fullname = document.getElementById("fullname");
  var gender = document.getElementById("gender");
  var mobilenumber = document.getElementById("mobilenumber");
  var email = document.getElementById("email");
  var username = document.getElementById("username"); 
  var createpassword = document.getElementById("createpassword"); 
  var confirmpassword = document.getElementById("confirmpassword"); 

/// for full name

  var fullnamecheck = document.getElementById("fullname").value; 
  var regexfullname =/^[A-Za-z]{3,15}$/;

  /// for gender

  var gendercheck=document.getElementById('gender').value;
  var regexgender=/^[A-Za-z]{1,10}$/;

  ///for mobile no. specification

  var mobilenocheck = document.getElementById("mobilenumber").value; 
  var regexmobile =/^[6-9][0-9]{9}$/;

  ///for Emailid specification

  var emailidcheck = document.getElementById("email").value; 
  var regexemailid =/^([a-zA-Z0-9\.-]+)@([a-zA-Z0-9]+)\.([a-z]{2,20})$/;

  ///for password specification

  var passwordcheck = document.getElementById("createpassword").value; 
  var regexpassword =/^[A-Za-z0-9@!]{5,10}$/;

  if (fullname.value.trim() == "") {
    //alert("Blank fullname");
    fullname.style.border = "solid 2px red";
    document.getElementById("label1").style.visibility = "visible";
    return false;
  }
  else if (regexfullname.test(fullnamecheck)==false) {
    //alert("Password is not match specification");
    fullname.style.border = "solid 2px red";
    document.getElementById("label1").style.visibility ="visible";
    document.getElementById("label1").innerHTML = "***Enter valid Full name";
    return false;
  }
  else if (gender.value.trim() == "") {
    //alert("Blank fullname");
    gender.style.border = "solid 2px red";
    document.getElementById("label2").style.visibility = "visible";
    return false;
  }
  else if (regexgender.test(gendercheck)==false) {
    //alert("Password is not match specification");
    gender.style.border = "solid 2px red";
    document.getElementById("label2").style.visibility ="visible";
    document.getElementById("label2").innerHTML = "***Enter valid gender";
    return false;
  }
  else if (!(gendercheck.value!="Male" || gendercheck.value!= "Female")) {
    //alert("Password is not match specification");
    gender.style.border = "solid 2px red";
    document.getElementById("label2").style.visibility ="visible";
    document.getElementById("label2").innerHTML = "***Enter gender Male or Female";
    return false;
  }

  else if (mobilenumber.value.trim() == "") {
    //alert("Blank password");
    mobilenumber.style.border = "solid 2px red";
    document.getElementById("label3").style.visibility = "visible";
    return false;

  } 
  else if (regexmobile.test(mobilenocheck)==false) {
    //alert("Invalid Mobile no");
    mobilenumber.style.border = "solid 2px red";
    document.getElementById("label3").style.visibility ="visible";
    document.getElementById("label3").innerHTML = "***Invalid Mobile no.";
    return false;

  }
  else if (email.value.trim() == "") {
    //alert("Blank password");
    email.style.border = "solid 2px red";
    document.getElementById("label4").style.visibility = "visible";
    return false;

  } 
  else if (regexemailid.test(emailidcheck)==false) {
    //alert("Invalid Email id");
    email.style.border = "solid 2px red";
    document.getElementById("label4").style.visibility ="visible";
    document.getElementById("label4").innerHTML = "***Invalid Email ID";
    return false;

  }
  else if (username.value.trim() == "") {
    //alert("Blank Username");
    username.style.border = "solid 2px red";
    document.getElementById("label5").style.visibility = "visible";
    return false;


  } else if (createpassword.value.trim() == "") {
    //alert("Blank password");
    createpassword.style.border = "solid 2px red";
    document.getElementById("label6").style.visibility = "visible";
    return false;


  } else if (createpassword.value.trim().length < 5) {
    //alert("Password is too short");
    createpassword.style.border = "solid 2px red";
    document.getElementById("label6").style.visibility ="visible";
    document.getElementById("label6").innerHTML = "***Password is short";
    return false;

  } else if (regexpassword.test(passwordcheck)==false) {
    
    createpassword.style.border = "solid 2px red";
    document.getElementById("label6").style.visibility ="visible";
    document.getElementById("label6").innerHTML = "***Enter valid password";
    return false;

  }
  else if (confirmpassword.value.trim() == "") {
    
    username.style.border = "solid 2px red";
    document.getElementById("label7").style.visibility = "visible";
    return false;

  }
  else if (!(confirmpassword.value == createpassword.value )) {
    
    confirmpassword.style.border = "solid 2px red";
    document.getElementById("label7").style.visibility ="visible";
    document.getElementById("label7").innerHTML = "***Password not matched";
    return false;
  }
  else
  {
    return true;
  }
}
