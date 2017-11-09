package com.example.awesomefat.csc250_hw12_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
    }

    private String reverse(String s)
    {
        String answer = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
            answer = answer + s.charAt(i);
        }
        return answer;
    }

    public void onChangeButtonPressed(View v)
    {
        EditText inputET = (EditText)this.findViewById(R.id.inputET);
        EditText inputET2 = (EditText)this.findViewById(R.id.inputET2);
        TextView myLabel = (TextView)this.findViewById(R.id.myLabel);
        String reverse = this.reverse(inputET.getText().toString());
        String reverse2 = this.reverse(inputET2.getText().toString());
        myLabel.setText(reverse + reverse2);
    }

}
