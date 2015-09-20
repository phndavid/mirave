package com.master.ndavid.calirapido;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by N.David on 19/09/2015.
 */
public class DBHelper {
    private HashMap<String, String[]> trivia;

    public DBHelper(){
        trivia = new HashMap<>();
        //-------------------------------------------------------------------------------------------
        // Fiambre
        //-------------------------------------------------------------------------------------------
        String answer_1[] = {"Hielo, frutas, salsas, leche condensada","Hielo, queso, helado, coco,","Hielo, ripio de papa, arroz","Hielo, lulo, maiz, piña"};
        trivia.put("Mira panita llegamos a las canchas panamericanas ve. Te voy a invitar a un cholao.\n" +
               "¿Vos de que crees que está hecha esta vaina?\n",answer_1);

        String answer_2[] = {"Champus","Gaseosa","Agua,","Jugo,"};
        trivia.put("Llavecita vámonos pa’ la fritanga de Doña Rosario, veni y te invito a una empanada. \n" +
               "¿Con que será que bajamos esto?\n",answer_2);

        String answer_3[] = {"Manzamora y champus","La Lulada","Los Helados","Ponche"};
        trivia.put("Por ahí viene el de…",answer_3);

        String answer_4[] = {"La ñapa","Una más","Otrica","Jugo"};
        trivia.put("Uy no esa empanda me quedo en un diente, pidamole a Doña Rosario…",answer_4);

        String answer_5[] = {"Imagen","Imagen","Imagen","Imagen"};
        trivia.put("Amigazo, vos que crees que cual de estas vainas es un pandebono.",answer_5);
        //-------------------------------------------------------------------------------------------
        // Guaguanco
        //-------------------------------------------------------------------------------------------
        String answer_6[] = {"Oiga mire vea","Las caleñas son como las flores","Cali pachanguero","Cali"};
        trivia.put("Panita como se llama este tema ‘Oilo’.",answer_6);

        String answer_7[] = {"Juanchito","Menga","La 66","La Sexta"};
        trivia.put("Ve bacan, escucha la canción que está sonando en la radio: “¡Del puente para allá es ________, de puente para aca es Cali!”",answer_7);

        String answer_8[] = {"Las flores","Modelos","Rusas","El cielo"};
        trivia.put("Mira esa vieja Ve, es que definitivamente las caleñas son como:",answer_8);

        String answer_9[] = {"La Salsa","Reguetton","Merengue","Las Baladas"};
        trivia.put("Sabes qué? vámonos azotar baldosa al ritmo de:",answer_9);
        //-------------------------------------------------------------------------------------------
        // Musica
        //-------------------------------------------------------------------------------------------


    }
    public HashMap<String,String[]> getTrivia(){
        return trivia;
    }
}
