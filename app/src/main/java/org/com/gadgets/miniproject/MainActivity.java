package org.com.gadgets.miniproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends Activity {

    private AdView adview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adview = (AdView) findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        adview.loadAd(adRequest);

        Button branchinft = (Button) findViewById(R.id.inftbutton);
        Button branchcomp = (Button) findViewById(R.id.compbutton);
        Button branchelecs = (Button) findViewById(R.id.elecsbutton);
        Button branchextc = (Button) findViewById(R.id.extcbutton);

        branchcomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bd = new Bundle();
                bd.putString("key" , "two");
                Intent i = new Intent(MainActivity.this , TopicList.class);
                i.putExtras(bd);
                startActivity(i);
            }
        });

        branchinft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bd = new Bundle();
                bd.putString("key" , "one");
                Intent i = new Intent(MainActivity.this , TopicList.class);
                i.putExtras(bd);
                startActivity(i);
            }
        });

        branchextc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bd = new Bundle();
                bd.putString("key" , "three");
                Intent i = new Intent(MainActivity.this , TopicList.class);
                i.putExtras(bd);
                startActivity(i);
            }
        });

        branchelecs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bd = new Bundle();
                bd.putString("key" , "four");
                Intent i = new Intent(MainActivity.this , TopicList.class);
                i.putExtras(bd);
                startActivity(i);
            }
        });

//        TextView txtelecstopicone = (TextView) findViewById(R.id.textView);
//        TextView txtextcstopictwo = (TextView) findViewById(R.id.textView2);
//        TextView txtinftstopicthree = (TextView) findViewById(R.id.textView3);
//        TextView txtcompstopicfour = (TextView) findViewById(R.id.textView4);
//
//        txtelecstopicone.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
                Bundle bd = new Bundle();
                bd.putString("key" , "one");
//                Intent i = new Intent(MainActivity.this , TopicList.class);
//                i.putExtras(bd);
//                startActivity(i);
//            }
//        });
//
//        txtextcstopictwo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bd = new Bundle();
//                bd.putString("key" , "two");
//                Intent i = new Intent(MainActivity.this , TopicList.class);
//                i.putExtras(bd);
//                startActivity(i);
//            }
//        });
//
//        txtinftstopicthree.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bd = new Bundle();
//                bd.putString("key" , "three");
//                Intent i = new Intent(MainActivity.this , TopicList.class);
//                i.putExtras(bd);
//                startActivity(i);
//            }
//        });
//
//        txtcompstopicfour.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle bd = new Bundle();
//                bd.putString("key" , "four");
//                Intent i = new Intent(MainActivity.this , TopicList.class);
//                i.putExtras(bd);
//                startActivity(i);
//            }
//        });

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
