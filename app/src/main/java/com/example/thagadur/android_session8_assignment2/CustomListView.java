package com.example.thagadur.android_session8_assignment2;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {


    ListView listView;
    CustomListAdapter adapter;
    public CustomListView customListView=null;
    public ArrayList<ListModel> customListViewValuesArr=new ArrayList<ListModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        customListView=this;

        setListData();
        Resources res =getResources();

        listView=(ListView)findViewById(R.id.custom_list_view);
        adapter=new CustomListAdapter(CustomListView.this,customListViewValuesArr,res);

        listView.setAdapter(adapter);
    }

///to set the values for arrayList
    public void setListData(){
        for (int i=1;i<=10;i++){
            final ListModel addDetails=new ListModel();
            addDetails.setName("Name"+i);
            addDetails.setPhNumber("897014689"+i);
            customListViewValuesArr.add(addDetails);
        }
    }
}
