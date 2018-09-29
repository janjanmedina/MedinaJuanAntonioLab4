package juanantonio.medina.com.medinajuanantoniolab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lab4", "onCreate started..");
    }

    public void backButt(View v) {
        Toast.makeText(this, "Back Button Clicked!", Toast.LENGTH_SHORT).show();
    }

    public void nextButt(View v) {
        Snackbar.make(v, "Next Button Clicked!", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lab4", "onStart started..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lab4", "onResume started..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lab4", "onRestart started..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lab4", "onStop started..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lab4", "onDestroy started..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lab4", "onPause started..");
    }
}
