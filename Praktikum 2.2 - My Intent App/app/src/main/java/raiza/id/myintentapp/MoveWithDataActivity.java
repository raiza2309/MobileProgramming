package raiza.id.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
public static final String EXTRA_NAME = "extra_name";
public static final String EXTRA_AGE = "extra_age";


TextView TvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data_activity);

        TvDataReceived = findViewById(R.id.tv_data_received);

        String nama = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);

        String display = "Nama: " + nama + ",\nUmur: " + age;
        TvDataReceived.setText(display);
    }
}
