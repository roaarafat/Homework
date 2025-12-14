package adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.activities.Login;
import modeles.ItemApp;

import java.util.ArrayList;

public class ItemAppAdapter extends RecyclerView.Adapter<ItemAppAdapter.ViewHolderClass> {
    ArrayList<ItemApp> arrayList;
    Activity activity;

    public ItemAppAdapter(ArrayList<ItemApp> arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
    }
    @NonNull
    @Override
    public ItemAppAdapter.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemstore,parent,false);
        return new ViewHolderClass(viewItem);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemAppAdapter.ViewHolderClass holder, int position) {
        holder.id_item.setText(arrayList.get(position).getId_item());
        holder.img_item.setImageResource(arrayList.get(position).getImg_item());
        holder.name_item.setText(arrayList.get(position).getName_item());
        holder.tx_item.setText(arrayList.get(position).getTx_item());
        holder.tx_Rating.setText(arrayList.get(position).getTx_Rating());
        holder.tx_Size.setText((arrayList.get(position).getTx_Size()));
        holder.rela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(activity , Login.class);
                activity.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        public ConstraintLayout rela;
        public TextView name_item,tx_item,tx_Rating,tx_Size,id_item;
        public ImageView img_item;
        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            id_item=itemView.findViewById(R.id.id_item);
            img_item= itemView.findViewById(R.id.img_item);
            name_item= itemView.findViewById(R.id.name_item);
            tx_item= itemView.findViewById(R.id.tx_item);
            tx_Rating= itemView.findViewById(R.id.tx_Rating);
            tx_Size= itemView.findViewById(R.id.tx_Size);
            rela=itemView.findViewById(R.id.rela);
        }
    }
}

