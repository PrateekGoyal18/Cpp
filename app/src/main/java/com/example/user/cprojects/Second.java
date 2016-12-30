package com.example.user.cprojects;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Second extends AppCompatActivity {

    TextView tv;
    String e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

         tv=(TextView)findViewById(R.id.t1);
        getdata();
    }

    private void getdata() {
        try {
            Intent intent=getIntent();
            e1=intent.getStringExtra("e1");
            AssetManager am = getAssets();
            InputStream is = am.open(e1);
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String str="";
            StringBuilder sb=new StringBuilder();
            while ((str=br.readLine())!=null){
                sb.append(str+"\n");
            }
            tv.setText(sb.toString());
            br.close();

        }catch (Exception ex){tv.setText(ex.toString());
        }
    }
}
