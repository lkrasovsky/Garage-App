package com.example.garage_app;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView humidityText = findViewById(R.id.humidityText);
        humidityText.setText(String.format(getString(R.string.humidity), 36));

        setupPowerButton();
    }

    private void setupPowerButton() {
        FrameLayout powerButton = findViewById(R.id.powerButton);
        ImageView powerImage = findViewById(R.id.powerImage);

        powerButton.setEnabled(false);

        powerImage.setOnClickListener(v -> {
            powerButton.setEnabled(!powerButton.isEnabled());

            if (powerButton.isEnabled()) {
                powerImage.setImageResource(R.drawable.ic_power_green);
            } else {
                powerImage.setImageResource(R.drawable.ic_power_gray);
            }
        });
    }
}