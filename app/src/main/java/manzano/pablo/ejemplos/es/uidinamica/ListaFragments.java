package manzano.pablo.ejemplos.es.uidinamica;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class ListaFragments extends ListFragment {

    private ItemlistSelected listener;
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
        SerializableArray array = extras.getSerializable("");
        listapelis = array.lista;
    }
}
