package com.example.jevirs.commonadapter.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ViewHolder {
    private SparseArray<View> mViews;
    private int mPostion;
    private View mConvertView;

    public ViewHolder(Context context,ViewGroup parent,int redId,int postion){
        this.mPostion=postion;
        this.mViews=new SparseArray<>();
        this.mConvertView= LayoutInflater.from(context).inflate(redId,parent,false);
        mConvertView.setTag(this);
    }

    public static ViewHolder getInstance(Context context,View convertview,ViewGroup parent,int resID,int postion){
        if (convertview==null){
            return new ViewHolder(context,parent,resID,postion);
        }
        else {
            ViewHolder viewHolder= (ViewHolder) convertview.getTag();
            viewHolder.mPostion=postion;
            return  viewHolder;
        }
    }

    public View getView(int viewId){
        View view=mViews.get(viewId);

        if(view==null){
            view=mConvertView.findViewById(viewId);
            mViews.put(viewId,view);
        }
        return view;
    }

    public View getConvertView() {
        return mConvertView;
    }

    public void setText(int id,String text){
        ((TextView)getView(id)) . setText(text);
    }

    public void setText(int id,int res){
        ((TextView)getView(id)) . setText(res);
    }

    public void setImage(int id,BitmapDrawable bitmapDrawable){
        ((ImageView) getView(id)) . setImageDrawable(bitmapDrawable);
    }

    public void setImage(int id,int res){
        ((ImageView) getView(id)) . setImageResource(res);
    }

    //应该放在异步线程中
    /*
    public void setImage(int id,URL url){
        try {
            URLConnection connection = url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedInputStream bis=new BufferedInputStream(is);
            ((ImageView) getView(id)) . setImageDrawable(BitmapDrawable.createFromStream(bis,null));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */
}
