package raiza.id.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_donasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getActionBar() != null){
            getActionBar().setTitle("Donasi Pesawat R80");
        }
        btn_donasi = findViewById(R.id.btn_donasi);
    }

    @Override
    public void onClick(View view) {
        if (view == btn_donasi)
        {
            Intent move_donasi = new Intent(MainActivity.this, ActivityDonasi.class);
            startActivity(move_donasi);
        }
    }
}
