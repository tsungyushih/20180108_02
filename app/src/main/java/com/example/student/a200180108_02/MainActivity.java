package com.example.student.a200180108_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ArrayList<Map<String,Object>> mylist=new ArrayList();   //只有文字時,object改String,object能放圖也能放字
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.listview);

        HashMap<String,Object> m1=new HashMap<>();
        m1.put("city","台北");
        m1.put("code","02");
        m1.put("img",R.drawable.p1);
        mylist.add(m1);
        HashMap<String,Object> m2=new HashMap<>();
        m2.put("city","台中");
        m2.put("code","04");
        m2.put("img",R.drawable.p2);
        mylist.add(m2);
        HashMap<String,Object> m3=new HashMap<>();
        m3.put("city","台南");
        m3.put("code","06");
        m3.put("img",R.drawable.p3);
        mylist.add(m3);
        HashMap<String,Object> m4=new HashMap<>();
        m4.put("city","高雄");
        m4.put("code","07");
        m4.put("img",R.drawable.p4);
        mylist.add(m4);

        /*使用內建layout
        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,
                mylist,android.R.layout.simple_list_item_2,new String[]{"city","code"},
                new int[]{android.R.id.text1,android.R.id.text2});
        lv.setAdapter(adapter);
        */
        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,
                mylist,R.layout.myitem,new String[]{"city","code","img"},
                new int[]{R.id.textView,R.id.textView2,R.id.imageView});
        lv.setAdapter(adapter);

    }
}
