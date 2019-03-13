package me.niamulhasan.tutorial.toastfromtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method will called on clicking on the Button. Set in the xml file
    public void showToast(View view){
        EditText editText = (EditText) findViewById(R.id.editText);     //Setting up variable for the editText
        String message = editText.getText().toString();                 //Getting the value from the editText

        Toast.makeText(this, message, Toast.LENGTH_LONG).show(); //Making the toast with the value

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);


    }
}
