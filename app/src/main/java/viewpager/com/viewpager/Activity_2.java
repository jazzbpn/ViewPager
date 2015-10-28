package viewpager.com.viewpager;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import viewpager.com.viewpager.utils.MyApp_utils;

public class Activity_2 extends ActionBarActivity {

    String[] name = {"a" , "b" , "c" , "d" , "e" , "a" , "b" , "c" , "d" , "e" , "a" , "b" , "c" , "d" , "e" , "a" , "b" , "c" , "d" , "e" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_2);
        ListView lv = (ListView) findViewById(R.id.listViewAct);
        lv.setAdapter(new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , name));
        MyApp_utils.setListViewHeightBasedOnChildren(lv);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}