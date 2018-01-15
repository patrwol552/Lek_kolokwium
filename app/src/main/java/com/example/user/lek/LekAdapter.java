package com.example.user.lek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LekAdapter extends AppCompatActivity{

    public LekAdapter()
    {}

    ArrayList<Lek> list= new ArrayList<>();
    LekAdapter(ArrayList<Lek> leki){
        this.list=leki;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lek, null);
        return new ViewHolder(itemLayoutView);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.setName(list.get(position).getNazwa());
        holder.setZawartosc(list.get(position).getZawartosc());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.nazwaLeku)
        TextView nazwaLeku;

        @BindView(R.id.zawartosc)
        TextView zawartosc;


        @OnClick(R.id.wybierz_btn)
        void onNameClick() {



        }

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }

        private void setName(String name) {
            nazwaLeku.setText(name);
        }

        private void setZawartosc(String zawartosc) {
           zawartosc.setText(zawartosc);

        }

    }
}

