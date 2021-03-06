package com.example.jevirs.commonadapter.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public abstract class CommonAdapter<T> extends BaseAdapter{

    protected Context mContext;
    protected List<T> mList;
    protected int resId;

    public CommonAdapter(Context context,int resId,List<T> list) {
        this.mContext = context;
        this.mList = list;
        this.resId=resId;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public T getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder = ViewHolder.getInstance(mContext, convertView, parent, resId, position);
        setView(holder,mList.get(position));
        return holder.getConvertView();
    }

    public abstract void setView(ViewHolder holder,T t);
}
