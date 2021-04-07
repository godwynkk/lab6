/*
 * Name: Godwyn Akabogu
 * Course: CIS 3515
 * Lab: Lab 6 Translator
 * Date: 04/03/21
 * Due: 04/07/21
 * Summary: Create a app that french translate by changing the
 * language of the your virtual device from English to French.
 */
package edu.temple.carimageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        imageview = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        int[] carResIds = new int[]{R.drawable.chiron, R.drawable.huracan, R.drawable.laferrari,
                R.drawable.gtr, R.drawable.gt3, R.drawable.amg};

        Intent intent = getIntent();

        String carName = intent.getStringExtra(SelectionActivity.EXTRA_NAME);
        int position = intent.getIntExtra(SelectionActivity.EXTRA_NUMBER, 0);

        textView.setText(carName);
        imageview.setImageResource(carResIds[position]);
    }
}