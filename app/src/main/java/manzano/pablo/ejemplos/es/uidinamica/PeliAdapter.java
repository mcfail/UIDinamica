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
    private ArrayList<Pelicula> data = null;

    public PeliAdapter(Context context, int layoutID, ArrayList<Pelicula> data) {
        //super(context, layoutID, data);
        this.context = context;
        LayoutID = layoutID;
        this.data = data;
    }


    public View getView(int position, View convertView, ViewGroup parent){

        View row = convertView;

        LayoutInflater inflater = ((Activity)context).getLayoutInflater();

        row = inflater.inflate(LayoutID, parent);
        ImageButton imagenBoton = (ImageButton)row.findViewById(R.id.p01);
        ImageButton imagenBoton2 = (ImageButton)row.findViewById(R.id.p02);
        row.setTag(imagenBoton);
        row.setTag(imagenBoton2);

        data = arrayPelis();
        int bgid= data.get(position).getPortada();
        Drawable bg1 = this.context.getResources().getDrawable(bgid)  ;
        imagenBoton.setBackground(bg1);

        int bgid2= data.get(position+1).getPortada();
        Drawable bg2 = this.context.getResources().getDrawable(bgid2)  ;
        imagenBoton.setBackground(bg2);


        return row;
    }
    

    //Añadir la información de las películas
    public static ArrayList<Pelicula> arrayPelis(){
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

        Pelicula p = null;
        p.setId("01");
        p.setTitulo("Las aventuras de Ford Fairlane");
        p.setGenero("Acción / Comedia");
        p.setPortada(R.drawable.fordfairlane);
        p.setValoracion(6.0f);
        p.setDuracion(104);
        p.setComentario("Andrew Dice Clay es Ford Fairlane, el detective más sexy (y más descarado de Los Ángeles). " +
                "Tomar Sambucas sin parar con las estrellas del rock y alternar con tías buenas a todas horas es un " +
                "duro trabajo... pero alguien tiene que hacerlo. Pero cuando la estrella del Heavy, Bobby Black, " +
                "muere en mitad de una actuación, el trabajo de Ford da un peligroso giro. " +
                "Quizás sea un paranoico, pero si te persiguiesen matones psicopatas y coches a toda pastilla... " +
                "probablemente tú también serías paranoico.");

        peliculas.add(p);

        p.setId("02");
        p.setTitulo("Interestellar");
        p.setGenero("CIFI / Drama");
        p.setPortada(R.drawable.interestellar);
        p.setValoracion(7.9f);
        p.setDuracion(169);
        p.setComentario("Al ver que la vida en la Tierra está llegando a su fin, un grupo de exploradores liderados por el piloto Cooper (McConaughey) y la científica Amelia (Hathaway) se embarca en la que puede ser la misión más importante de la historia de la humanidad y emprenden un viaje más allá de nuestra galaxia en el que descubrirán si las estrellas pueden albergar el futuro de la raza humana..");

        peliculas.add(p);

        p.setId("03");
        p.setTitulo("Transformer");
        p.setGenero("Acción / CIFI");
        p.setPortada(R.drawable.transformers);
        p.setValoracion(5.7f);
        p.setDuracion(144);
        p.setComentario("Dos razas de robots extraterrestres transformables (los villanos \"decepticons\" y los amistosos \"autobots\") llegan a la Tierra en busca de una misteriosa fuente de poder. En la guerra que estalla entre las dos razas, los hombres toman partido por los \"autobots\". Sam Witwicky (Shia LaBeouf), un avispado adolescente, que sólo desea conquistar a la bella Mikaela (Megan Fox), se convierte en la clave de una guerra que puede destruir a la humanidad.");

        peliculas.add(p);

        p.setId("04");
        p.setTitulo("Jurassic Park");
        p.setGenero("CIFI / Aventuras");
        p.setPortada(R.drawable.jurassic);
        p.setValoracion(6.9f);
        p.setDuracion(120);
        p.setComentario("El multimillonario John Hammond consigue hacer realidad su sueño de clonar dinosaurios del Jurásico y crear con ellos un parque temático en una isla remota. Antes de abrirlo al público, invita a una pareja de eminentes científicos y a un matemático para que comprueben la viabilidad del proyecto. Pero las medidas de seguridad del parque no prevén el instinto de supervivencia de la madre naturaleza ni la codicia humana.");

        peliculas.add(p);

        p.setId("05");
        p.setTitulo("The Interview");
        p.setGenero("Acción / Comedia");
        p.setPortada(R.drawable.interview);
        p.setValoracion(5.4f);
        p.setDuracion(112);
        p.setComentario("Dave Skylark (James Franco), presentador de un conocido programa de entrevistas, y su productor, Aaron Rapoport (Seth Rogen), consiguen una entrevista exclusiva con Kim Jong-Un, dictador de Corea del Norte. Ante tal oportunidad, la CIA les pide un \"favorcillo\": asesinar a Kim. Pero lo cierto es que Dave y Aaron no son las personas más cualificadas para realizar un magnicidio. ");

        peliculas.add(p);
        return peliculas;
    }

}
