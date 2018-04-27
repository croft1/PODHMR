package devicroft.podhmr.view;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import devicroft.podhmr.PhListActivity;
import devicroft.podhmr.R;

public class PhActivity extends AppCompatActivity {



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0,0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph);

        setTitle("Pharmacist Portal");

        Button mapButton = (Button) findViewById(R.id.ph_button_map);
        Button listButton = (Button) findViewById(R.id.ph_button_list);
        Button acceptedButton = (Button) findViewById(R.id.ph_button_accepted);
        Button historyButton = (Button) findViewById(R.id.ph_button_history);

        mapButton.setOnClickListener(mapButtonListener);
        listButton.setOnClickListener(listButtonListener);
        historyButton.setOnClickListener(historyButtonListener);
        acceptedButton.setOnClickListener(acceptedButtonListener);
    }

    private static final int PERMISSION_REQUEST_GPS_COARSE = 2;
    private static final int PERMISSION_REQUEST_GPS_FINE = 3;

    private View.OnClickListener mapButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            checkForPermission(PERMISSION_REQUEST_GPS_FINE);
            checkForPermission(PERMISSION_REQUEST_GPS_COARSE);
            Intent gpIntent = new Intent(PhActivity.this, PhMapsActivity.class);
            startActivity(gpIntent);
            overridePendingTransition(0,0);
        }
    };
    private View.OnClickListener listButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent gpIntent = new Intent(PhActivity.this, PhListActivity.class);
            startActivity(gpIntent);
            overridePendingTransition(0, 0);
        }
    };
    private View.OnClickListener acceptedButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent gpIntent = new Intent(PhActivity.this, PhAcceptedActivity.class);
            startActivity(gpIntent);
            overridePendingTransition(0, 0);
        }
    };
    private View.OnClickListener historyButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent gpIntent = new Intent(PhActivity.this, PhHistoryActivity.class);
            startActivity(gpIntent);
            overridePendingTransition(0, 0);
        }
    };

    private void checkForPermission(final int PERMISSION_REQUEST_CONSTANT){
        //https://developer.android.com/training/permissions/requesting.html

        //determine what permission we are after
        String manifestPermission;
        String rationale;
        switch(PERMISSION_REQUEST_CONSTANT){
            case PERMISSION_REQUEST_GPS_COARSE:
                manifestPermission = android.Manifest.permission.ACCESS_COARSE_LOCATION;
                rationale = getString(R.string.rationale_permission_coarse);
                break;
            case PERMISSION_REQUEST_GPS_FINE:
                manifestPermission = android.Manifest.permission.ACCESS_FINE_LOCATION;
                rationale = getString(R.string.rationale_permission_fine);
                break;
            //add any more if need more permissions
            default:
                manifestPermission = android.Manifest.permission.INTERNET;
                rationale = getString(R.string.rationale_permission_internet);
        }

        //pass through
        int permissionCheck = ContextCompat.checkSelfPermission(PhActivity.this,
                manifestPermission);

        if(permissionCheck != PackageManager.PERMISSION_GRANTED){
            if (ActivityCompat.shouldShowRequestPermissionRationale(PhActivity.this,
                    manifestPermission)) {
                //user gets shown a quick rationale if seen and denied/skipped before requesting
                Toast.makeText(this, rationale, Toast.LENGTH_LONG).show();
            }
        }
        //if user has denied permission before, we now show them why we need it
    }
}
