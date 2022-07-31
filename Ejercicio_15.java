/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°15 - LOGICA DE PROGRAMACION
 * 30/07/2022
 * ANDRES BENJUMEA REINOSO
 * 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Diseñe una función en Java, que reciba el id del usuario (dato entero), el nombre, el número de una habitación
y le devuelva un texto con el color, la planta y el número de camas de la habitación seleccionada.

Defina usted los elementos de esta función de acuerdo a las recomendaciones vistas en clase.

Desde el programa principal se le pregunta al usuario el id y el nombre y se calcula el 
nro de la habitación usando la función random entre 1 y 5.

RESUMEN:

Datos de entrada: Id, nombre
Funciones: Encontrar_Habitacion
Datos de salida: Texto con los datos de la habitacion seleccionada aleatoriamente

FUNCIONAMIENTO: Se ingresa el id, luego el nombre y el programa te genera un numero de habitacion aleatorio del cual luego te da 
las caracteristicas principales

 */

package logica_programacion.Taller_1;
import java.util.Scanner;

class Habitacion{
    int nro, camas;
    String color, planta;           
}

public class Ejercicio_15 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            
            //VARIABLES
            
            int id, nro_habitacion = (int)(Math.random() * 6 + 1);
            String nombre;
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al sistema para encontrar habitaciones Realizado por Andres Benjumea Reinoso. \n Por favor, ingrese su ID a continuacion:");
            id = in.nextInt();
            System.out.println("Perfecto, ahora ingrese por favor su nombre:");
            nombre = in.next();
            
            //SALIDAS
            
            Encontrar_Habitacion(id, nombre, nro_habitacion);
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
    static void Encontrar_Habitacion(int id, String nombre, int nro_habitacion){
        
        try {
            
            //VARIABLES
            
            Habitacion h1 = new Habitacion(), h2 = new Habitacion(), h3 = new Habitacion(), h4 = new Habitacion(), h5 = new Habitacion();

            //PROCEDIMIENTOS
            
                //ASIGNACIONES HABITACION 1

                h1.nro = 1;
                h1.camas = 2;
                h1.color = "Azul";
                h1.planta = "Primera";

                //ASIGNACIONES HABITACION 2

                h2.nro = 2;
                h2.camas = 1;
                h2.color = "Roja";
                h2.planta = "Primera";

                //ASIGNACIONES HABITACION 3

                h3.nro = 3;
                h3.camas = 3;
                h3.color = "Verde";
                h3.planta = "Segunda";

                //ASIGNACIONES HABITACION 4

                h4.nro = 4;
                h4.camas = 2;
                h4.color = "Rosa";
                h4.planta = "Segunda";

                //ASIGNACIONES HABITACION 5

                h5.nro = 5;
                h5.camas = 1;
                h5.color = "Gris";
                h5.planta = "Tercera";

            
                //SALIDAS   
                
                if(nro_habitacion > 0 && nro_habitacion <= 5){

                    switch(nro_habitacion){
                        case 1: System.out.println("\n Listo "+ nombre +", la habitacion seleccionada de manera aleatoria es la numero: " + h1.nro + "\n Es de color " + h1.color + ".\n Esta en la " + h1.planta + " planta.\n Tiene " + h1.camas + " camas."); break;
                        case 2: System.out.println("\n Listo "+ nombre +", la habitacion seleccionada de manera aleatoria es la numero: " + h2.nro + "\n Es de color " + h2.color + ".\n Esta en la " + h2.planta + " planta.\n Tiene " + h2.camas + " camas."); break;
                        case 3: System.out.println("\n Listo "+ nombre +", la habitacion seleccionada de manera aleatoria es la numero: " + h3.nro + "\n Es de color " + h3.color + ".\n Esta en la " + h3.planta + " planta.\n Tiene " + h3.camas + " camas."); break;
                        case 4: System.out.println("\n Listo "+ nombre +", la habitacion seleccionada de manera aleatoria es la numero: " + h4.nro + "\n Es de color " + h4.color + ".\n Esta en la " + h4.planta + " planta.\n Tiene " + h4.camas + " camas."); break;
                        case 5: System.out.println("\n Listo "+ nombre +", la habitacion seleccionada de manera aleatoria es la numero: " + h5.nro + "\n Es de color " + h5.color + ".\n Esta en la " + h5.planta + " planta.\n Tiene " + h5.camas + " camas."); break;
                        default: System.out.println("Error en la aleatorizacion de habitacion.");
                    }

                }else{
                    System.out.println("Has ingresado un numero de habitacion invalido.");
                }
                
                    
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
        
    }
    
}
