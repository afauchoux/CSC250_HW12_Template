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

    public String reverse()
    {
        String answer = "";
        for(int i = this.length()-1; i >= 0; i--)
        {
            answer = answer + this.charAt(i);
        }
        return answer;
    }

    public void onChangeButtonPressed(View v)
    {
        EditText inputET = (EditText)this.findViewById(R.id.inputET);
        EditText inputET2 = (EditText)this.findViewById(R.id.inputET2);
        String output1 = reverse(inputET);
        String output2 = reverse(inputET2);
        TextView myLabel = (TextView)this.findViewById(R.id.myLabel);
        myLabel.setText(output1 + output2);
    }

}
