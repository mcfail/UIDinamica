package manzano.pablo.ejemplos.es.uidinamica;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by AlumnoT on 24/02/2015.
 */
public class DetallePelicula extends Fragment{

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.detalle, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();

        Bundle extras = getArguments();

        if (extras!= null){
            actualiza((Pelicula)extras.getSerializable("peliserializada"));
        }

    }

    public void actualiza(Pelicula peliElegida){
        TextView tituloPelicula = (TextView) getActivity().findViewById(R.id.titulo);
        tituloPelicula.setText(peliElegida.getTitulo());

        ImageView portada= (ImageView) getActivity().findViewById(R.id.portada);
        portada.setBackground(getActivity().getResources().getDrawable(peliElegida.getPortada()));

        RatingBar rating = (RatingBar) getActivity().findViewById(R.id.ratingBar);
        float rat= peliElegida.getValoracion();
       rating.setRating(rat);
        rating.setEnabled(false);


        TextView genero=(TextView) getActivity().findViewById(R.id.tematica);
        tituloPelicula.setText(peliElegida.getGenero());

        TextView duracion=(TextView) getActivity().findViewById(R.id.duracion);
        tituloPelicula.setText(peliElegida.getDuracion()+"min");

        TextView sinopsis=(TextView) getActivity().findViewById(R.id.sinopsis);
        tituloPelicula.setText(peliElegida.getComentario());






    }
}
