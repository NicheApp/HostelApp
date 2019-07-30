package com.example.hosel_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class notifications extends AppCompatActivity {
    private RecyclerView rView;
    private RecyclerView.Adapter adap;
    private RecyclerView.LayoutManager laymanager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        ArrayList<node> list=new ArrayList<>();
        list.add(new node("It is a truth universally acknowledged, that a single man in\n" +
                "possession of a good fortune, must be in want of a wife.", "first"));
        list.add(new node("However little known the feelings or views of such a man\n" +
                "may be on his first entering a neighbourhood, this truth is\n" +
                "so well fixed in the minds of the surrounding families, that\n" +
                "he is considered the rightful  of some one or other\n" +
                "of their daughters.", "second"));
        list.add(new node("‘My dear Mr. Bennet,’ said his lady to him one day, ‘have\n" +
                "you heard that Netherfield Park is let at last?’\n" +
                "Mr. Bennet replied that he had not.", "third"));
        list.add(new node("‘But it is,’ returned she; ‘for Mrs. Long has just been here,\n" +
                "and she told me all about it.’\n", "fourth"));
        list.add(new node(" Mr. Bennet made no answer.\n" +
                "‘Do you not want to know who has taken it?’ cried his\n" +
                "wife impatiently.\n" +
                "‘YOU want to tell me, and I have no objection to hearing it.’\n" +
                "This was invitation enough.", "fifth"));
        list.add(new node("‘Why, my dear, you must know, Mrs. Long says that\n" +
                "Netherfield is taken by a young man of large fortune from\n" +
                "the north of England; that he came down on Monday in a\n" +
                "chaise and four to see the place, and was so much delighted\n" +
                "with it, that he agreed with Mr. Morris immediately", "sixth"));
        list.add(new node("that\n" +
                "he is to take possession before Michaelmas, and some of hs servants are to be in the house by the end of next week.’\n", "seventh"));
        list.add(new node("‘What is his name?’\n", "eighth"));
        rView=findViewById(R.id.rview);
        rView.setHasFixedSize(true);
        laymanager=new LinearLayoutManager(this);//LayoutManager(this);
        adap=new adapter(list);
        rView.setLayoutManager(laymanager);
        rView.setAdapter(adap);
    }
}
