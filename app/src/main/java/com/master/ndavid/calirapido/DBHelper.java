package com.master.ndavid.calirapido;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by N.David on 19/09/2015.
 */
public class DBHelper {

    private ArrayList<String[]> trivias;
    public DBHelper(){
        trivias = new ArrayList<>();
        //-------------------------------------------------------------------------------------------
        // Fiambre
        //-------------------------------------------------------------------------------------------
        String trivia_1[] = {
                "Fiambre",
                "Mirá panita llegamos a las canchas Panamericanas vé. Te voy a invitar a un cholao.\n" +
                "¿Vos de qué crees que está hecha esta vaina?\n",
                "Hielo, frutas, salsas, leche condensada",
                "Hielo, queso, helado, coco,",
                "Hielo, ripio de papa, arroz",
                "Hielo, lulo, maiz, piña",
                "El Cholado es un raspado de hielo, típico del departamento del Valle Del Cauca. Tiene base de frutas, jarabes de diferentes sabores y leche condesada."};
        trivias.add(trivia_1);

        String trivia_2[] = {
                "Fiambre",
                "Llavecita vámonos pa’ la fritanga de Doña Rosario, veni y te invito a una empanada. \n" +
                "¿Con que será que bajamos esto?\n",
                "Champus",
                "Gaseosa",
                "Agua,",
                "Jugo",
                "En la ciudad de Cali, la mayoría de su población tradicional acompaña las empanadas con champus la cual es una bebida típica elaborada con maíz y lulo."
        };
        trivias.add(trivia_2);

        String trivia_3[] = {
                "Fiambre",
                "¡Uy, escuchá eso! Por ahí viene el de…",
                "la Manzamora y champus",
                "La Lulada",
                "Los Helados",
                " el Ponche",
                "En la mayoría de los barrios de Cali, es común ver a una persona en un triciclo presionando una bocina con ese sonido y vendiendo estos productos."
        };
        trivias.add(trivia_3);

        String trivia_4[] = {
                "Fiambre",
                "Uy no esa empanda me quedó en un diente, pidamole a Doña Rosario…",
                "La ñapa",
                "Una más",
                "Otrica",
                "Jugo",
                "La comunidad caleña suele utilizar la palabra “ñapa” para pedir más de algo."};
        trivias.add(trivia_4);

        String trivia_5[] = {
                "Fiambre",
                "Amigazo, vos que crees que cuál de estas vainas es un pandebono.",
                "Imagen",
                "Imagen",
                "Imagen",
                "Imagen",
                "El pandebono es un panecillo característico del Valle del Cauca, elaborado con harina de maíz, queso y huevo. Se utiliza para acompañar meriendas o desayunos."};

        trivias.add(trivia_5);

        //-------------------------------------------------------------------------------------------
        // Guaguanco
        //-------------------------------------------------------------------------------------------
        String trivia_6[] = {
                "Guaguanco",
                "Panita como se llama este tema ‘Oilo’.",
                "Oiga mire vea",
                "Las caleñas son como las flores",
                "Cali pachanguero",
                "Cali",
                "Canción de Salsa, interpretada por el grupo niche."
        };
        trivias.add(trivia_6);

        String trivia_7[] = {
                "Guaguanco",
                "Ve bacan, escucha la canción que está sonando en la radio: “¡Del puente para allá es ________, de puente para aca es Cali!”",
                "Juanchito",
                "Menga",
                "La 66",
                "La Sexta",
                "Esta canción hace parte de la tradición caleña y es uno de los mas grandes éxitos del grupo."
        };
        trivias.add(trivia_7);

        String trivia_8[] = {
                "Guaguanco",
                "Mira esa vieja Ve, es que definitivamente las caleñas son como:",
                "Las flores",
                "Modelos",
                "Rusas",
                "El cielo",
                "Las caleñas son como las flores es uno de los mas grandes éxitos de PiPe Pimienta, cantante de música tropical y salsa en la década de los 70’s."
        };
        trivias.add(trivia_8);

        String trivia_9[] = {
                "Guaguanco",
                "Sabes qué? vámonos azotar baldosa al ritmo de:",
                "La Salsa",
                "Reguetton",
                "Merengue",
                "Las Baladas",
                "La salsa baile represetativo de la sucursal del cielo"
        };
        trivias.add(trivia_9);

        //-------------------------------------------------------------------------------------------
        // Pa pegarnos el borondo
        //-------------------------------------------------------------------------------------------
        String trivia_10[] = {
                "Pa pegarnos el borondo",
                "Si te vas a quedar hasta el domingo, te invito a que tiremos nado en:",
                "Río Pance",
                "Río Melendez",
                "El polideportivo",
                "El club campestre",
                "Es tradición en Cali ir los domingos al Río en Pance para pasar un rato en familia y cocinar un rico sancocho"
        };
        trivias.add(trivia_10);

    }
    public ArrayList<String[]> getTrivias(){
        return trivias;
    }
}
