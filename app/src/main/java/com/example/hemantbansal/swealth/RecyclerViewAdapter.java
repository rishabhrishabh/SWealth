package com.example.hemantbansal.swealth;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Hemant Bansal on 11/20/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{
    private Context context;
    private ArrayList<DonorDetails> listObjects;
    SharedPrefUtil sharedPrefUtil;
    public RecyclerViewAdapter(ArrayList<DonorDetails> listObject,Context context) {
        this.listObjects=listObject;
        this.context=context;
        sharedPrefUtil=new SharedPrefUtil(context);
    }






    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {
        holder.dnrid.setText("Donor no "+listObjects.get(position).getDonorNo());
        holder.physique.setText(listObjects.get(position).getPhysique().toString());
        holder.height.setText(""+listObjects.get(position).getHeight());
        holder.weight.setText(""+listObjects.get(position).getWeight());
        holder.haircolor.setText(listObjects.get(position).getHairColor().toString());
        holder.complexion.setText(listObjects.get(position).getSkinTone().toString());
        holder.procced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,Finalise.class);
                context.startActivity(i);
            }
        });


    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return listObjects.size();
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new RecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custum_row,parent,false));
    }

    protected class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView physique,height,weight,haircolor,complexion,dnrid;
        Button procced;



        public RecyclerViewHolder(View itemView) {
            super(itemView);
            dnrid=(TextView)itemView.findViewById(R.id.donor_id_);
            physique=(TextView)itemView.findViewById(R.id.physique_type_);
            height=(TextView)itemView.findViewById(R.id.height_);
            weight=(TextView)itemView.findViewById(R.id.weight_);
            haircolor=(TextView)itemView.findViewById(R.id.hair_color_);
            complexion=(TextView)itemView.findViewById(R.id.complexion_);
            procced=(Button)itemView.findViewById(R.id.proceed_btn_);
        }

    }


}
