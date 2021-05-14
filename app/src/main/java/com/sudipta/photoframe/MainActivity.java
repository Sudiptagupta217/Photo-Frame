package com.sudipta.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton prevBtn, nextBtn;
    ImageView pic;
    TextView nameTextView;
    int currentImage = 0;

    String[] name = {"Bheem", "Doremon", "Micky", "Panda", "Tom"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prevBtn = findViewById(R.id.prevButton);
        nextBtn = findViewById(R.id.nextButton);
        nameTextView = findViewById(R.id.nameTextView);
        nameTextView.setText(name[currentImage]);

    }

    //set previous button code
    public void prev(View view) {
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (5 + currentImage - 1) % 5;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

        nameTextView.setText(name[currentImage]);

    }

    public void next(View view) {
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 5;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

        nameTextView.setText(name[currentImage]);

    }
}