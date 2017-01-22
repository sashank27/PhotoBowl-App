package sashank.loginapp;

import android.content.Intent;
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

    public void onClick(View v)
    {
        EditText user= (EditText) findViewById(R.id.user);
        EditText pass = (EditText) findViewById(R.id.pass);

        String p=pass.getText().toString();
        if(p.equalsIgnoreCase("hello"))
        {
            Intent i=new Intent(this,Activity2.class);
            String u=user.getText().toString();
            i.putExtra("EXTRA_MESSAGE",u);
            startActivity(i);
        }
        else
        {
            Toast.makeText(MainActivity.this, "Wrong Password!!", Toast.LENGTH_SHORT).show();
        }
    }
}
