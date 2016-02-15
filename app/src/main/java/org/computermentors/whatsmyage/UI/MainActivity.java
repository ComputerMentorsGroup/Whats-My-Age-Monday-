package org.computermentors.whatsmyage.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.computermentors.whatsmyage.BackEnd.Calculate;
import org.computermentors.whatsmyage.R;

public class MainActivity extends AppCompatActivity {

    private Calculate mCalculate = new Calculate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
