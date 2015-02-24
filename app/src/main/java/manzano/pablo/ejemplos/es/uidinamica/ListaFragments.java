package manzano.pablo.ejemplos.es.uidinamica;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class ListaFragments extends ListFragment {

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
    public void onCreate (Bundle savedInstanceState){
        super.onCreate((savedInstanceState));

        Bundle extras=getArguments();
        ArraySerializable array = (ArraySerializable)extras.getSerializable("");
        listapelis = array.data;

        PeliAdapter adapter = new PeliAdapter(getActivity(), R.layout.row_pelis, listapelis);
        setListAdapter((android.widget.ListAdapter) adapter); //igual peta
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        listener.onItemSelected(position);
    }


    public interface ItemListSelected {
        public void onItemSelected(int position);
    }
}
