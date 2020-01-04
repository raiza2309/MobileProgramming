package raiza.id.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.EventListener;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button Btn_SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Btn_SignUp = findViewById(R.id.Btn_JoinUs);
        Btn_SignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == Btn_SignUp)
        {
            Intent moveIntent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(moveIntent);
        }
    }
}
