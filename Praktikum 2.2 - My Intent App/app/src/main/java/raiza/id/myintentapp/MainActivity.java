package raiza.id.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt_moveActivity;
    Button bt_MoveActivityWithData;
    Button bt_dial;
    Button bt_launch_Polines;
    Button bt_explicit_intent_page1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_moveActivity = findViewById(R.id.btn_move_activity);
        bt_moveActivity.setOnClickListener(this);

        bt_MoveActivityWithData = findViewById(R.id.btn_move_with_data);
        bt_MoveActivityWithData.setOnClickListener(this);

        bt_dial = findViewById(R.id.btn_dial);
        bt_dial.setOnClickListener(this);

        bt_launch_Polines = findViewById(R.id.btn_launch_polines);
        bt_launch_Polines.setOnClickListener(this);

        bt_explicit_intent_page1 = findViewById(R.id.btn_intent_explicit_page1);
        bt_explicit_intent_page1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_move_activity)
        {
            Intent moveIntent = new Intent(MainActivity.this, NewAcivity.class);
            startActivity(moveIntent);
        }
        else if (view.getId() == R.id.btn_move_with_data)
        {
            Intent moveData = new Intent(MainActivity.this, MoveWithDataActivity.class);
            moveData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Rama");
            moveData.putExtra(MoveWithDataActivity.EXTRA_AGE, 18);
            startActivity(moveData);
        }
        else if (view.getId() == R.id.btn_dial)
        {
            String phoneNumber = "089619753756";
            Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
            startActivity(dialPhone);
        }
        else if (view.getId() == R.id.btn_launch_polines)
        {
            Uri uri = Uri.parse("https://www.polines.ac.id/");
            Intent launchPolines = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(launchPolines);
        }
        else if (view.getId() == R.id.btn_intent_explicit_page1)
        {
            Intent IntentPage1 = new Intent(MainActivity.this, IntentExplicitPage1.class);
            startActivity(IntentPage1);
        }
    }
}
