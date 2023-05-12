package com.jeffoberlander.uithings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txt2);

    }
    public void animate(View view){
        textView.animate().rotationBy(120).start();
//        textView.animate().alpha(0).setDuration(1500);
        textView.animate().scaleY(1.2f).scaleX(1.2f).setDuration(500);
        textView.animate().translationX(300).start();
    }
}