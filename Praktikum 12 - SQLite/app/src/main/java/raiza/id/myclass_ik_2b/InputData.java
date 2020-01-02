package raiza.id.myclass_ik_2b;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InputData extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    Button btn1;
    EditText text1, text2, text3, text4, text5;
    String edit;
    TextView textView1, textView2, textView3, textView4, textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);

        dbHelper = new DataHelper(this);
        text1 = findViewById(R.id.editText1);
        text2 = findViewById(R.id.editText2);
        text3 = findViewById(R.id.editText3);
        text4 = findViewById(R.id.editText4);
        text5 = findViewById(R.id.editText5);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        btn1 = findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                edit = text1.getText().toString();
                edit = text2.getText().toString();
                edit = text3.getText().toString();
                edit = text4.getText().toString();
                edit = text5.getText().toString();
                if (edit.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Kolom tidak boleh kosong ...", Toast.LENGTH_SHORT).show();
                } else {
                    db.execSQL("INSERT INTO biodata (no, nama, tgl, jk, alamat) VALUES ('" + text1.getText().toString() + "','" + text2.getText().toString() + "','" + text3.getText().toString() + "','" + text4.getText().toString() + "','" + text5.getText().toString() + "')");
                    Toast.makeText(getApplicationContext(), "Data Tersimpan...", Toast.LENGTH_LONG).show();
                    finish();
                }
                DataMahasiswa.DM.RefreshList();
            }
        });
    }
}