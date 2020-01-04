package raiza.id.charactermeme;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MemeCharAdapter extends RecyclerView.Adapter<MemeCharAdapter.ListViewHolder> {
    private ArrayList<MemeChar> listMemeCharacter;
    private Context context;

    public MemeCharAdapter(Context context, ArrayList<MemeChar> list) {
        this.listMemeCharacter = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_meme, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final MemeChar character = listMemeCharacter.get(position);
        Glide.with(holder.itemView.getContext()).load(character.getPhoto()).apply(new RequestOptions().override(55, 55)).into(holder.photoMeme);
        holder.tvNama.setText(character.getName());
        holder.tvDetail.setText(character.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveDetail = new Intent(context, DetailCharacterMeme.class);
                moveDetail.putExtra("id", character.getId());
                context.startActivity(moveDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMemeCharacter.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView photoMeme;
        TextView tvNama, tvDetail;

        public ListViewHolder(View itemView) {
            super(itemView);
            photoMeme = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
