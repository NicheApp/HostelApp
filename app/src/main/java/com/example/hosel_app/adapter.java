package com.example.hosel_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static android.support.v7.widget.RecyclerView.*;

public class adapter extends RecyclerView.Adapter<adapter.viewholder>implements View.OnClickListener,View.OnLongClickListener{
    private ArrayList<node>ls;// the arrayllist from node
    private Context context;
    public adapter(ArrayList<node> ls){
        this.ls=ls;

    }//constructor

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "position = 1" , Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onLongClick(View view) {
        Toast.makeText(view.getContext(), "position = 1" , Toast.LENGTH_SHORT).show();
        return false;
    }

    public class viewholder extends ViewHolder{//creating the viewholder class

        public TextView textView;
        public TextView title;
        public ImageView imageView;
        public viewholder(@NonNull View itemView) {//constructor for the vieholder class
            super(itemView);//passing item view to the parent class
           //textView=(TextView)itemView.findViewById(R.id.txt);//taking the views from the given itemview(parameters)
            imageView=(ImageView)itemView.findViewById(R.id.image);
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
        //viewholder.textView.setText(n.getText());
        viewholder.title.setText(n.getTitle());
        Picasso.with(viewholder.imageView.getContext()).load(n.getImage_url()).into(viewholder.imageView);
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }


}
