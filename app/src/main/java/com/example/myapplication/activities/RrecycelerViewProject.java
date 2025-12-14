package com.example.myapplication.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;

import adapters.SoicalMediaAdapter;
import modeles.SoicalMedia;

public class RrecycelerViewProject extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<SoicalMedia> soicalMediaArrayList;
    SoicalMediaAdapter soicalMediaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rrecyceler_view_project);
        rv= findViewById(R.id.rv);
        soicalMediaArrayList=new ArrayList<>();
        soicalMediaArrayList.add(new SoicalMedia(1,R.drawable.face,"facebook","Nov 28",false));
        soicalMediaArrayList.add(new SoicalMedia(2,R.drawable.snap,"Snapchat","Oct 30",true));
        soicalMediaArrayList.add(new SoicalMedia(3,R.drawable.google,"Chrome","Jan 18",false));
        soicalMediaArrayList.add(new SoicalMedia(4,R.drawable.insta,"Instagram","Sep 15",true));
        soicalMediaArrayList.add(new SoicalMedia(5,R.drawable.google,"Chrome","Jan 18",false));
        soicalMediaArrayList.add(new SoicalMedia(6,R.drawable.insta,"Instagram","Sep 15",true));

        soicalMediaAdapter=new SoicalMediaAdapter(soicalMediaArrayList,RrecycelerViewProject.this);
        rv.setLayoutManager(new LinearLayoutManager(RrecycelerViewProject.this));
     //  لو بدنا نعمل شكل شبكي
       // rv.setLayoutManager(new GridLayoutManager(RrecycelerViewProject.this,4));
        rv.setAdapter(soicalMediaAdapter);
    }
}