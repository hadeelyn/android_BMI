package com.hadeelNQ.myapplication.ui;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hadeelNQ.myapplication.R;

import java.util.ArrayList;



public class BMIRecordAdapter extends RecyclerView.Adapter<BMIRecordAdapter.hadViewHolder>{
    ArrayList<BMIRecordHolder>hold;

    public BMIRecordAdapter(ArrayList<BMIRecordHolder> hold) {
        this.hold = hold;
    }

    @NonNull
    @Override
    public hadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_home,null,false);
        hadViewHolder viewHolder =new hadViewHolder(v);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull hadViewHolder holder, int position) {
        BMIRecordHolder c=hold.get(position);
        holder.tv_name.setText(c.getDate());
        holder.tv_name2.setText(Integer.toString(c.getWeight()));
        holder.tv_name3.setText(c.getMsg());
        holder.tv_name4.setText(Integer.toString(c.getLength()));

    }

    @Override
    public int getItemCount() {
        return hold.size();
    }

    class hadViewHolder extends  RecyclerView.ViewHolder{
        TextView tv_name;
        TextView tv_name2;
        TextView tv_name3;
        TextView tv_name4;


        public hadViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.date);
            tv_name2=itemView.findViewById(R.id.weight);
            tv_name3=itemView.findViewById(R.id.message);
            tv_name4=itemView.findViewById(R.id.length);



        }
    }
}