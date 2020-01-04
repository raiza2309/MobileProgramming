package raiza.id.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class IntentExplicitPage2 extends AppCompatActivity {
    public static String InputOnExplicit1;
    TextView Output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit_page2);

        Output = findViewById(R.id.OutputOnExplicitPage2);

        String display = getIntent().getStringExtra(InputOnExplicit1);
        Output.setText(display);
    }
}