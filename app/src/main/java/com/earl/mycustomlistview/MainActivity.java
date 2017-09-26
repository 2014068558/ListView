package com.earl.mycustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    int[] logos;
    String[] codeNames, versions, apis, dates;
    ArrayList<AndroidVersion> arrayList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = (ListView) findViewById(R.id.lv_AndroidVersions);
        logos = new int[]{R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo,
                R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.ics, R.drawable.jellybean, R.drawable.kitkat,
                R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo};

        codeNames = getResources().getStringArray(R.array.codename);
        versions = getResources().getStringArray(R.array.version);
        apis = getResources().getStringArray(R.array.api);
        dates = getResources().getStringArray(R.array.date);

        arrayList = new ArrayList<AndroidVersion>();

        for (int i=0; i < codeNames.length; i++) {
            AndroidVersion android = new AndroidVersion(logos[i], codeNames[i], versions[i], apis[i], dates[i]);
            arrayList.add(android);
        }

        adapter = new CustomAdapter(arrayList, this);
        lvAndroidVersions.setAdapter(adapter);

        lvAndroidVersions.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String msg = "You clicked " + codeNames[i];
                makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
            }
        });

    }
}
