package com.prarthana.projectajanone;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

     float v=0;
     String email,password;

     EditText emailLogin,passwordLogin;
     String string_emailLogin,string_passwordLogin;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tag_fragment,container,false);

        emailLogin = (EditText) root.findViewById(R.id.email_Login);
        passwordLogin = (EditText) root.findViewById(R.id.password_Login);
        Button buttonLogin = (Button) root.findViewById(R.id.buttonLogin);
        TextView forgetPasswordLogin= (TextView) root.findViewById(R.id.forgetPasswordLogin);


//******trail of sending data through bundle so in other class getvalidate will get done for both
//        registration and login ****/

//        buttonLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                    Intent intent = new Intent(getContext(),FieldValidation.class);
//
//                    Bundle bundle = new Bundle();
//                    bundle.putString("Email", String.valueOf(emailLogin));
//                    bundle.putString("Password", String.valueOf(passwordLogin));
//
//                    intent.putExtras(bundle);
//                    startActivity(intent);
//
//            }
//        }); 



        final Pattern PASSWORD_PATTERN =
                Pattern.compile("^" +
                        //"(?=.*[0-9])" +         //at least 1 digit
                        //"(?=.*[a-z])" +         //at least 1 lower case letter
                        //"(?=.*[A-Z])" +         //at least 1 upper case letter
                        "(?=.*[a-zA-Z])" +      //any letter
                        "(?=.*[@#$%^&+=])" +    //at least 1 special character
                        "(?=\\S+$)" +           //no white spaces
                        ".{4,}" +               //at least 4 characters
                        "$");

       buttonLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


               if(!validate_emailLogin() | !validate_passwordLogin()){
                   Toast.makeText(getContext(),"Please check entered details...",Toast.LENGTH_LONG).show();
               }else{
                   Toast.makeText(getContext(), "Login Success..", Toast.LENGTH_SHORT).show();
               }


           }
           private boolean validate_emailLogin() {

               string_emailLogin = emailLogin.getText().toString();
               if(string_emailLogin.isEmpty()){
//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn(findViewById(R.id.emailLogin));
                   emailLogin.setError("Field can't be empty");
                   return false;
               }else if(!Patterns.EMAIL_ADDRESS.matcher(string_emailLogin).matches()){
//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn(findViewById(R.id.emailLogin));
                   emailLogin.setError("Please enter a valid email address");
                   return false;
               } else {
                   emailLogin.setError(null);
                   return true;
               }

           }

           private boolean validate_passwordLogin() {
               string_passwordLogin = passwordLogin.getText().toString();

               if(string_passwordLogin.isEmpty()){

                 //  /**field will get shake **/ //
//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn(findViewById(R.id.passwordLogin));

                   passwordLogin.setError("Field can't be empty!");
                   return false;
               }
               else if (!PASSWORD_PATTERN.matcher(string_passwordLogin).matches()){
//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn(findViewById(R.id.passwordLogin));
                   passwordLogin.setError("Password too weak..");
                   return false;
               }
               else{
                   passwordLogin.setError(null);
                   return true;
               }

           }
       });

        emailLogin.setTranslationY(300);
        passwordLogin.setTranslationY(300);
        forgetPasswordLogin.setTranslationY(300);
        buttonLogin.setTranslationY(300);


        emailLogin.setAlpha(v);
        passwordLogin.setAlpha(v);
        forgetPasswordLogin.setAlpha(v);
        buttonLogin.setAlpha(v);


        emailLogin.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        passwordLogin.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        forgetPasswordLogin.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        buttonLogin.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1000).start();

        return root;
    }

}
