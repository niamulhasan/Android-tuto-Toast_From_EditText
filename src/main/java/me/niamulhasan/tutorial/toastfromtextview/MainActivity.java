package me.niamulhasan.tutorial.toastfromtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
