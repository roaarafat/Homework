package com.example.myapplication.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;

import adapters.ItemAppAdapter;
import modeles.ItemApp;

public class RecyelerViewActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<ItemApp> itemAppArrayList;
    ItemAppAdapter itemAppAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recyeler_view);
        rv=findViewById(R.id.rv);
        itemAppArrayList= new ArrayList<>();
        itemAppArrayList.add(new ItemApp("1",R.drawable.blockblast,"Block Blast!","Puzzle • Block • Casual • Offline","4.5","161 MB"));
        itemAppArrayList.add(new ItemApp("2",R.drawable.vita,"Vita Mahjong","Board • Puzzle • Mahjong solitaire","4.6","142 MB"));
        itemAppArrayList.add(new ItemApp("3",R.drawable.jigsol,"Jigsolitaire","Puzzle ","4.3","71 MB"));
        itemAppArrayList.add(new ItemApp("4",R.drawable.explorer,"Tile Explorer - Triple Match","Puzzle • Match 3 • Casual • Offline","4.5","Ends in 6 days"));
        itemAppArrayList.add(new ItemApp("5",R.drawable.watermatch,"Water Match - ASMR Water Sort"," Casual","4.7","174 MB"));
        itemAppArrayList.add(new ItemApp("6",R.drawable.roblex,"Roblex","Adventure • Simulation • Sandbox","4.4","Ends on 29/12/2025"));

        itemAppAdapter=new ItemAppAdapter(itemAppArrayList,RecyelerViewActivity.this);
        rv.setLayoutManager(new LinearLayoutManager(RecyelerViewActivity.this));
        rv.setAdapter(itemAppAdapter);
    }
}