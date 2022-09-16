package com.db.imagechanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int countWallpaperIndex = 0;
    ImageView iv;

    public void changeWallpaper(View view){
        iv = findViewById(R.id.appWallpaper);
        if(countWallpaperIndex == 0) {
            iv.setImageResource(R.drawable.doraemon_wallpaper_2);
            countWallpaperIndex++;
        }
        else{
            iv.setImageResource(R.drawable.doraemon_wallpaper);
            countWallpaperIndex--;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}