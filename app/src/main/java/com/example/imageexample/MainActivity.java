package com.example.imageexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView telegrammImageView;
    private ImageView instagramImageView;
    private boolean isImageViewVisibly = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        rotationImageView();
    }

    private void rotationImageView() {
        telegrammImageView.animate().scaleY(0.5f).scaleX(0.5f).rotation(360).setDuration(3000);
    }

    private void initView() {
        telegrammImageView = findViewById(R.id.telegrammImageView);
        instagramImageView = findViewById(R.id.instagramImageView);
    }

    public void changeImageView(View view) {
        if (isImageViewVisibly) {
            telegrammImageView.animate().alpha(0).setDuration(3000);
            instagramImageView.animate().alpha(1).setDuration(3000);
            isImageViewVisibly = false;
        }else {
            telegrammImageView.animate().alpha(1).setDuration(3000);
            instagramImageView.animate().alpha(0).setDuration(3000);
            isImageViewVisibly = true;
        }
    }
}
