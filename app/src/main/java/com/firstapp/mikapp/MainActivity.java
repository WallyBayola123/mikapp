package com.firstapp.mikapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String[] mjLines = {
            "Hee-hee!",
            "Shamone!",
            "Annie, are you OK?",
            "Just beat it!",
            "Billie Jean is not my lover.",
            "I'm starting with the man in the mirror.",
            "Don't stop 'til you get enough.",
            "You've been hit by, you've been struck by, a smooth criminal.",
            "I'm bad, I'm bad, you know it.",
            "Thriller night!",
            "Aow!",
            "Remember the time?"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(mjLines.length);
                textView.setText(mjLines[index]);
            }
        });
    }
}
