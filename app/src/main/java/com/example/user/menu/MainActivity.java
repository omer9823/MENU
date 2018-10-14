package com.example.user.menu;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout LL;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu (Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);

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
        return true;
    }


    public void omer1 (View view) {

        Intent t = new Intent(this, Main2Activity.class);
        startActivity(t);
    }



}
