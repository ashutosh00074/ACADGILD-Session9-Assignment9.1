package com.tech.gigabyte.testing;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.tech.gigabyte.testing.R.id.optmenu;
import static com.tech.gigabyte.testing.R.id.optmenu0;
import static com.tech.gigabyte.testing.R.id.optmenu1;

//Base class for activities that use the support library action bar features.
public class MainActivity extends AppCompatActivity {
    TextView txtView;

    @Override

    //If the activity is being re-initialized after previously being shut down ,
    // then this Bundle contains the data it most recently supplied in onSaveInstanceState

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialization
        txtView = (TextView) findViewById(R.id.txtView);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);

        //Toolbar to set as the Activity's action bar, or null to clear it
        setSupportActionBar(mToolbar);
    }

    //The options menu in which we place our items.
    public boolean onCreateOptionsMenu(android.view.Menu menu) {

        //This class is used to instantiate menu XML files into Menu objects.
        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.optionmenu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    //The menu item that was selected.
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //Option Menu 1 = RED
            case R.id.optmenu:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                txtView.setTextColor(android.graphics.Color.RED);
                return true;

            //Option Menu 2 = GREEN
            case R.id.optmenu0:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                txtView.setTextColor(Color.GREEN);
                return true;

            //Option Menu 3 = BLUE
            case R.id.optmenu1:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                txtView.setTextColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
