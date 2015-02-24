package manzano.pablo.ejemplos.es.uidinamica;


import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PeliAdapter  {

    //Crear el fragmento
    private Context context;
    private int LayoutID;
    ArrayList<Pelicula> data = null;


    public PeliAdapter(Context context, int layoutID, ArrayList<Pelicula> data) {
        //super(context, layoutID, data);
        this.context = context;
        this.LayoutID = layoutID;
        this.data = ArraySerializable.arrayPelis();
    }


    public View getView(int position, View convertView, ViewGroup parent){

        View row = convertView;

        LayoutInflater inflater = ((Activity)context).getLayoutInflater();

        row = inflater.inflate(LayoutID, parent);
        ImageButton imagenBoton = (ImageButton)row.findViewById(R.id.p01);
        ImageButton imagenBoton2 = (ImageButton)row.findViewById(R.id.p02);
        row.setTag(imagenBoton);
        row.setTag(imagenBoton2);


        int bgid= data.get(position).getPortada();
        Drawable bg1 = this.context.getResources().getDrawable(bgid)  ;
        imagenBoton.setBackground(bg1);

        int bgid2= data.get(position+1).getPortada();
        Drawable bg2 = this.context.getResources().getDrawable(bgid2)  ;
        imagenBoton.setBackground(bg2);


        return row;
    }


}
