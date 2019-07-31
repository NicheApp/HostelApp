package com.example.hosel_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v7.widget.RecyclerView.*;

public class adapter extends RecyclerView.Adapter<adapter.viewholder>{
    private ArrayList<node>ls;// the arrayllist from node
    public adapter(ArrayList<node> ls){
        this.ls=ls;
    }
    public class viewholder extends ViewHolder{

        public TextView textView;
        public TextView title;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.txt);
            title=(TextView) itemView.findViewById(R.id.title_node);
        }
    }
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context=viewGroup.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.activity_each_node,viewGroup,false);
        viewholder evh=new viewholder(view);
        return evh;




    }


    @Override
    public void onBindViewHolder(@NonNull viewholder viewholder, int i) {
        node n=ls.get(i);
        viewholder.textView.setText(n.getText());
        viewholder.title.setText(n.getTitle());
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }


}
