package com.example.calculator;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum(View view)

    {
        EditText FirstName = (EditText)findViewById(R.id.jitin);
        EditText LastName =(EditText)findViewById(R.id.shivam);
        TextView toutput= (TextView)findViewById(R.id.view);
        toutput.setText("First Name: "+First.getText()+" Last Name: "+LastName.getText());

    }
}

