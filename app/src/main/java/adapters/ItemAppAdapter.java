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
        ItemApp item = arrayList.get(position);
        holder.id_item.setText(arrayList.get(position).getId_item());
        holder.img_item.setImageResource(arrayList.get(position).getImg_item());
        holder.name_item.setText(arrayList.get(position).getName_item());
        holder.tx_item.setText(arrayList.get(position).getTx_item());
        holder.tx_Rating.setText(arrayList.get(position).getTx_Rating());
        holder.tx_Size.setText((arrayList.get(position).getTx_Size()));
        if (item.getTx_event() == null || item.getTx_event().isEmpty()) {
            holder.conLayout2.setVisibility(View.GONE);
        } else {
            holder.conLayout2.setVisibility(View.VISIBLE);
            holder.tx_event.setText(item.getTx_event());

            if (item.getImg_event() == 0) {
                holder.img_event.setVisibility(View.GONE);
            } else {
                holder.img_event.setVisibility(View.VISIBLE);
                holder.img_event.setImageResource(item.getImg_event());
            }
        }

        // Ends
        if (item.getTx_ends() == null || item.getTx_ends().isEmpty()) {
            holder.conLayout3.setVisibility(View.GONE);
        } else {
            holder.conLayout3.setVisibility(View.VISIBLE);
            holder.tx_ends.setText(item.getTx_ends());
        }
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        public ConstraintLayout conLayout2, conLayout3;
        public TextView name_item,tx_item,tx_Rating,tx_Size,id_item,tx_event,tx_ends;
        public ImageView img_item,img_event;
        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            id_item=itemView.findViewById(R.id.id_item);
            img_item= itemView.findViewById(R.id.img_item);
            name_item= itemView.findViewById(R.id.name_item);
            tx_item= itemView.findViewById(R.id.tx_item);
            tx_Rating= itemView.findViewById(R.id.tx_Rating);
            tx_Size= itemView.findViewById(R.id.tx_Size);
            tx_event=itemView.findViewById(R.id.tx_event);
            tx_ends=itemView.findViewById(R.id.tx_ends);
            img_event=itemView.findViewById(R.id.img_event);
            conLayout2 = itemView.findViewById(R.id.conLayout2);
            conLayout3 = itemView.findViewById(R.id.conLayout3);
        }
    }
}

