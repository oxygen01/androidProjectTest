package com.oxygen.o2.test2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
View img;
    View floatingActionButton;
//shared element transotion : add transitionName to shared view component between two layouts and the the code ***  //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton=(FloatingActionButton)findViewById(R.id.bbb);
       final Intent intent = new Intent(this, Main2Activity.class);
       img=(ImageView)findViewById(R.id.imgg);

floatingActionButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
//the code ***
        Pair<View, String> p1 = Pair.create(floatingActionButton, "profile");
        Pair<View, String> p2 = Pair.create(img, "imgprofile");
         ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,p1,p2);
          //for one element
        //   ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,img,"imgprofile");
        ActivityCompat.startActivity(MainActivity.this, intent, options.toBundle());
        //end the code ***
    }
});
    }
    private void testt(){
        int i0=1+1;
    }
}
