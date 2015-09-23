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
                "1",
                "Fiambre",
                "Mirá panita, llegamos a las canchas Panamericanas vé. Te voy a invitar a un cholao.\n" +
                "¿Vos de qué crees que está hecha esta vaina?\n",
                "Hielo, frutas, salsas, leche condensada",
                "Hielo, queso, helado, coco",
                "Hielo, ripio de papa, arroz",
                "Hielo, lulo, maiz, piña",
                "El Cholado es un raspado de hielo, típico del departamento del Valle Del Cauca. Tiene base de frutas, jarabes de diferentes sabores y leche condesada.",
                "verde"
        };
        trivias.add(trivia_1);

        String trivia_2[] = {
                "2",
                "Fiambre",
                "Llavecita vámonos pa’ la fritanga de Doña Rosario, vení y te invito a una empanada. \n" +
                "¿Con qué será que bajamos esto?\n",
                "Champus",
                "Gaseosa",
                "Agua",
                "Jugo",
                "En la ciudad de Cali, la mayoría de su población tradicional acompaña las empanadas con champus la cual es una bebida típica elaborada con maíz y lulo.",
                "rojo"

        };
        trivias.add(trivia_2);

        String trivia_3[] = {
                "3",
                "Fiambre",
                "¡Uy, escuchá eso! Por ahí viene el de…",
                "La Manzamora y champus",
                "La Lulada",
                "Los Helados",
                "El Ponche",
                "En la mayoría de los barrios de Cali, es común ver a una persona en un triciclo presionando una bocina con ese sonido y vendiendo mazamorra y champus.",
                "naranja"

        };
        trivias.add(trivia_3);

        String trivia_4[] = {
                "4",
                "Fiambre",
                "¡Uy no! Esa empanda me quedó en un diente, pidamosle a Doña Rosario…",
                "La ñapa",
                "Una más",
                "Otrica",
                "Jugo",
                "La comunidad caleña suele utilizar la palabra “ñapa” para pedir más de algo.",
                "amarillo"
        };
        trivias.add(trivia_4);

        String trivia_5[] = {
                "5",
                "Fiambre",
                "Amigazo, vos que crees que cuál de estas vainas es un pandebono.",
                "Imagen",
                "Imagen",
                "Imagen",
                "Imagen",
                "El pandebono es un panecillo característico del Valle del Cauca, elaborado con harina de maíz, queso y huevo. Se utiliza para acompañar meriendas o desayunos.",
                "rojo"
        };

        trivias.add(trivia_5);

        //-------------------------------------------------------------------------------------------
        // Guaguanco
        //-------------------------------------------------------------------------------------------
        String trivia_6[] = {
                "6",
                "Guaguanco",
                "Panita cómo se llama este tema, ‘Oilo’.",
                "Oiga mire vea",
                "Las caleñas son como las flores",
                "Cali pachanguero",
                "Cali",
                "Canción de Salsa, interpretada por el grupo niche.",
                "rosa"
        };
        trivias.add(trivia_6);

        String trivia_7[] = {
                "7",
                "Guaguanco",
                "Ve bacán, escuchá la canción que está sonando en la radio: “¡Del puente para allá es ________, del puente para acá está Cali!”",
                "Juanchito",
                "Menga",
                "La 66",
                "La Sexta",
                "Esta canción hace parte de la tradición caleña y es uno de los más grandes éxitos del grupo.",
                "verde"
        };
        trivias.add(trivia_7);

        String trivia_8[] = {
                "8",
                "Guaguanco",
                "Mirá esa vieja Ve, es que definitivamente las caleñas son como:",
                "Las flores",
                "Modelos",
                "Rusas",
                "El cielo",
                "Las caleñas son como las flores es uno de los mas grandes éxitos de PiPe Pimienta, cantante de música tropical y salsa en la década de los 70’s.",
                "oro"
        };
        trivias.add(trivia_8);

        String trivia_9[] = {
                "9",
                "Guaguanco",
                "Sabes qué? vámonos azotar baldosa al ritmo de:",
                "La Salsa",
                "Reguetton",
                "Merengue",
                "Las Baladas",
                "La salsa baile represetativo de la sucursal del cielo",
                "rojo"
        };
        trivias.add(trivia_9);

        //-------------------------------------------------------------------------------------------
        // Pa pegarnos el borondo
        //-------------------------------------------------------------------------------------------
        String trivia_10[] = {
                "10",
                "Pa pegarnos el borondo",
                "Si te vas a quedar hasta el domingo, te invito a que tiremos nado en:",
                "El Río Pance",
                "El Río Melendez",
                "El polideportivo",
                "El club campestre",
                "Es tradición en Cali ir los domingos al Río en Pance para pasar un rato en familia y cocinar un rico sancocho.",
                "amarillo"
        };
        trivias.add(trivia_10);
        String trivia_11[] = {
                "11",
                "Pa pegarnos el borondo",
                "Ve te veo como gordo, deberíamos de ir mañana a quemar esas empanaditas a:",
                "Cerro de las tres cruces",
                "Canchas panamericanas",
                "Gimnasio",
                "Club campestre",
                "Uno de los sitios preferidos de los Caleños para hacer ejercicio es el Cerro de la tres cruces, ubicado en el barrio Normandía en el oeste de la ciudad.",
                "rosa"
        };
        trivias.add(trivia_11);
        String trivia_12[] = {
                "12",
                "Pa pegarnos el borondo",
                "Pelao estás como achantado, vamos a tirar caja escuchando a los cuenteros en:",
                "San Antonio",
                "Parque de la Caña",
                "Parque de Jovita Feijoo",
                "La estatua de Sebastián de Belalcazar",
                "En el barrio San Antonio se encuentran una de las iglesias más históricas de la ciudad, aquí se reúnen personas a contar historias o cuentos que hacen reír.",
                "oro"
        };
        trivias.add(trivia_12);
        String trivia_13[] = {
                "13",
                "Pa pegarnos el borondo",
                "Tengo ganas de salir a darme un borondo, camina pal Bulevar del Río y de paso de presento:",
                "Iglesia la Ermita",
                "Iglesia la Merced",
                "Plaza de Toros",
                "Estación del Ferrocarril",
                "El bulevar del río es un sendero peatonal, al margen del río Cali, que recorre varios sitios turísticos como la Ermita y el Gato de Tejada.",
                "verde"
        };
        trivias.add(trivia_13);
        //-------------------------------------------------------------------------------------------
        // Cultura
        //-------------------------------------------------------------------------------------------
        String trivia_14[] = {
                "14",
                "Cultura",
                "Parcerito, vos me caíste muy bien, te invito a que vengas el 25 de diciembre para que disfrutemos de:",
                "La Feria de Cali",
                "El Festival Mundial de Salsa",
                "La Feria de las Flores",
                "El Petronio Alvares",
                "A partir del 25 de diciembre, en Cali se celebra su fiesta más popular, la Feria de Cali, 5 días de fiesta y homenajes a la cultura caleña.",
                "rojo"
        };
        trivias.add(trivia_14);
        String trivia_15[] = {
                "15",
                "Cultura",
                "Panita, si vas a volver por estos lados en diciembre me avisás para que vayamos al Bulevar del Río y veas lo bonito que es:",
                "El Alumbrado de Cali",
                "El Río Cali",
                "La plaza de Caicedo",
                "La Rueda",
                "A partir del 7 de diciembre hasta principios de enero, se exhibe en el Bulevar del Río el alumbrado navideño de la ciudad el cual es visitado por muchos habitantes y visitantes."
                ,"azul"
        };
        trivias.add(trivia_15);
        String trivia_16[] = {
                "16",
                "Cultura",
                "Panita, ¿Vos no tenés ahijados? Aquí en Cali le podés dar el mejor regalo, comprale unas:",
                "Macetas",
                "Almojabanas",
                "Canicas",
                "Lamparas",
                "En Cali es costumbre celebrar el día de los ahijados regalando unas deliciosas macetas la cual es un arreglo de figuras de azúcar adornadas de papelillos de colores.",
                "naranja"
        };
        trivias.add(trivia_16);
        String trivia_17[] = {
                "17",
                "Cultura",
                "¿Sabes que me encantaba hacer cuando pequeño? Ir a volar cometa al parque del Ingenio, si querés probar pegate otro borondo por Cali en el mes de:",
                "Agosto",
                "Marzo",
                "Diciembre",
                "Junio",
                "Durante el mes de agosto, los parques de Cali se llenan de gente para elevar cometas de todo tipo y estilo.",
                "amarillo"
        };
        trivias.add(trivia_17);
        //-------------------------------------------------------------------------------------------
        // Palabras tipicas
        //-------------------------------------------------------------------------------------------
        String trivia_18[] = {
                "18",
                "Palabras tipicas",
                "Mirá, la gente a veces me dice que los caleños hablamos muy raro vé, ¿Vos si me entendes si te digo que pidas una ‘chuspa’?",
                "Bolsa",
                "Caja",
                "Flor",
                "Mujer",
                "Cali es la única ciudad del mundo que le dice ‘chuspa’ a una bolsa de plástico. Una tradición un poco rara.",
                "oro"
        };
        trivias.add(trivia_18);
        String trivia_19[] = {
                "19",
                "Palabras tipicas",
                "Mirá, la gente a veces me dice que los caleños hablamos muy raro vé, ¿Vos si me entendes si te digo que vayamos por el ‘fiambre’?",
                "La comida",
                "Un arma de fuego",
                "Un alambre",
                "Un ave exótica de la región",
                "La expresión ‘fiambre’ es una forma muy popular en la ciudad para referirse a la comida.",
                "oro"
        };
        trivias.add(trivia_19);
        String trivia_20[] = {
                "20",
                "Palabras tipicas",
                "Panita, por ahí dicen la malas lenguas que en Cali todos somos ‘melómanos’, ¡Y la verdad es que sí! ¿Vos si sabes de qué te estoy hablando?",
                "Fanáticos de la salsa y la música",
                "Fanáticos del fútbol",
                "Fanáticos del ajedrez",
                "Fanáticos del ballet",
                "El melómano es aquél que siente extrema pasión por la música. En Cali lo hacemos por la salsa.",
                "oro"
        };
        trivias.add(trivia_20);
        String trivia_21[] = {
                "21",
                "Palabras tipicas",
                "Vos a mí me caíste muy bien vé, de ahora en adelante vamos a ser panitas, ¿Si me entendés?",
                "Amigos",
                "Familiares",
                "Conocidos",
                "Enemigos",
                "En Cali se le suele llamar parce, pana o llave a los amigos.",
                "oro"
        };
        trivias.add(trivia_21);

    }
    public ArrayList<String[]> getTrivias(){
        return trivias;
    }
}
