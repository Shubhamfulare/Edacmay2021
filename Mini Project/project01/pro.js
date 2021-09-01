function validation() {

    var firstname = document.getElementById('fname');
    var lastname = document.getElementById('lname');
    var password = document.getElementById('password');
    var cpassword = document.getElementById('cpassword');
    var mobile = document.getElementById('mobile');
    var edu = document.getElementById('edu');
    var email = document.getElementById('email');


    // regular expression
    var name=/^[0-9]{9}$/;
   // var regex = /^([_\-\.0-9a-zA-Z]+)@([_\-\.0-9a-zA-Z]+)\.([a-zA-Z]){2,7}$/;
    var regexmob = /^[7-9][0-9]{9}$/;
    var regexmail=/^([a-zA-Z0-9\.-]+)@([a-zA-Z0-9]+)\.([a-z]{2,20})$/;
   // var regexpassword = /^[A-Za-z]\w{7,14}$/;
    


    if (firstname.value.trim() == "" || (firstname.value.length < 3) || !isNaN(firstname.value)) {
        document.getElementById("name").innerHTML = "*invalid name"
        return false;
    

    } else if (lastname.value.trim() == "" || (lastname.value.length < 3) || !isNaN(firstname.value)) {
        document.getElementById("namelast").innerHTML = "*invalid name"
        return false;
    } else if (email.value.trim() == "" ||  regexmail.test(email.value)==false) {
        document.getElementById("emailerror").innerHTML = "*invalid email"
        return false;
    }else if (password.value.trim() == "" ) {
            document.getElementById("passerror").innerHTML = "*invalid password  "
            return false;
    } 
    else if (!(password.value.match(/[a-z]/g) && (password.value.match(/[A-Z]/g) && (password.value.match(/[0-9]/g))))) {
        document.getElementById("passerror").innerHTML = "*invalid password  "
        return false;
} 
    else if (password.value.trim() != cpassword.value.trim()) {
        document.getElementById("cpasserror").innerHTML = "*Password Missmatch"
        return false;
    }else if(mobile.value.trim()==""){
                document.getElementById("mobileerror").innerHTML = "*invalid Mobile Number"
                return false;
            }
    else if(mobile.value.length!=10){
                document.getElementById("mobileerror").innerHTML = "*invalid Mobile Number"
                return false;
    }        

    else {
        document.getElementById()
        return true;

    }






}



