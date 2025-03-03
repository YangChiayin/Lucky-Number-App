package com.example.chiayin_yang_assignment1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView luckyNumberHeader = findViewById(R.id.luckyNumberHeader);
        TextView luckyNumberDisplay = findViewById(R.id.luckyNumberDisplay);
        Button shareButton = findViewById(R.id.shareButton);

//        Get data from Intent
        String userName = getIntent().getStringExtra("username");
        int luckyNumber = getIntent().getIntExtra("luckyNumber", 0);

//        Set lucky number details based on user input
        luckyNumberHeader.setText(userName + "'s Lucky Number");
        luckyNumberDisplay.setText(String.valueOf(luckyNumber));

//        Share button functionality
        shareButton.setOnClickListener(v -> {
            String shareText = userName + "'s lucky number is " + luckyNumber;
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
            startActivity(Intent.createChooser(shareIntent, "share via"));
        });
    }
}