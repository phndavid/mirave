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
                "Mira panita llegamos a las canchas panamericanas ve. Te voy a invitar a un cholao.\n" +
                "¿Vos de que crees que está hecha esta vaina?\n",
                "Hielo, frutas, salsas, leche condensada",
                "Hielo, queso, helado, coco,",
                "Hielo, ripio de papa, arroz",
                "Hielo, lulo, maiz, piña",
                "Raspado de hielo, típico del departamento del Valle Del Cauca con base de frutas, jarabes de diferentes sabores y leche condesada."};
        trivias.add(trivia_1);

        String trivia_2[] = {
                "Fiambre",
                "Llavecita vámonos pa’ la fritanga de Doña Rosario, veni y te invito a una empanada. \n" +
                "¿Con que será que bajamos esto?\n",
                "Champus",
                "Gaseosa",
                "Agua,",
                "Jugo",
                "En la ciudad de Cali, la mayoría de su población tradicional, acompaña las empanadas con champus, la cual es una bebida típica elaborada con maíz y lulo."
        };
        trivias.add(trivia_2);

        String trivia_3[] = {
                "Fiambre",
                "Por ahí viene el de…",
                "Manzamora y champus",
                "La Lulada",
                "Los Helados",
                "Ponche",
                "En la mayoría de los barrios de Cali, es común ver a una persona en bicicleta montado en su triciclo y presionando una bocina con el sonido particular."
        };
        trivias.add(trivia_3);

        String trivia_4[] = {
                "Fiambre",
                "Uy no esa empanda me quedo en un diente, pidamole a Doña Rosario…",
                "La ñapa",
                "Una más",
                "Otrica",
                "Jugo",
                "La comunidad caleña suele utilizar la palabra “ñapa” para pedir más de algo."};
        trivias.add(trivia_4);

        String trivia_5[] = {
                "Fiambre",
                "Amigazo, vos que crees que cual de estas vainas es un pandebono.",
                "Imagen",
                "Imagen",
                "Imagen",
                "Imagen",
                "panecillo característico del Valle del Cauca, elaborado con harina de maíz, queso y huevo. Se utiliza para acompañar meriendas o desayunos."};

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
        // Musica
        //-------------------------------------------------------------------------------------------


    }
    public ArrayList<String[]> getTrivias(){
        return trivias;
    }
}
