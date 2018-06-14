package org.focuskenya.focuskenya;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static android.media.CamcorderProfile.get;

public class ItemsList extends ArrayAdapter<Prayers> {

    private Activity context;
    List<Prayers> prayers;

    public ItemsList(Activity context, List<Prayers> prayers) {
        super(context, R.layout.layout_prayeritems_list, prayers);
        this.context = context;
        this.prayers = prayers;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_prayeritems_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        //TextView textViewGenre = (TextView) listViewItem.findViewById(R.id.textViewGenre);

        Prayers prayer = prayers.get(position);
        textViewName.setText(prayer.getArtistName());
        //textViewGenre.setText(prayer.getArtistGenre());

        return listViewItem;
    }
}
