package com.ntu_63133567;


import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = findViewById(R.id.imageView);
        img.setImageResource(R.mipmap.avt);
    }
}