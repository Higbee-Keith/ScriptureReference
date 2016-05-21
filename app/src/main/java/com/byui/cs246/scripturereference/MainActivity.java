package com.byui.cs246.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.byui.cs246.scripturereference.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Share button */
    public void shareScripture(View view) {
        Intent intent = new Intent(this, DisplayScriptureActivity.class);
        EditText editTextBook = (EditText) findViewById(R.id.etxtBook);
        EditText editTextChapter = (EditText) findViewById(R.id.etxtChapter);
        EditText editTextVerse = (EditText) findViewById(R.id.etxtVerse);

        String scripture = "Your favorite scripture is: " +
                editTextBook.getText().toString() + " " +
                editTextChapter.getText().toString() + ":" +
                editTextVerse.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, scripture);

        startActivity(intent);
    }
}
