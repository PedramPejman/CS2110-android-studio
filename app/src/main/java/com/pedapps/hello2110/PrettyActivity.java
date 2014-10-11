package com.pedapps.hello2110;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class PrettyActivity extends Activity {
    Button submit_button;
    TextView hello_world_text;
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Do all the setup associated with the Activity class
        setContentView(R.layout.activity_pretty); //Set our view to activity_hello.xml
        setUpLayout(); //Set up the layout
    }

    /*
    Connect to the Button and TextView in the Layout (activity_hello.xml)
     */
    public void setUpLayout() {
        submit_button = (Button) findViewById(R.id.send_button);
        hello_world_text = (TextView) findViewById(R.id.hello_text);
        layout = (RelativeLayout) findViewById(R.id.pretty_layout);
        /*
        We have seen the first 2 assignments before. The third one is assigning layout variable
        to the layout with the id pretty_layout. If you look in activity_pretty.xml, we declare this
        attribute by saying android:id = "pretty_layout" while declaring the RelativeLayout element.
         */
        layout.setBackground(getResources().getDrawable(R.drawable.background));
        /*
        Again, nothing hard going on.
        getResources() gives us access to our res folder.
        getDrawable() gives us access to the drawable folder inside the res folder.
        R.drawable.background is the drawable inside res/drawable that we want.
        layout.setBackground() sets the background of the current activity. (Terminology not 100%
        technically correct, but I think it makes the point more clearly).
         */
    }


}
