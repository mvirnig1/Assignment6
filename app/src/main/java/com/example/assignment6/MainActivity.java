package com.example.assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button buttonText1;
    Button buttonText2;
    Button buttonText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtonClickEvents();
        setupButtonClickEvents2();
        setupButtonClickEvents3();
    }

    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for texting
         */
        setupButtonClickEvents();
        buttonText1 = (Button) findViewById(R.id.buttonText1);
        buttonText1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2183911863"));
                sendIntent.putExtra("sms_body", "Content of the SMS goes here...");
                startActivity(sendIntent);

            }
        });
    }

    private void setupButtonClickEvents2() {
        /**
         *   Set up button click event listener for texting
         */
        setupButtonClickEvents();
        buttonText2 = (Button) findViewById(R.id.buttonText2);
        buttonText2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2183911863"));
                sendIntent.putExtra("sms_body", "Content of the SMS goes here...");
                startActivity(sendIntent);

            }
        });
    }

    private void setupButtonClickEvents3() {
        /**
         *   Set up button click event listener for texting
         */
        setupButtonClickEvents();
        buttonText3 = (Button) findViewById(R.id.buttonText3);
        buttonText3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2183911863"));
                sendIntent.putExtra("sms_body", "Content of the SMS goes here...");
                startActivity(sendIntent);

            }
        });

    }
}
