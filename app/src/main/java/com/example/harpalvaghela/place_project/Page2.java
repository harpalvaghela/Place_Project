package com.example.harpalvaghela.place_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    WebView webid;
    String str1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        webid=(WebView)findViewById(R.id.webid);
        //_______________________________________________________________________________________
        webid.clearCache(true);
        webid.clearHistory();
        webid.getSettings().setJavaScriptEnabled(true);
        webid.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        //______________________________________________________________________________________
        Intent i=getIntent();
        str1=i.getStringExtra("id1");
        //______________________________________________________________________________________


        if(str1.toString().equals("school"))  {
            //Toast.makeText(this, "school", Toast.LENGTH_SHORT).show();
            webid.loadUrl("https://www.google.co.in/maps/search/schools+in+Vadodara,+Gujarat/@22.2914465,73.0232171,13z/data=!3m1!4b1");
        }
        //_________________________________________________________________________________
        if(str1.toString().equals("police")){
            //Toast.makeText(this, "police", Toast.LENGTH_SHORT).show();
            webid.loadUrl("https://www.google.co.in/maps/search/police+near+Vadodara,+Gujarat,+IN/@22.2913826,72.9181474,11z/data=!3m1!4b1");
        }
        //_________________________________________________________________________________
        if(str1.toString().equals("hospital")){
            //Toast.makeText(this, "Hospitals", Toast.LENGTH_SHORT).show();
            webid.loadUrl("https://www.google.co.in/maps/search/hospitals+in+++Vadodara,+Gujarat,+IN/@22.3158566,73.1414573,13z/data=!3m1!4b1   ");
        }
        //_________________________________________________________________________________
        if(str1.toString().equals("google"))
        {
            //Toast.makeText(this, "Google", Toast.LENGTH_SHORT).show();
            webid.loadUrl("https://www.google.co.in/");
        }
        //_________________________________________________________________________________
    }
}
