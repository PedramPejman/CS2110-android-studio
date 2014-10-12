package com.pedapps.hello2110;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class IntroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Do all the setup associated with the Activity class
        setContentView(R.layout.activity_intro); //Set our view to activity_pretty.xml
    }

    public void launchHelloActivity(View view) {
        Intent intent = new Intent(this, HelloActivity.class);
        startActivity(intent);
    }

    public void launchPrettyActivity(View view) {
        Intent intent = new Intent(this, PrettyActivity.class);
        startActivity(intent);
    }

    /*
    Everything past this point can be ignored.
    It is auto-generated code that comes with any class that extends the Activity class.
    In fact, you can erase it if you want and nothing will happen - In fact you will see that
    I have deleted in both other Activity files.
 */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.intro, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
