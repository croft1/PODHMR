package devicroft.podhmr.view;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import devicroft.podhmr.R;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MAIN";

    Button gp_button;
    Button ph_button;
    TextView versionNumberLabel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        gp_button = (Button) findViewById(R.id.gp_button);
        ph_button = (Button) findViewById(R.id.ph_button);
        versionNumberLabel = (TextView) findViewById(R.id.label_version_number);

        gp_button.setOnClickListener(gp_button_listener);
        ph_button.setOnClickListener(ph_button_listener);

        versionNumberLabel.setText(getVersionInfo());

    }

    private String getVersionInfo(){
        String vn = "1";
        try{
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            vn = pInfo.versionName;
        }catch(PackageManager.NameNotFoundException e){ e.printStackTrace();}
        return vn;
    }

    private View.OnClickListener gp_button_listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d(TAG, "gp_button click");
            doGpLogin();
            Toast.makeText(getApplicationContext(), "GP access coming soon", Toast.LENGTH_SHORT).show();

            /*
            Intent gpIntent = new Intent(MainActivity.this, GpActivity.class);
            startActivity(gpIntent);
            overridePendingTransition(0,0);
            */

        }
    };

    private void doGpLogin(){
        Log.d(TAG, "gp_login_started");
        //TODO Add in dialog to make GP login
    }

    private View.OnClickListener ph_button_listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d(TAG, "ph_button click");
            doPhLogin();

            Intent phIntent = new Intent(MainActivity.this, PhActivity.class);
            startActivity(phIntent);
            overridePendingTransition(0,0);
        }
    };

    private void doPhLogin(){
        Log.d(TAG, "gp_login_started");
        //TODO Add in dialog to make pharmacist login
    }
}
