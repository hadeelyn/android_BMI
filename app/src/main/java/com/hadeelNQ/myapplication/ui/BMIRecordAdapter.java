package com.hadeelNQ.myapplication.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hadeelNQ.myapplication.R;

public class BMIRecordAdapter extends RecyclerView.Adapter<BMIRecordHolder> {
    private User user;
    private Context context;
    public BMIRecordAdapter(User user, Context context){
        this.user=user;
        this.context=context;
    }
    public BMIRecordHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View view= LayoutInflater.from(context).inflate(R.layout.activity_new_record,parent);
return new BMIRecordHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BMIRecordHolder holder, int position) {
        BMIRecord record=user.getRecords().get(position);
        holder.setBMIRecord(record);
    }
    public int getItemCount(){return user.getRecords().size();}
}
