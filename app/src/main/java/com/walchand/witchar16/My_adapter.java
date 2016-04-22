package com.walchand.witchar16;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.walchand.witchar16.R;

import java.util.ArrayList;
import java.util.List;


public final class My_adapter extends BaseAdapter {
    private final List<Item> mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;

    public My_adapter(Context context) {
        mInflater = LayoutInflater.from(context);


        mItems.add(new Item("A Square", R.drawable.a));
        mItems.add(new Item("ApTech Quiz", R.drawable.b));
        mItems.add(new Item("CATIA Champ", R.drawable.cc));
        mItems.add(new Item("Cool Coding", R.drawable.d));
        mItems.add(new Item("Dream CAD", R.drawable.e));

        mItems.add(new Item("Electron Mechanics", R.drawable.f));
        mItems.add(new Item("Energy Contraption", R.drawable.g));
        mItems.add(new Item("Graphity", R.drawable.h));
        mItems.add(new Item("Infra Civil", R.drawable.i));

        mItems.add(new Item("Expert MANu", R.drawable.j));


        mItems.add(new Item("Network Treasure Hunt", R.drawable.k));
        mItems.add(new Item("Paper Presentation", R.drawable.l));


        mItems.add(new Item("Project Competition", R.drawable.m));

        mItems.add(new Item("Poster Making", R.drawable.n));
        mItems.add(new Item("Quizotronics", R.drawable.o));
        mItems.add(new Item("Robotics", R.drawable.p));
        mItems.add(new Item("STAAD WAR", R.drawable.q));

        mItems.add(new Item("Web Imagika", R.drawable.r));
        mItems.add(new Item("WITheatre", R.drawable.s));
        mItems.add(new Item("Wonder Tender", R.drawable.t));
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mItems.get(i).drawableId;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = mInflater.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);

        Item item = getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);

        return v;
    }

    private static class Item {
        public final String name;
        public final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}
