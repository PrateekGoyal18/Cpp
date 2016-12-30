package com.example.user.cprojects;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView t1;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        t1 = (TextView)findViewById(R.id.t1);
        lv=(ListView)findViewById(R.id.l1);
        lv.setBackgroundResource(R.drawable.customshape);

        String[] values = new String[] {
                "AIR Reservation System",
                "ATM Machine System",
                "Automobile",
                "Bank Management System",
                "Banking",
                "Calculator",
                "Scientific Calculator and Conversions",
                "Car Parking System",
                "Casino game",
                "Criminal Record System",
                "Cyber Cafe System",
                "Dictonary",
                "Dictonary",
                "Election System",
                "Examination System",
                "Fee Record System",
                "Hangman Turbo C++",
                "Hotel",
                "Hotel Management System",
                "Library Management",
                "Library Management System",
                "Net Shopping",
                "Optics",
                "Payroll Management System"
             } ;
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1 ,values);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(MainActivity.this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent;
        String s;

       switch (i)
       {
           case 0: s="airreservation.txt";
                   intent=new Intent(getApplicationContext(),Second.class);
                   intent.putExtra("e1",s);
                   startActivity(intent);
                   break;
           case 1: s="atm.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 2: s="automobi.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 3: s="bank_management_system.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 4: s="banking.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 5: s="cal.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 6: s="calci.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 7: s="carpark.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 8: s="casino_game.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 9: s="criminal.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 10: s="cyber.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 11: s="dic.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 12: s="dictiona.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 13: s="election.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 14: s="examination.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 15: s="fee.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 16: s="hangman_turbo_cplusplus.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 17: s="hotel.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 18: s="hotel_management.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 19: s="library_management.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 20: s="library_management_system_project.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 21: s="net_shopping.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 22: s="optics.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           case 23: s="=payroll_management_system.txt";
               intent=new Intent(getApplicationContext(),Second.class);
               intent.putExtra("e1",s);
               startActivity(intent);
               break;
           default:
                   Toast.makeText(getApplicationContext(),"Unexpected error has occured!!!",Toast.LENGTH_LONG).show();
                   break;
       }
    }
}
