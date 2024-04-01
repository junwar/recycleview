package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapter adapter;
    private ArrayList<clubmodel> clubmodels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        adapter = new adapter(clubmodels);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        clubmodels = new ArrayList<>();
        clubmodels.add(new clubmodel("KEMENAG",R.drawable.kemenag));
        clubmodels.add(new clubmodel("KEMENDAGRI",R.drawable.kemendagri));
        clubmodels.add(new clubmodel("KEMENDAG",R.drawable.kemendag));
        clubmodels.add(new clubmodel("KEMENDIKBUD",R.drawable.kemendikbud));
        clubmodels.add(new clubmodel("KEMENHUB",R.drawable.kemenhub));
        clubmodels.add(new clubmodel("KEMENKES",R.drawable.kemenkes));
        clubmodels.add(new clubmodel("KEMENKEU",R.drawable.kemenkeu));
        clubmodels.add(new clubmodel("KEMENPOLHUKAM",R.drawable.kemenkopolhukam));
        clubmodels.add(new clubmodel("KEMENPAN-RB",R.drawable.kemenpanrb));
        clubmodels.add(new clubmodel("KEMEN-PUPR",R.drawable.kemenpupr));
        clubmodels.add(new clubmodel("KEMENPAREKRAF",R.drawable.kemenparekraf));
        clubmodels.add(new clubmodel("KEMENPERIN",R.drawable.kemenperin));
        clubmodels.add(new clubmodel("KEMENSETNEG",R.drawable.kemensetneg));
        clubmodels.add(new clubmodel("KEMENSOS",R.drawable.kemensos));
        clubmodels.add(new clubmodel("KEMHAN",R.drawable.kemhan));



    }
}