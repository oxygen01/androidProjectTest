package com.oxygen.o2.test2;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import static com.oxygen.o2.test2.R.color.colorAccent;

public class Main4Activity extends AppCompatActivity {
ViewGroup viewGroup;
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTransition();
        setContentView(R.layout.activity_main4);
        viewGroup=(ViewGroup)findViewById(R.id.lay4);
        floatingActionButton=(FloatingActionButton)findViewById(R.id.bbb4);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.ZoomOut)
                        .duration(700)
                        .playOn(floatingActionButton);
                viewGroup.setBackgroundColor(getColor(colorAccent));
            }
        });
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void setTransition() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Explode slide = new Explode();
        slide.setDuration(1000);
        getWindow().setEnterTransition(slide);
        }
    }
}
