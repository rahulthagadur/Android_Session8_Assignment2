package com.example.thagadur.android_session8_assignment2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Thagadur on 8/18/2017.
 */

public class CustomListAdapter extends BaseAdapter {


    private Activity activity;
    private ArrayList data;
    private static LayoutInflater inflater=null;
    public Resources res;
    ListModel tempValues=null;
    int i=0;
    public CustomListAdapter (Activity a, ArrayList d, Resources resLocal) {


        activity = a;
        data=d;
        res = resLocal;

        /***********  Layout inflator to call external xml layout () ***********/
        inflater = (LayoutInflater)activity.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        if (data.size() < 0) {

            return 1;
        }
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public static class ViewHolder{
        public TextView name;
        public TextView phNumber;
        }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View vi =view;
        ViewHolder holder;


        if (view==null) {
            vi = inflater.inflate(R.layout.tabitem, null);


            holder = new ViewHolder();
            holder.name = (TextView) vi.findViewById(R.id.name);
            holder.phNumber = (TextView) vi.findViewById(R.id.phNumber);

            vi.setTag(holder);

        }

        else
            holder=(ViewHolder)vi.getTag();

        if (data.size()<0){
            holder.name.setText("No data");
        }

        else
        {
            tempValues=null;
            tempValues=(ListModel)data.get(i);

            holder.name.setText(tempValues.getName());
            holder.phNumber.setText(tempValues.getPhNumber());
        }





        return vi;
    }
}
