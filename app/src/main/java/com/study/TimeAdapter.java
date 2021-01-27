package com.study;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class TimeAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<TimeData> array_time;

    private ViewHolder mViewHolder;

    public TimeAdapter(Context mContext, ArrayList<TimeData> array_time) {
        this.mContext = mContext;
        this.array_time = array_time;
    }

    @Override
    public int getCount() {
        return array_time.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public TimeData getItem(int position) {
        return array_time.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // ViewHolder Pattern
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.layout_study_time_item, parent, false);
            mViewHolder = new ViewHolder(convertView);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        // Data Setting in View
        mViewHolder.txt_title.setText(array_time.get(position).getTitle());
        mViewHolder.start_button.setImageResource(R.drawable.round_play_button);

        return convertView;
    }

    public class ViewHolder {
        private TextView txt_title;
        private ImageButton start_button;

        public ViewHolder(View convertView) {
            txt_title = (TextView) convertView.findViewById(R.id.txt_title);
            start_button = (ImageButton) convertView.findViewById(R.id.btn_start);
        }
    }
}
