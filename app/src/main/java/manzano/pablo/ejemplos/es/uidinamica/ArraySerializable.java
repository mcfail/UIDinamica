package manzano.pablo.ejemplos.es.uidinamica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by AlumnoT on 24/02/2015.
 */
public class ArraySerializable implements Serializable {

    public ArrayList<Pelicula> data = null;

    public ArraySerializable(ArrayList<Pelicula> data) {
        super();
        this.data = arrayPelis();
    }
    public static ArrayList<Pelicula> arrayPelis(){
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

        Pelicula p = new Pelicula();
        p.setId("01");
        p.setTitulo("Las aventuras de Ford Fairlane");
        p.setGenero("Acción / Comedia");
        p.setPortada(R.drawable.fordfairlane);
        p.setValoracion(3.0f);
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
        p.setValoracion(4f);
        p.setDuracion(169);
        p.setComentario("Al ver que la vida en la Tierra está llegando a su fin, un grupo de exploradores liderados por el piloto Cooper (McConaughey) y la científica Amelia (Hathaway) se embarca en la que puede ser la misión más importante de la historia de la humanidad y emprenden un viaje más allá de nuestra galaxia en el que descubrirán si las estrellas pueden albergar el futuro de la raza humana..");

        peliculas.add(p);

        p.setId("03");
        p.setTitulo("Transformer");
        p.setGenero("Acción / CIFI");
        p.setPortada(R.drawable.transformers);
        p.setValoracion(3f);
        p.setDuracion(144);
        p.setComentario("Dos razas de robots extraterrestres transformables (los villanos \"decepticons\" y los amistosos \"autobots\") llegan a la Tierra en busca de una misteriosa fuente de poder. En la guerra que estalla entre las dos razas, los hombres toman partido por los \"autobots\". Sam Witwicky (Shia LaBeouf), un avispado adolescente, que sólo desea conquistar a la bella Mikaela (Megan Fox), se convierte en la clave de una guerra que puede destruir a la humanidad.");

        peliculas.add(p);

        p.setId("04");
        p.setTitulo("Jurassic Park");
        p.setGenero("CIFI / Aventuras");
        p.setPortada(R.drawable.jurassic);
        p.setValoracion(3f);
        p.setDuracion(120);
        p.setComentario("El multimillonario John Hammond consigue hacer realidad su sueño de clonar dinosaurios del Jurásico y crear con ellos un parque temático en una isla remota. Antes de abrirlo al público, invita a una pareja de eminentes científicos y a un matemático para que comprueben la viabilidad del proyecto. Pero las medidas de seguridad del parque no prevén el instinto de supervivencia de la madre naturaleza ni la codicia humana.");

        peliculas.add(p);

        p.setId("05");
        p.setTitulo("The Interview");
        p.setGenero("Acción / Comedia");
        p.setPortada(R.drawable.interview);
        p.setValoracion(3f);
        p.setDuracion(112);
        p.setComentario("Dave Skylark (James Franco), presentador de un conocido programa de entrevistas, y su productor, Aaron Rapoport (Seth Rogen), consiguen una entrevista exclusiva con Kim Jong-Un, dictador de Corea del Norte. Ante tal oportunidad, la CIA les pide un \"favorcillo\": asesinar a Kim. Pero lo cierto es que Dave y Aaron no son las personas más cualificadas para realizar un magnicidio. ");

        peliculas.add(p);

        ////////

        p.setId("06");
        p.setTitulo("Birdman");
        p.setGenero("Drama / Comedia");
        p.setPortada(R.drawable.birdman);
        p.setValoracion(4f);
        p.setDuracion(118);
        p.setComentario("Después de hacerse famoso interpretando a un célebre superhéroe, la estrella Riggan Thomson (Michael Keaton) trata de darle un nuevo rumbo a su vida, luchando contra su ego, recuperando a su familia y preparándose para el estreno de una obra teatral en Broadway que le reafirme en su prestigio profesional como actor..");

        peliculas.add(p);

        p.setId("07");
        p.setTitulo("Pacific Rim");
        p.setGenero("Acción / CiFi");
        p.setPortada(R.drawable.pacific);
        p.setValoracion(3.0f);
        p.setDuracion(131);
        p.setComentario("Cuando legiones de monstruosas criaturas, denominadas Kaiju, comienzan a salir del mar, se inicia una guerra que acabará con millones de vidas y que consumirá los recursos de la humanidad durante interminables años. Para combatir a los Kaiju gigantes diseñan un tipo especial de arma: enormes robots, llamados Jaegers, que son controlados simultáneamente por dos pilotos cuyas mentes están bloqueadas en un puente neural. Pero incluso los Jaegers proporcionan poca defensa ante los incansables Kaiju. A punto de la derrota, las fuerzas que defienden a la humanidad no tienen otra elección que recurrir a dos insólitos héroes: un ex piloto acabado (Charlie Hunnam) y un aprendiz que todavía no se ha puesto a prueba (Rinko Kikuchi). Ambos se unen para traer a un legendario pero al parecer obsoleto Jaeger del pasado. Juntos, son la última esperanza de la humanidad frente al Apocalipsis que se avecina.");

        peliculas.add(p);

        p.setId("08");
        p.setTitulo("Dos tontos todavía más tontos");
        p.setGenero("Comedia");
        p.setPortada(R.drawable.tontos);
        p.setValoracion(2f);
        p.setDuracion(109);
        p.setComentario("Han pasado ya veinte años desde que Harry y Lloyd se conocieran y formaran el divertido dúo que nos hizo reír con sus disparatadas ocurrencias, pero ninguno de los dos parece haber madurado. Harry tiene una hija a la que apenas conoce, y necesitando un trasplante de riñón, intenta localizarla para pedirle que le done uno de los suyos.");

        peliculas.add(p);

        p.setId("09");
        p.setTitulo("Karate a muerte en Torremolinos");
        p.setGenero("Comedia/Terror/Acción");
        p.setPortada(R.drawable.karate);
        p.setValoracion(1f);
        p.setDuracion(79);
        p.setComentario("Torremolinos, año 2000. La que parece una de las ciudades más ociosas del mundo está a punto de sumergirse en una ola de terror. El malévolo Dr. Malvedades llega a la ciudad para resucitar a cuatro karatecas que murieron ahogados en la la bahía de Málaga cuando ejercían como asesinos a sueldo durante la II Guerra Mundial. Con la ayuda de los zombies, secuestrará a cinco adolescentes recién desvirgadas, a quienes utilizará para despertar al monstruo Jocántaro, engendro mitad centollo mitad pulpo que dormita en algún lugar de la costa, y conseguir dominar el mundo. Entre las secuestradas se haya Danuta, la novia de un surfer católico y voluntariamente célibe, Jess, que hará lo imposible para rescatarla. Para ello reúne a sus amigos -un cura, una monja, un yuppie y un karateca-, y juntos invocan al espíritu del profesor Miyagi, quien les enseña el difícil arte del karate para hacer frente a los esbirros del Dr. Malvedades. Mientras tanto, las autoridades, desconcertadas ante la ola de secuestros, encargan primero a Chuck Lee, karateca de fama internacional, y después al Dr. Orloff, un parapsicólogo en perpetuo trance cannábico, el rescate de las adolescentes y la lucha contra el Dr. Malvedades.");

        peliculas.add(p);

        p.setId("10");
        p.setTitulo("Austin Powers: Miembro de oro");
        p.setGenero("Comedia");
        p.setPortada(R.drawable.powers);
        p.setValoracion(3f);
        p.setDuracion(90);
        p.setComentario("El agente Austin Powers se enfrenta de nuevo al doctor Maligno y a su cómplice Mini-Yo, quien tras escapar de una cárcel de máxima seguridad obliga a Austin a ponerse de nuevo en acción. Miembro de Oro, un misterioso personaje que ayuda al doctor Maligno en su plan para dominar el mundo, viaja en el tiempo y secuestra al padre del protagonista.");

        peliculas.add(p);


        return peliculas;
    }

}
