package com.example.user.menu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {


    LinearLayout LL;
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public boolean onCreateOptionsMenu (Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);

        menu.add(0,0,250,"YELLOW");

        return true;
    }



    public boolean onOptionsItemSelected (MenuItem item){
        String st=item.getTitle().toString();
        if (st.equals("RED"))
            LL.setBackgroundColor(Color.RED);
        if (st.equals("BLUE"))
            LL.setBackgroundColor(Color.BLUE);
        if (st.equals("GREEN"))
            LL.setBackgroundColor(Color.GREEN);
        if (st.equals("YELLOW"))
            LL.setBackgroundColor(Color.YELLOW);
        return true;
    }



    public void omer2 (View view) {

        Intent k = new Intent(this, MainActivity.class);
        startActivity(k);


    }





}
