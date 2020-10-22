package com.prarthana.projectajanone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import static android.graphics.Color.alpha;


public class LoginActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton facebook,googlelogo,linkedin;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tabLayout = findViewById(R.id.tab_Layout);
        viewPager = findViewById(R.id.view_pager);
        facebook  = findViewById(R.id.fab_facebook);
        googlelogo = findViewById(R.id.fab_google);
        linkedin = findViewById(R.id.fab_linkedin);

        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("SignUp"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final LoginAdopter adopter = new LoginAdopter(getSupportFragmentManager(),this,tabLayout.getTabCount());
        viewPager.setAdapter(adopter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        facebook.setTranslationY(300);
        googlelogo.setTranslationY(300);
        linkedin.setTranslationY(300);
        tabLayout.setTranslationY(300);

        facebook.setAlpha(v);
        googlelogo.setAlpha(v);
        linkedin.setAlpha(v);
        tabLayout.setAlpha(v);

        facebook.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        googlelogo.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        linkedin.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(100).start();
    }
}