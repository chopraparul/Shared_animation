package com.example.parulchopra.shared_animation;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView I1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        I1=(ImageView)findViewById(R.id.ivProfile);
        Intent intent = new Intent(this, Detail_activity.class);
// Pass data object in the bundle and populate details activity.
       // intent.putExtra(Detail_activity.EXTRA_CONTACT, contact);
        ActivityOptionsCompat options = ActivityOptionsCompat.
                makeSceneTransitionAnimation(this, (View)I1, "profile");
        startActivity(intent, options.toBundle());
    }
}
