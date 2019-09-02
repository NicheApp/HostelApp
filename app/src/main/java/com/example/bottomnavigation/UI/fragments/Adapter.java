package com.example.bottomnavigation.UI.fragments;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
  import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigation.R;



public class Adapter extends RecyclerView.Adapter<Adapter.MyviewHolder> {

      @NonNull
      @Override
      public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View v;
          v= LayoutInflater.from(parent.getContext()).inflate(R.layout.notify2,parent,false);
          MyviewHolder vHolder =new MyviewHolder(v);

          return vHolder;
      }

      @Override
      public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
  //  holder.tv_name.setText(mdata.get(position).getText1());
    //      holder.tv_phone.setText(mdata.get(position).getText2());
      //    holder.img.setImageResource(mdata.get(position).getmImageresource());
          ((MyviewHolder)holder).bindView(position);
      }

      @Override
      public int getItemCount() {
          return not2.title.length;
      }

      protected class MyviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
  {
      private TextView tv_name;
      private TextView  tv_phone;
      private ImageView img;
      public MyviewHolder(@NonNull View itemView) {
              super(itemView);
       tv_name =(TextView) itemView.findViewById(R.id.moviename);
          tv_phone=(TextView) itemView.findViewById(R.id.txt2);
          img=(ImageView) itemView.findViewById(R.id.movie);
          itemView.setOnClickListener(this);
      }
      public void bindView(int position)
      {
          tv_name.setText(not2.title[position]);
          img.setImageResource(not2.picturepath[position]);


      }
      public void onClick(View view)
      {


      }
  }
  }
