package manzano.pablo.ejemplos.es.uidinamica;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListView;

public class ListaFragments extends Fragment {

    private ItemListSelected listener;
    private ArrayList<Pelicula> listapelis;

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);

        try{
            listener = (ItemListSelected) activity;
        }catch (ClassCastException e){
            Log.e("Pelis", "Implementa la interfaz");
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){



        View view  = inflater.inflate(R.layout.row_pelis, container, false);
        Bundle extras=getArguments();
        ArraySerializable array = (ArraySerializable)extras.getSerializable("listaPeli");
        listapelis = array.data;
        GridView imagenBoton;
        imagenBoton = (GridView)view.findViewById(R.id.gridView);
        PeliAdapter adapter = new PeliAdapter(this.getActivity(), R.layout.pelicula_listado, listapelis);
        imagenBoton.setAdapter(adapter); //igual peta

        imagenBoton.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onItemSelected(position);
            }
        });

        return view;
    }


    public interface ItemListSelected {
        public void onItemSelected(int position);
    }
}
