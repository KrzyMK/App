package com.example.a2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PainterAdapter extends ArrayAdapter<Painter>  {
    private Context context;
    private ArrayList<Painter> lista;

    public PainterAdapter(Context context, ArrayList<Painter> lista) {
        super(context, R.layout.list_element, lista);
        this.context = context;
        this.lista = lista;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_element, parent, false);

        TextView imie = rowView.findViewById(R.id.imie);
        TextView nazwisko = rowView.findViewById(R.id.nazwisko);
        ImageView obrazek = rowView.findViewById(R.id.imageView);
        CheckBox box = rowView.findViewById(R.id.box);

        box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(box.isChecked())
                    lista.get(position).setToDelete(true);
                else
                    lista.get(position).setToDelete(false);
            }
        });
        imie.setText((lista.get(position).getName()));
        nazwisko.setText(lista.get(position).getSurname());
        obrazek.setImageResource(lista.get(position).getPicture());
        return  rowView;
    }
}