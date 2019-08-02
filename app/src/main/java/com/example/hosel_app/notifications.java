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
        //String image_url= "https://support.rebrandly.com/hc/article_attachments/360020801793/rebrandly_url_shortener_010.png";
       String title[]={"first","second","third","fourth","fifth","sixth","seventh"};
       String imaage_url_data[]= {"https://travel.home.sndimg.com/content/dam/images/travel/fullset/2015/10/12/new-seven-wonders-great-wall-of-china.jpg.rend.hgtvcom.616.462.suffix/1491581549051.jpeg",
               "https://travel.home.sndimg.com/content/dam/images/travel/fullset/2015/10/12/new-seven-wonders-christ-the-redeemer.jpg.rend.hgtvcom.616.462.suffix/1491581548898.jpeg",
               "https://travel.home.sndimg.com/content/dam/images/travel/fullset/2015/10/12/new-seven-wonders-machu-picchu.jpg.rend.hgtvcom.616.462.suffix/1491581548990.jpeg",
               "https://travel.home.sndimg.com/content/dam/images/travel/fullset/2015/10/12/new-seven-wonders-chichen-itza.jpg.rend.hgtvcom.616.462.suffix/1491581548887.jpeg",
               "https://travel.home.sndimg.com/content/dam/images/travel/fullset/2015/10/12/new-seven-wonders-roman-coloesseum.jpg.rend.hgtvcom.616.462.suffix/1491581548881.jpeg",
               "https://travel.home.sndimg.com/content/dam/images/travel/fullset/2015/10/12/new-seven-wonders-taj-mahal.jpg.rend.hgtvcom.616.462.suffix/1491581548979.jpeg",
               "https://travel.home.sndimg.com/content/dam/images/travel/fullset/2015/10/12/new-seven-wonders-petra.jpg.rend.hgtvcom.616.462.suffix/1491581549062.jpeg"
       };
        ArrayList<node> list=new ArrayList<>();
         for(int i=0;i<7;i++){
             list.add(new node("none",title[i],imaage_url_data[i]));

         }
        rView=findViewById(R.id.rview);
        rView.setHasFixedSize(true);
        laymanager=new LinearLayoutManager(this);//LayoutManager(this);
        adap=new adapter(list);
        rView.setLayoutManager(laymanager);
        rView.setAdapter(adap);
    }
}
