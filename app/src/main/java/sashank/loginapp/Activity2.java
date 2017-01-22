package sashank.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent i=getIntent();
        String message=i.getStringExtra("EXTRA_MESSAGE");

        TextView user=(TextView) findViewById(R.id.value);
        user.setText(message);
    }
}
