package manzano.pablo.ejemplos.es.uidinamica;



import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import static manzano.pablo.ejemplos.es.uidinamica.R.id.listadoPelicula;

public class MainActivity extends FragmentActivity {

    private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putSerializable("listaPeli", peliculas);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            peliculas = new ArrayList<Pelicula>();
            montaFragments();

            FragmentManager fm = getSupportFragmentManager();

            ListaFragments lista = new ListaFragments();
            Bundle bundle = new Bundle();
            bundle.putSerializable("listaPeli", peliculas);
            lista.setArguments(bundle);
            fm.beginTransaction().add(R.id.listadoPelicula, lista).commit();
        }else{
            peliculas = (ArrayList<Pelicula>)savedInstanceState.getSerializable("listaPeli");
        }


    }


    private void montaFragments(){

        ListaFragments listaFragment = new ListaFragments();
        ArraySerializable listaPeli = new ArraySerializable(peliculas);
        Bundle extras = new Bundle();
        extras.putSerializable("listaPeli", listaPeli);
        listaFragment.setArguments(extras);
        getSupportFragmentManager().beginTransaction().add(R.id.listadoPelicula, listaFragment).commit();

    }
    public void onItemSelected(int position){
        DetallePelicula detallePelicula = (DetallePelicula) getSupportFragmentManager().findFragmentById(R.id.listadoPelicula);

        if(detallePelicula != null){
            detallePelicula.actualiza(peliculas.get(position));


        }else{
            detallePelicula = new DetallePelicula();

            Bundle args = new Bundle();
            args.putSerializable("peliserializada", peliculas.get(position));
            detallePelicula.setArguments(args);

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.listadoPelicula, detallePelicula);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
