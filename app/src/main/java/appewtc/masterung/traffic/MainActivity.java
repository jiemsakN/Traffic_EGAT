package appewtc.masterung.traffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

        //Create ListView
        createListView();

    }   // Main Method

    private void createListView() {

        //setup intDrawable
        int intDrawble[] = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03,
                R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09,
                R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15,
                R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};
        // SetupTitle
        String strTitle[] = new String[20];
        strTitle[0] = "ห้ามเลี้ยวซ้าย";
        strTitle[1] = "ห้ามเลี้ยวขวา";
        strTitle[2] = "ตรงไป";
        strTitle[3] = "เลี้ยวขวา";
        strTitle[4] = "เลี้ยวซ้าย";
        strTitle[5] = "ออก";
        strTitle[6] = "เข้า";
        strTitle[7] = "ทางจักรยาน";
        strTitle[8] = "สามล้อห้ามขึ้น";
        strTitle[9] = "หัวปิงปองอยู่หน้า";
        strTitle[10] = "เขตชุมชน";
        strTitle[11] = "เขตโรงเรียน";
        strTitle[12] = "ทางสัตว์ผ่าน";
        strTitle[13] = "ห้ามจอด";
        strTitle[14] = "ห้ามกลับ";
        strTitle[15] = "ห้ามหยุด";
        strTitle[16] = "ลดความเร็ว";
        strTitle[17] = "รถวิ่งสวนทาง";
        strTitle[18] = "หยุดตรวจ";
        strTitle[19] = "เมียตำรวจ";

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intDrawble, strTitle);
        trafficListView.setAdapter(objMyAdapter);
    } //Create ListView


    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                buttonMediaPlayer.start();

                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("http://egat.co.th/index.php?option=com_content&view=article&id=149&Itemid=186"));
                startActivity(objIntent);

            }   // event
        });

    }   // buttonController

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

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
}   // Main Class นี่คือคลาสหลัก นะคะ