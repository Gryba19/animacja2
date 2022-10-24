package com.example.xmlanim;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    ImageView imageKostka;
    ImageView imageEagle;
    RadioButton alfa;
    RadioButton scale;
    RadioButton rotate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageKostka = findViewById(R.id.imageKostka);
        imageEagle = findViewById(R.id.imageEagle);
        alfa=findViewById(R.id.Alfa);
        scale=findViewById(R.id.Scale);
        rotate=findViewById(R.id.Rotate);
        startAnime();
    }
    /*
        private void startMove() {
            Animation out = new ScaleAnimation(1f,1.5f,1f,1.5f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            out.setDuration(4000);
            out.setRepeatCount(3);
            out.setFillAfter(true);
            imageEagle.startAnimation(out);
        }

        private void startAnime(){

            Animation out = new AlphaAnimation(1,0);
            out.setDuration(4000);
            //
            Animation in = new AlphaAnimation(0,1);
            in.setDuration(4000);

            out.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    Toast.makeText(MainActivity.this, "Animacja wystartowała", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onAnimationEnd(Animation animation) { imageKostka.startAnimation(in);

                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });
            in.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                }

                @Override
                public void onAnimationEnd(Animation animation) {imageKostka.startAnimation(out);

                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });
            imageKostka.startAnimation(out);
        }
        */
    private void startAnime(){

            Animation out = AnimationUtils.loadAnimation(this, R.anim.anim);
            imageKostka.startAnimation(out);

    }
}

//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