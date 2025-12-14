package adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.activities.Login;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import modeles.SoicalMedia;

public class SoicalMediaAdapter extends RecyclerView.Adapter<SoicalMediaAdapter.ViewHolderClass> {
    ArrayList<SoicalMedia> arrayList;
    Activity activity;

    public SoicalMediaAdapter(ArrayList<SoicalMedia> arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public SoicalMediaAdapter.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem= LayoutInflater.from(parent.getContext()).inflate(R.layout.soicalmediaicon,parent,false);
        return new ViewHolderClass(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull SoicalMediaAdapter.ViewHolderClass holder, int position) {
        holder.img_sm.setImageResource(arrayList.get(position).getImage());
        holder.tx_sm.setText(arrayList.get(position).getName());
        holder.date_sm.setText(arrayList.get(position).getDate());
        holder.relative_sm.setOnClickListener(new View.OnClickListener() {
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
        public RelativeLayout relative_sm;
        public CircleImageView img_sm;
        public TextView tx_sm , date_sm;
        public CheckBox ch_sm;
        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            img_sm= itemView.findViewById(R.id.img_sm);
            tx_sm= itemView.findViewById(R.id.tx_sm);
            date_sm= itemView.findViewById(R.id.date_sm);
            ch_sm= itemView.findViewById(R.id.ch_sm);
            relative_sm= itemView.findViewById(R.id.relative_sm);
        }
    }
}
