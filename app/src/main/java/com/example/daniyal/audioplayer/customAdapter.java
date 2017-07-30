package com.example.daniyal.audioplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Daniyal on 7/30/2017.
 */

public class customAdapter extends ArrayAdapter<ModelData> {

    private Activity context;
    private List<ModelData> Songs;
    String databaseReference;

    public customAdapter(Activity context, List<ModelData> Songs) {


        super(context, R.layout.custom_adapter, Songs);
        this.context = context;
        this.Songs = Songs;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        final View listview = inflater.inflate(R.layout.custom_adapter , null , true);
        TextView textViewName  = (TextView) listview.findViewById(R.id.textName);
        TextView textViewAdd  = (TextView) listview.findViewById(R.id.textLink);


        final ModelData Mod = Songs.get(position);
        textViewName.setText(Mod.name);
        textViewAdd.setText(Mod.link);




        return listview;


    }



}
