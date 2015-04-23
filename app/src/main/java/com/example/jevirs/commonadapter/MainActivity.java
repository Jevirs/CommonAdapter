package com.example.jevirs.commonadapter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private MyAdapter myAdapter;
    private List<Data> datas;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datas = new ArrayList<>();
        initData();
        listView = (ListView) findViewById(R.id.listview);
        myAdapter = new MyAdapter(this,R.layout.item_layout,datas);
        listView.setAdapter(myAdapter);
    }

    private void initData() {
        Data data=new Data("Title","4-23","我有1只小毛驴",R.drawable.p1);
        datas.add(data);
        data=new Data("Title","4-23","我有2只小毛驴",R.drawable.p2);
        datas.add(data);
        data=new Data("Title","4-23","我有3只小毛驴",R.drawable.p3);
        datas.add(data);
        data=new Data("Title","4-23","我有4只小毛驴",R.drawable.p4);
        datas.add(data);
        data=new Data("Title","4-23","我有5只小毛驴",R.drawable.p5);
        datas.add(data);
        data=new Data("Title","4-23","我有6只小毛驴",R.drawable.p6);
        datas.add(data);
        data=new Data("Title","4-23","我有7只小毛驴",R.drawable.p7);
        datas.add(data);
        data=new Data("Title","4-23","我有7只小毛驴",R.drawable.p8);
        datas.add(data);
        data=new Data("Title","4-23","我有9只小毛驴",R.drawable.p9);
        datas.add(data);
        data=new Data("Title","4-23","我有10只小毛驴",R.drawable.p10);
        datas.add(data);
    }

}
