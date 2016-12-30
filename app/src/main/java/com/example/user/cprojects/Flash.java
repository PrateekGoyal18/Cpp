package com.example.user.cprojects;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ViewFlipper;

public class Flash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       // ViewFlipper flipper=(ViewFlipper)findViewById(R.id.viewFlipper);
        //flipper.startFlipping();

        Thread timer=new Thread()
        {
            public void run()
            {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                finally
                {

                    //              Toast.makeText(getApplicationContext(), " WELCOME ", Toast.LENGTH_LONG).show();
                    Intent i= new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }
            }


        };
        timer.start();
    }
    protected void onPause() {
        // TODO Auto-generated method stub
        finish();
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_flash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
      /* int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

    /*<ViewFlipper
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="200dp"
        android:layout_marginLeft="75dp"
        android:inAnimation="@anim/slide_in_right"
        android:outAnimation="@anim/slide_in_left"
        android:id="@+id/viewFlipper">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/image1"
            android:id="@+id/image1"/>
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/image2"
            android:id="@+id/image2"/>
        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/image3"
            android:id="@+id/image3"/>
        </ViewFlipper>*/

        return super.onOptionsItemSelected(item);
    }
}
