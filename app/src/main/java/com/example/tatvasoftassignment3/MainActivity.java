package com.example.tatvasoftassignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etNum1,etNum2;
    TextView tvResult;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1=(EditText)findViewById(R.id.etNum1);
        etNum2=(EditText)findViewById(R.id.etNum2);
        tvResult=(TextView) findViewById(R.id.tvResult);
        btnAdd=(Button)findViewById(R.id.btnAdd);
    }

    public void btnAdd(View view) {

        // debugging using log and debugger
        int n1 = Integer.parseInt(etNum1.getText().toString());
        Log.i("debug", "Executed n1");
        int n2 = Integer.parseInt(etNum2.getText().toString());
        Log.i("debug", "Executed n2");
        int result = n1+n2;
        Log.i("debug", "Executed add operation");
        //tvResult.setText(result); //-----will not work
        tvResult.setText(result);
        Log.i("debug", "Executed program");
    }
}