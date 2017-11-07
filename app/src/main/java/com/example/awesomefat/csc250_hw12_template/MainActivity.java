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

        //how Android implements MVC
        //lets this activity know which XML layout it should show
        this.setContentView(R.layout.activity_main);
    }

    //MVC expose this function to the interface builder
    public void onChangeButtonPressed(View v)
    {
        //v will be the widget that calls this function upon being clicked

        //MVC - linking interface widget to local variable
        EditText inputET = (EditText)this.findViewById(R.id.inputET);
        TextView myLabel = (TextView)this.findViewById(R.id.myLabel);
        myLabel.setText(inputET.getText().toString());
    }

}
