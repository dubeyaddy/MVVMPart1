package com.practiceapp.mvvmsample.adapter;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.practiceapp.mvvmsample.R;
import com.practiceapp.mvvmsample.jsonData.DataModel;

import org.w3c.dom.Text;

import java.util.List;

public class SampleListAdapter extends RecyclerView.Adapter<SampleListAdapter.MyViewHolder> {
    private Context context;
    private List<DataModel> sampleList;


    public SampleListAdapter(Context context, List<DataModel> sampleList){
        this.context=context;
        this.sampleList=sampleList;

    }

    public void setSampleList(List<DataModel> sampleList){
        this.sampleList=sampleList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public SampleListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.recycler_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_id.setText(Integer.toString(sampleList.get(position).getId()));
        holder.tv_name.setText(this.sampleList.get(position).getName().toString());
        holder.tv_year.setText(Integer.toString(this.sampleList.get(position).getYear()));
        holder.tv_color.setText(this.sampleList.get(position).getColor().toString());
        holder.tv_pantoneValue.setText(this.sampleList.get(position).getPantoneValue());
    }

    @Override
    public int getItemCount() {
        if(this.sampleList!=null){
            return this.sampleList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_id;
        TextView tv_name;
        TextView tv_year;
        TextView tv_color;
        TextView tv_pantoneValue;

        public MyViewHolder(View itemView){
            super(itemView);
            tv_id=(TextView) itemView.findViewById(R.id.tv_id);
            tv_name=(TextView) itemView.findViewById(R.id.tv_name);
            tv_year=(TextView) itemView.findViewById(R.id.tv_year);
            tv_color=(TextView) itemView.findViewById(R.id.tv_color);
            tv_pantoneValue=(TextView) itemView.findViewById(R.id.tv_pantoneValue);
        }
    }
}
