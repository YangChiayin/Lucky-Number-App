package com.example.chiayin_yang_assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameInput = findViewById(R.id.nameInput);
        Button wishMeLuckButton = findViewById(R.id.wishMeLuckButton);

        wishMeLuckButton.setOnClickListener(v -> {
            String userName = nameInput.getText().toString();

            if(userName.isEmpty()) {
                Toast.makeText(MainActivity.this, "Please enter your name!", Toast.LENGTH_SHORT).show();
                return;
            }

//            Generate a 3 digit random number
            int luckyNumber = new Random().nextInt(900) + 100;

//            Start the second activity with Intent data
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("username", userName);
            intent.putExtra("luckyNumber", luckyNumber);
            startActivity(intent);
        });

    }
}