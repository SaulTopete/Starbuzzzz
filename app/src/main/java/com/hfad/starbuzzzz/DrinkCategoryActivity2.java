package com.hfad.starbuzzzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class DrinkCategoryActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        AdapterView.OnClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id){
                if(position == 0){
                    Intent intent = new Intent(TopLevelActivty1.this, DrinkCategoryActivity2.class);
                    startActivity(intent);
                }
            }
        };
    }


}
