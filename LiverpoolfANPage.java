package com.example.caozhenjie.myfirstandroidapp;



compile 'com.android.support:support-compat:24.2.1'
compile 'com.android.support:appcompat-v7:24.2.1'


import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class LiverpoolfANPage extends AppCompatActivity {
    TextView mTextView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liverpoolf_anpage);
        mTextView = (TextView) findViewById(R.id.text_message);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // For the main activity, make sure the app icon in the action bar
            // does not behave as a button
            ActionBar actionBar = getActionBar();
            actionBar.setHomeButtonEnabled(false);
        }

       /** public void onPause() {
            super.onPause();  // Always call the superclass method first

            // Release the Camera because we don't need it when paused
            // and other activities might need to use it.
            if (TextView != null) {
                TextView.release();
                TextView = null;
            }
        }
        **/

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        // Do something in response to button
    }

    private void setUpActionBar() {
        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            ActionBar actionBar = getActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
