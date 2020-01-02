package raiza.id.myviewholder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private WeatherAdapter adapter;
    private EditText editCity;
    private ProgressBar progressBar;
    private Button btnCity;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCity = findViewById(R.id.edit_city);
        progressBar = findViewById(R.id.progress_bar);
        btnCity = findViewById(R.id.btn_city);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new WeatherAdapter();
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);

        mainViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MainViewModel.class);

        btnCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String city = editCity.getText().toString();

                if (TextUtils.isEmpty(city))
                    return;

                mainViewModel.setWeather(city);
                showLoading(true);
            }
        });

        mainViewModel.getWeathers().observe(this, new Observer<ArrayList<WeatherItems>>() {
            @Override
            public void onChanged(ArrayList<WeatherItems> weatherItems) {
                if (weatherItems != null) {
                    adapter.setData(weatherItems);
                    showLoading(false);
                }
            }
        });
    }

    private void showLoading(boolean state) {
        if (state) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }
}
