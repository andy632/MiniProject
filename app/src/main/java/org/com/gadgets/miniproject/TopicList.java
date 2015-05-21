package org.com.gadgets.miniproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class TopicList extends ActionBarActivity {

    ListView lv ;
    ArrayAdapter<String> adap ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_list);

        String key = getIntent().getExtras().getString("key");
        String test[] = getResources().getStringArray(R.array.inft);
//        lv = (ListView) findViewById(R.id.listView);
//        adap = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , test);
//        lv.setAdapter(adap);
//
//        Toast.makeText(getBaseContext() , key ,Toast.LENGTH_SHORT).show();

        lv = (ListView) findViewById(R.id.listView);


        if(key.equalsIgnoreCase("one")){

            String list[] = getResources().getStringArray(R.array.elecs);
            adap = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 ,
                    list
                    );
            lv.setAdapter(adap);
//            Toast.makeText(getBaseContext() , key ,Toast.LENGTH_SHORT).show();
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                }
            });
//
//
        }else if(key.equalsIgnoreCase( "two")){

            String list[] = getResources().getStringArray(R.array.extc);
            adap = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 ,
                    list
            );
            lv.setAdapter(adap);

        }else if(key.equalsIgnoreCase("three")){

            String list[] = getResources().getStringArray(R.array.inft);
            adap = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 ,
                    list
            );
            lv.setAdapter(adap);

        }else if(key.equalsIgnoreCase("four")){

            String list[] = getResources().getStringArray(R.array.comps);
            adap = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 ,
                    list
            );
            lv.setAdapter(adap);

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_topic_list, menu);
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
