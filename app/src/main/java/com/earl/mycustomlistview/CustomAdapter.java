package com.earl.mycustomlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Zer0 on 9/14/2017.
 */

public class CustomAdapter extends BaseAdapter {
    ArrayList<AndroidVersion> androidVersions;
    Context ctx;
    ImageView ivLogo;
    TextView tvCodeName, tvVersion, tvApi, tvDate;

    public CustomAdapter(ArrayList<AndroidVersion> androidVersions, Context ctx) {
        this.androidVersions = androidVersions;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return androidVersions.size();
    }

    @Override
    public Object getItem(int i) {
        return androidVersions.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v = View.inflate(ctx, R.layout.row_layout, null);
        ivLogo = (ImageView) v.findViewById(R.id.iv_logo);
        tvCodeName = (TextView) v.findViewById(R.id.tv_codename);
        tvVersion = (TextView) v.findViewById(R.id.tv_version);
        tvApi = (TextView) v.findViewById(R.id.tv_api);
        tvDate = (TextView) v.findViewById(R.id.tv_date);

        ivLogo.setImageResource(androidVersions.get(i).getLogo());
        tvCodeName.setText(androidVersions.get(i).getCodename());
        tvVersion.setText(androidVersions.get(i).getVersion());
        tvApi.setText(androidVersions.get(i).getApi());
        tvDate.setText(androidVersions.get(i).getDate());

        return v;
    }
}
