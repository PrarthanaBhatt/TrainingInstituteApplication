package com.prarthana.projectajanone;

import android.os.Bundle;
import android.util.Patterns;
import android.content.Intent;

import android.view.View;
import android.widget.Toast;

import java.util.regex.Pattern;

import androidx.appcompat.app.AppCompatActivity;

public class FieldValidation extends AppCompatActivity {

    String stringEmail,stringPassword;


    //get bundle data

    Bundle bundle = getIntent().getExtras();

//    stringEmail = bundle.getString("Email");
//    stringPassword = bundle.getString("Password");

//      stringEmail  = bundle.getString("Email");
//      stringPassword = bundle.getString("Password");



    //    final Pattern PASSWORD_PATTERN =
//            Pattern.compile("^" +
//                    //"(?=.*[0-9])" +         //at least 1 digit
//                    //"(?=.*[a-z])" +         //at least 1 lower case letter
//                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
//                    "(?=.*[a-zA-Z])" +      //any letter
//                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
//                    "(?=\\S+$)" +           //no white spaces
//                    ".{4,}" +               //at least 4 characters
//                    "$");
//    private boolean validate_email() {
//
//               string_email = email.getText().toString();
//               if(string_email.isEmpty()){

//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn(findViewById(R.id.emailLogin));
//                   email.setError("Field can't be empty");
//                   return false;
//               }else if(!Patterns.EMAIL_ADDRESS.matcher(string_email).matches()){
//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn(findViewById(R.id.emailLogin));
//                   email.setError("Please enter a valid email address");
//                   return false;
//               } else {
//                   email.setError(null);
//                   return true;
//               }

//           }
//
//           private boolean validate_passwordLogin() {
//               string_passwordLogin = passwordLogin.getText().toString();
//
//               if(string_passwordLogin.isEmpty()){
////                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
////                           .duration(700)
////                           .repeat(5)
////                           .playOn(findViewById(R.id.passwordLogin));
//                   passwordLogin.setError("Field can't be empty!");
//                   return false;
//               }
//               else if (!PASSWORD_PATTERN.matcher(string_passwordLogin).matches()){
////                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
////                           .duration(700)
////                           .repeat(5)
////                           .playOn(findViewById(R.id.passwordLogin));
//                   passwordLogin.setError("Password too weak..");
//                   return false;
//               }
//               else{
//                   passwordLogin.setError(null);
//                   return true;
//               }
//
//           }


    }
