package com.example.harpalvaghela.place_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    String str1="school",str2="police",str3="hospital",str4="google";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //________________________________________________________________________
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        //_____________________________________________________________________________
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Page2.class);
                i.putExtra("id1",str1);
                startActivity(i);
            }
        });
        //___________________________________________________________________
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Page2.class);
                i.putExtra("id1",str2);
                startActivity(i);


            }
        });
        //________________________________________________________________________

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,Page2.class);
                i.putExtra("id1",str3);
                startActivity(i);

            }
        });
        //________________________________________________________________________
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Page2.class);
                i.putExtra("id1",str4);
                startActivity(i);
            }
        });
    }
}
