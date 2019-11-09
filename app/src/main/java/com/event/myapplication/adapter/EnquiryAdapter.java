package com.event.myapplication.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.event.myapplication.MainActivity;
import com.event.myapplication.R;
import com.event.myapplication.pojoi.Woman;
import com.google.gson.Gson;

import java.util.List;


public class EnquiryAdapter extends RecyclerView.Adapter<EnquiryAdapter.ViewHolder> {


    Context navigator;
List<Woman> data;
    MainActivity mainActivity;
    private LayoutInflater inflater;

    public EnquiryAdapter(MainActivity mainActivity, Context navigator, List<Woman> data) {

        inflater = mainActivity.getLayoutInflater();
        this.navigator = navigator;
        this.data = data;
        this.mainActivity = mainActivity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = inflater.inflate(R.layout.adapterlayout, parent, false);
        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        final Woman mdata = data.get(position);



        holder.txtProductName.setText(mdata.getName());





    }

    @Override
    public int getItemCount() {


        return data.size();


    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        protected TextView txtProductName;


        public ViewHolder(View itemView) {
            super(itemView);

            txtProductName = (TextView)itemView.findViewById(R.id.txtProductName);


        }
    }
}
