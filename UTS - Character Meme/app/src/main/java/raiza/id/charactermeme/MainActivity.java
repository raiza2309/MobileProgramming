package raiza.id.charactermeme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMeme;
    private ArrayList<MemeChar> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMeme = findViewById(R.id.rv_meme_char);
        rvMeme.setHasFixedSize(true);

        list.addAll(MemeCharData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.profil_icon)
        {
            Intent moveProfil = new Intent(MainActivity.this, Profil.class);
            startActivity(moveProfil);
            return true;
        }
        return true;
    }

    private void showRecyclerList() {
        rvMeme.setLayoutManager(new LinearLayoutManager(this));
        MemeCharAdapter memeCharAdapter = new MemeCharAdapter(this, list);
        rvMeme.setAdapter(memeCharAdapter);
    }
}
