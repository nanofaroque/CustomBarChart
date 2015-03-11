package chart.bar.custom.allstate.com.custombarchart;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    ArrayList<Data> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //CustomBarChart customBarChart=new CustomBarChart(this);
        //setContentView(customBarChart);
        dataList=new ArrayList<>();
        dataList.add(new Data("$150",50,40,60,"MON"));
        dataList.add(new Data("$110",70,20,20,"TUE"));
        dataList.add(new Data("$160",60,60,40,"WED"));
        dataList.add(new Data("$160",20,50,90,"THU"));
        dataList.add(new Data("$150",50,40,60,"FRI"));
        dataList.add(new Data("$120",90,20,10,"SAT"));
        dataList.add(new Data("$80",50,20,10,"SUN"));


        setContentView(R.layout.activity_main);
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.linearLayout);
        linearLayout.addView(new CustomBarChart(this,dataList));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
