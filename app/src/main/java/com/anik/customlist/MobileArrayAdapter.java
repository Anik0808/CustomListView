package com.anik.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MobileArrayAdapter extends ArrayAdapter<String> implements AdapterView.OnItemClickListener {
    private final Context context;
    private final String[] values;

    public MobileArrayAdapter(Context context, String[] values) {
        super(context, R.layout.list, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.text);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
        textView.setText(values[position]);

        // Change icon based on name
        String s = values[position];

        System.out.println(s);

        if (s.equals("Windows")) {
            imageView.setImageResource(R.drawable.windowsmobile_logo);
        } else if (s.equals("Apple")) {
            imageView.setImageResource(R.drawable.ios_logo);
        } else if (s.equals("BlackBerry")) {
            imageView.setImageResource(R.drawable.blackberry_logo);
        } else {
            imageView.setImageResource(R.drawable.android_logo);
        }

        return rowView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String selectedValue = values[position];
        Toast.makeText(context, selectedValue, Toast.LENGTH_SHORT).show();
    }

}
