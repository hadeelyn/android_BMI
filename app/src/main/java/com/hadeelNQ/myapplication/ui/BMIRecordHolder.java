package com.hadeelNQ.myapplication.ui;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.hadeelNQ.myapplication.R;

public class BMIRecordHolder extends RecyclerView.ViewHolder {
    private final TextView date;
    private final TextView weight;
    private final TextView length;
    private final TextView message;
    private BMIRecord record;
    private View itemView;



    public BMIRecordHolder(View itemView) {
        super(itemView);
        this.itemView=itemView;
        this.date=itemView.findViewById(R.id.date);
        this.weight=itemView.findViewById(R.id.weight);
        this.message=itemView.findViewById(R.id.message);
        this.length=itemView.findViewById(R.id.length);

    }
    public void setBMIRecord(BMIRecord record){
        date.setText(record.getDate());
        weight.setText(record.getWeight()+"kg");
        message.setText(record.getBMIMessage());
        length.setText(record.getLength()+"cm");

    }
}
