package com.photoselector.ui;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * 
 * @author Aizaz
 *
 */


public class MBaseAdapter<T> extends BaseAdapter {

	protected Context context;
	protected ArrayList<T> models;

	public MBaseAdapter(Context context, ArrayList<T> models) {
		this.context = context;
		if (models == null)
			this.models = new ArrayList<T>();
		else
			this.models = models;
	}

	@Override
	public int getCount() {
		if (models != null) {
			return models.size();
		}
		return 0;
	}

	@Override
	public Object getItem(int position) {
		return models.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return null;
	}

	/** 更新数据 */
	public void update(List<T> models) {
		if (models == null)
			return;
		this.models.clear();
		for (T t : models) {
			this.models.add(t);
		}
		notifyDataSetChanged();
	}

	public ArrayList<T> getItems() {
		return models;
	}

}
