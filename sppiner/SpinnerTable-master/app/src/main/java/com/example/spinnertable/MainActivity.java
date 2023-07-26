package com.example.spinnertable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    String[] food = { "Select Here","Indian", "Italian", "Chinese", "Continental", "Other"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it




        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,food);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner

        spin.setAdapter(aa);



    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int pos, long id)
    {
        Toast.makeText(getApplicationContext(),food[pos] , Toast.LENGTH_LONG).show();
        Toast.makeText(arg0.getContext(), "You Select : " + arg0.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
        switch(pos)
        {
            case 0:
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Indian.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Italian.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Chinese.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, Contenental.class));
                break;
            case 5:
                startActivity(new Intent(MainActivity.this, Others.class));
                break;
             default:
                 break;


        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0)
    {
        // TODO Auto-generated method stub
    }

}
