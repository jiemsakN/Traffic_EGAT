package appewtc.masterung.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    // Explicit
    TextView showtitleTextView, showDetailTextView;
    ImageView showImageView;
    Button backButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);



      // Bind Winget
        bindWinget();
        bottonController();
        showTitle();
        showImage();
        showDetail();

    } // onCreats

    private void showDetail() {

        String strDetail[] = getResources().getStringArray(R.array.detail);
        int intIndex = getIntent().getIntExtra("Index", 0);
        showDetailTextView.setText(strDetail[intIndex]);
    }

    private void showImage() {
        int intImage = getIntent().getIntExtra("Imate", R.drawable.traffic_01);
        showImageView.setImageResource(intImage);
    }

    private void showTitle() {

        String strTitle = getIntent().getStringExtra("Title");
        showtitleTextView.setText(strTitle);

    } // Show Title

    private void bottonController() {

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }// bottonController

    private void bindWinget() {

        showDetailTextView = (TextView) findViewById(R.id.txtShowDetail);
        showtitleTextView = (TextView) findViewById(R.id.txtShowTitle);
        showImageView = (ImageView) findViewById(R.id.imvShowImage);
        backButton = (Button) findViewById(R.id.dtnBack);

    }//Bind Winget

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
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
} // Main Class
