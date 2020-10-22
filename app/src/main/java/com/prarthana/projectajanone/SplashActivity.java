package com.prarthana.projectajanone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    ImageView splashView;
    TextView splashTextView;
   Animation topAnim,bottomAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        //animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

          splashView = findViewById(R.id.splashImg);
          splashTextView = findViewById(R.id.titleSplash);

          splashView.setAnimation(topAnim);
          splashTextView.setAnimation(bottomAnim);

          new Handler().postDelayed(new Runnable() {
              @Override
              public void run() {
                  Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                  startActivity(intent);
                  finish();
              }
          },SPLASH_SCREEN);















//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //assigning time, how much time it will be showed
//                //only sleep method added, then try and catch by selection
//                try {
////                    splashView.setTranslationY(300);
////                    splashTextView.setTranslationY(300);
////
////                    splashView.setAlpha(v);
////                    splashTextView.setAlpha(v);
////
////                    splashView.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
////                    splashTextView.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
//
//                    sleep(2000);
//
//                    //after this allocated time move to loginActivity
//                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
//                    startActivity(intent);
//
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        thread.start();
    }
}