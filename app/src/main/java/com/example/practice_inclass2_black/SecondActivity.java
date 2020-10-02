package com.example.practice_inclass2_black;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Button btnSaveInfo;
    EditText name_country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond);
        //Hawk.init(this).build();

        btnSaveInfo = (Button) findViewById(R.id.save_second);
        name_country = (EditText) findViewById(R.id.name_country);
        
        btnSaveInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SaveByHawk("country",name_country);
                
                Intent returnIntent = new Intent();
                returnIntent.putExtra("result","result string");
                setResult(Activity.RESULT_OK,returnIntent);
                finish();

            }
        });
    }

//    private void SaveByHawk(String key){
//        Hawk.put(key);
//    }
//
//    private void SaveByHawk(String key){
//        return Hawk.get(key);
//    }

}