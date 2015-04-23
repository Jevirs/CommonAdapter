package com.example.jevirs.commonadapter;

import android.content.Context;

import com.example.jevirs.commonadapter.util.CommonAdapter;
import com.example.jevirs.commonadapter.util.ViewHolder;

import java.util.List;

public class MyAdapter extends CommonAdapter<Data> {

    public MyAdapter(Context context, int resId, List<Data> datas) {
        super(context, resId, datas);
    }

    @Override
    public void setView(ViewHolder holder, Data data) {
        holder.setText(R.id.title,data.getTitle());
        holder.setText(R.id.detail,data.getDetail());
        holder.setText(R.id.time,data.getTime());
        holder.setImage(R.id.image,data.getRes());
    }
}
