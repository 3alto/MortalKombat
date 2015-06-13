package com.example.bryan_000.mortalkombat;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URI;


public class CharacterSelection extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);

        final EditText edit_text = (EditText)findViewById(R.id.editTexts);


        final TextView text_view = (TextView)findViewById(R.id.textViewBox);


        Button aButton = (Button)findViewById(R.id.sendButton);
        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = edit_text.getText().toString();
                sendTexts(text_view, userName);

            }



        });









    }


public void sendTexts(TextView text_view, String value)
{
    text_view.setText(value);
}




/*      this is an example of an implicit intent, opening google maps/google earth
    public void mapButtonClick(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo: "));
                //note that here i need a choose, because a chooser will stop my app from crashing if the package manager can't find a component for me to use.
                Intent chooser = Intent.createChooser(intent, "map launches");
        startActivity(chooser);
    }

*/






































    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_character_selection, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
