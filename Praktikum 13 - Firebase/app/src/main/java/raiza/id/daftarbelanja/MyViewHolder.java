package raiza.id.daftarbelanja;

import android.view.*;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    View myView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        myView = itemView;
    }

    public void setType(String type){
        TextView mType = myView.findViewById(R.id.type);
        mType.setText(type);
    }

    public void setNote(String note){
        TextView mNote = myView.findViewById(R.id.note);
        mNote.setText(note);
    }

    public void setDate(String date){
        TextView mDate = myView.findViewById(R.id.date);
        mDate.setText(date);
    }

    public void setAmount(int amount){
        TextView mAmount = myView.findViewById(R.id.amount);
        String stam = String.valueOf(amount);
        mAmount.setText(stam);
    }
}
