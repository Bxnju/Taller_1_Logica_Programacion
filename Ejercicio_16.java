/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°16 - LOGICA DE PROGRAMACION
 * 31/07/2022
 * ANDRES BENJUMEA REINOSO
 * ID: 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Un restaurante vende 3 platos. Si el cliente solicita el plato 1, le dan
el postre gratis; si selecciona el plato 2, le dan la bebida gratis 
y si selecciona el plato 3, le dan postre y bebida. Elabore un algoritmo 
y desarrolle una función en java que, dependiendo de la selección del cliente, 
el obsequio que le da el restaurante.

Defina usted los elementos de esta función de acuerdo a las recomendaciones 
vistas en clase

RESUMEN:

Datos de entrada: Seleccion de plato
Funciones: Obsequio_Plato
Datos de salida: Texto con el obsequio a recibir

FUNCIONAMIENTO: Se ingresa por consola el plato y posteriormente el programa le devuelve el obsequio a recibir

 */

package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_16 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            
            
            //VARIABLES
            
            byte seleccion_plato;
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al programa para seleccionar su plato Realizado por Andres Benjumea Reinoso. \n Por favor, seleccione el numero de su plato, (Rango: 1-3)");
            seleccion_plato = in.nextByte();
            
            //SALIDAS
            
            Obsequio_Plato(seleccion_plato);
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
    //FUNCIONES
    
    static void Obsequio_Plato(byte seleccion){
        
        try {
            //VARIABLES
            
            String obsequio = "";
            
            //PROCEDIMIENTOS Y SALIDAS
            
            if(seleccion > 0 && seleccion <= 3){
            
                switch(seleccion){
                    case 1 -> obsequio = "Postre";
                    case 2 -> obsequio = "Bebida";
                    case 3 -> obsequio = "Postre y Bebida";
                    default -> System.out.println("No ha seleccionado ninguno de los platos disponibles");
                }
                
                System.out.println("Perfecto, su seleccion de plato fue el numero " + seleccion + " y por esto, tendra " + obsequio + " gratis!");
                
            }else{
                System.out.println("La seleccion esta fuera de rango. (1-3)");
            }
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
        
    }
}
