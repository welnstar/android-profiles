package de.iweinzierl.easyprofiles.adapter;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.List;

public abstract class ListAdapter<T> extends BaseAdapter {

    protected final Context context;
    protected final List<T> items;

    public ListAdapter(Context context, List<T> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public int getItemPosition(T item) {
        return items.indexOf(item);
    }
}
