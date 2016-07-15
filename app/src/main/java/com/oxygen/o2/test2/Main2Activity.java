package com.oxygen.o2.test2;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

public class Main2Activity extends AppCompatActivity {
FloatingActionButton floatingActionButton;
   // private ViewGroup mRootView;
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        floatingActionButton=(FloatingActionButton)findViewById(R.id.bbb2);
     //   mRootView=(ViewGroup)findViewById(R.id.lay2);
        final Intent intent=new Intent(this,Main3Activity.class);
       //   Explode slide=new Explode();

      //  getWindow().setExitTransition(slide);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(Main2Activity.this).toBundle();
                startActivity(intent,bundle);
                //startActivity(intent);

            }
        });
    }




}
