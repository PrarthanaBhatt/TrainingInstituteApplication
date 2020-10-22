package com.prarthana.projectajanone;

import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



import java.util.regex.Pattern;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    float v=0;

    EditText emailRegistration,passwordRegistration,mobileRegistration;
    String string_emailRegistration,string_passwordRegistration,string_mobileRegistration;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.registration_tag_fragment,container,false);


        emailRegistration = (EditText) root.findViewById(R.id.email_Registration);
        passwordRegistration = (EditText) root.findViewById(R.id.password_Registration);
        mobileRegistration = (EditText) root.findViewById(R.id.mobile_Registration);
        Button buttonRegistration = (Button) root.findViewById(R.id.button_Registration);

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

        buttonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!validate_emailRegistration() | !validate_passwordRegistration() | !validate_mobileRegistration()){
                    Toast.makeText(getContext(),"Please check entered details...",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getContext(), "Login Success..", Toast.LENGTH_SHORT).show();
                }
            }



            private boolean validate_emailRegistration() {
                string_emailRegistration = emailRegistration.getText().toString();
                if(string_emailRegistration.isEmpty()){

//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn(findViewById(R.id.emailRegistration));
                    emailRegistration.setError("Field can't be empty");
                    return false;
                }else if(!Patterns.EMAIL_ADDRESS.matcher(string_emailRegistration).matches()){
//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn(findViewById(R.id.emailRegistration));
                    emailRegistration.setError("Please enter a valid email address");
                    return false;
                } else {
                    emailRegistration.setError(null);
                    return true;
                }
            }

            private  boolean validate_passwordRegistration(){
                string_passwordRegistration = passwordRegistration.getText().toString();

                if(string_passwordRegistration.isEmpty()){
//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn((EditText)findViewById(R.id.mobileRegistration));
                    passwordRegistration.setError("Field can't be empty!");
                    return false;
                }
                else if (!PASSWORD_PATTERN.matcher(string_passwordRegistration).matches()){
//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn(findViewById(R.id.mobileRegistration));
                    passwordRegistration.setError("Password to weak..");
                    return false;
                }
                else{
                    passwordRegistration.setError(null);
                    return true;
                }
            }

            private boolean validate_mobileRegistration() {
                string_mobileRegistration = mobileRegistration.getText().toString();

                if(string_mobileRegistration.isEmpty()){
//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn((EditText)findViewById(R.id.mobileRegistration));
                    passwordRegistration.setError("Field can't be empty!");
                    return false;
                }
                else if (string_mobileRegistration.length() < 10){
//                   YoYo.YoYoString yoYoString = YoYo.with(Techniques.Tada)
//                           .duration(700)
//                           .repeat(5)
//                           .playOn(findViewById(R.id.mobileRegistration));
                    mobileRegistration.setError("Should be 10 digit..");
                    return false;
                }
                else{
                    passwordRegistration.setError(null);
                    return true;
                }
            }
        });
        emailRegistration.setTranslationY(300);
        passwordRegistration.setTranslationY(300);
        mobileRegistration.setTranslationY(300);
        buttonRegistration.setTranslationY(300);


        emailRegistration.setAlpha(v);
        passwordRegistration.setAlpha(v);
        mobileRegistration.setAlpha(v);
        buttonRegistration.setAlpha(v);


        emailRegistration.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        passwordRegistration.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        mobileRegistration.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        buttonRegistration.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1000).start();

        return root;
    }
}
