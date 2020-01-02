package raiza.id.myclass_ik_2b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLihatData = findViewById(R.id.btn_lihat);
        Button btnTambahData = findViewById(R.id.btn_tambah);
        Button btnInformasi = findViewById(R.id.btn_info);

        btnLihatData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lihatData = new Intent(MainActivity.this, DataMahasiswa.class);
                startActivity(lihatData);
            }
        });
        btnTambahData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tambahData = new Intent(MainActivity.this, InputData.class);
                startActivity(tambahData);
            }
        });
        btnInformasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info = new Intent(MainActivity.this, Informasi.class);
                startActivity(info);
            }
        });
    }
}
