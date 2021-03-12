package com.example.group8_age;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Pname = (EditText) findViewById(R.id.Pname);
        EditText Lname = (EditText) findViewById(R.id.Lname);
        EditText Page = (EditText) findViewById(R.id.Page);
        TextView textView1 = (TextView)findViewById(R.id.textView1);

        int Numage = Integer.parseInt(Page.getText().toString());
        String Pname1 = Pname.getText().toString();
        String Lname1 = Lname.getText().toString();

        String user = Page.getText().toString().trim();
        int yr = Calendar.getInstance().get(Calendar.YEAR);
        int myage = yr -Integer.parseInt(user);

        if (myage < 18){
            textView1.setText(Pname1 +" "+ Lname1+" "+ myage + " Cant vote");

        }else {
            textView1.setText(Pname1 +" "+ Lname1+" "+ myage + " Can vote");
        }
    }
}
