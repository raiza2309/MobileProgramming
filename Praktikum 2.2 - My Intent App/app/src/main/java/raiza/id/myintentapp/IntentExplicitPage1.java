package raiza.id.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentExplicitPage1 extends AppCompatActivity implements View.OnClickListener {

    String pindah;
    Button bt_explicit_intent_page2;
    EditText Tb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit_page1);

        bt_explicit_intent_page2 = findViewById(R.id.btn_intent_explicit_page2);
        bt_explicit_intent_page2.setOnClickListener(this);
        Tb1 = findViewById(R.id.TextBox1);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_intent_explicit_page2)
        {
            Intent goToPage2 = new Intent(IntentExplicitPage1.this, IntentExplicitPage2.class);
            pindah = Tb1.getText().toString();
            goToPage2.putExtra(IntentExplicitPage2.InputOnExplicit1, pindah);
            startActivity(goToPage2);
        }
    }
}
