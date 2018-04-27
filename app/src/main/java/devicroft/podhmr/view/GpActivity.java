package devicroft.podhmr.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import devicroft.podhmr.R;

public class GpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gp);

        setTitle("GP Portal");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0,0);
    }
}
