package com.se.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TabLayout tablayout;
    Animation animation;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.image_view);
        tablayout=findViewById(R.id.tablayout);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.myanimation);
        imageView.startAnimation(animation);
        tablayout.addTab(tablayout.newTab().setText("Page 1"));
        tablayout.addTab(tablayout.newTab().setText("Page 2"));
        tablayout.addTab(tablayout.newTab().setText("Page 3"));
        tablayout.setTabGravity(TabLayout.GRAVITY_FILL);
        viewPager=findViewById(R.id.viewpager);
        TabLayoutAdapter tabLayoutAdapter=new TabLayoutAdapter(getSupportFragmentManager(),tablayout.getTabCount());
        viewPager.setAdapter(tabLayoutAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));
        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                imageView.startAnimation(animation);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });





    }
}