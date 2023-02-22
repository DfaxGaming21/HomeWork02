package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int account = 1000;
int additions = 2500;
int percent = 5;
int costTelescope = 14000;




    private int accumulated(){

        int number=0;
        int d=0;

        while (account<costTelescope) {


            account = account + additions;
            number++;

            d++;

            if(d==12){
                d=0;
                account = account + account/100*percent;}
        }


        return number;
    }
private TextView mouth;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mouth = findViewById(R.id.mouth);
        mouth.setText("Необходимо месяцев: "  + accumulated());

    }
}