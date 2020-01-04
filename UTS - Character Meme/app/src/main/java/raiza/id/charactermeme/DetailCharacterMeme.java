package raiza.id.charactermeme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailCharacterMeme extends AppCompatActivity {

    private int id;
    TextView tvDetailNama, tvDetailDesc;
    ImageView detailPhoto;

    private ArrayList<MemeChar> listMemeChar = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_character_meme);

        id = getIntent().getIntExtra("id", 0);
        tvDetailNama = findViewById(R.id.detail_nama);
        tvDetailDesc = findViewById(R.id.detail_deskripsi);
        detailPhoto = findViewById(R.id.detail_photo);

        listMemeChar.addAll(MemeCharData.getListData());
        setLayout();

        if (getSupportActionBar() != null) {
            setTitle(listMemeChar.get(id).getName());
        }
    }

    private void setLayout() {
        tvDetailNama.setText(listMemeChar.get(id).getName());
        tvDetailDesc.setText(listMemeChar.get(id).getDetail());
        Glide.with(this).load(listMemeChar.get(id).getPhoto()).apply(new RequestOptions()).into(detailPhoto);
    }
}
