package com.oxygen.o2.test2;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public class Main3Activity extends AppCompatActivity {
//exit and enter transition . 1-add the code **** to active the transition in next activity. 2-add the code ** before "setContentView" in the next activity
    FloatingActionButton f;
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//the code **
            Slide slide = new Slide(Gravity.RIGHT);
            slide.setDuration(1000);
            getWindow().setEnterTransition(slide);

       //end the code **
        setContentView(R.layout.activity_main3);
        final Intent intent=new Intent(this,Main4Activity.class);
       // mRootView2=(ViewGroup)findViewById(R.id.lay3);
//        getWindow().setAllowEnterTransitionOverlap(false);
//        Slide slide=new Slide(Gravity.RIGHT);
//        getWindow().setReturnTransition(slide);
   f=(FloatingActionButton)findViewById(R.id.ff);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // the code ****
                Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(Main3Activity.this).toBundle();
              //  f.hide();
                startActivity(intent,bundle);
                //end the code ****
            }
        });

    }

}
