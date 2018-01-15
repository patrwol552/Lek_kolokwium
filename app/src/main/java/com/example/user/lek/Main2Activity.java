package com.example.user.lek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Lek> leki = new ArrayList<>();
        leki.add(new Lek("tritace", "120 mg"));
        leki.add(new Lek("apap", "150 mg"));
        leki.add(new Lek("tertensif", "110mg"));
        leki.add(new Lek("Paracetamol", "160mg"));
        leki.add(new Lek("Ibuprom", "120mg"));



    }
}
