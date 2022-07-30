/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°2 - LOGICA DE PROGRAMACION
 * 29/07/2022
 * ANDRES BENJUMEA REINOSO
 * 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Diseñe y desarrolle una función en Java llamada Calcular_Costo la cual, 
dada la duración en minutos de una llamada retorne el costo, considerando:

Hasta tres minutos el costo es 0.50

Por encima de tres minutos es 0.50 más 0.1*cada minuto adicional a los tres primeros


RESUMEN:

Datos de entrada: int minutos_llamada
Funciones: Calcular_Costo
Datos de salida: float costo_final

FUNCIONAMIENTO: El programa saluda y pide por consola un numero entero de minutos de 
duracion de una llamada. Si este valor es menor o igual que 3, pero, mayor que cero, 
la llamada costara 0.5 que es un valor fijo. Sino, el programa calcula los minutos adicionales 
al cargo basico y se lo suma para devolver el costo final de la llamda.

 */

//BLIBIOTECAS

package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        try {
            
            //VARIABLES
            
            Scanner in = new Scanner(System.in);
            int minutos_llamada;
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al Ejercicio 2 del Taller 1 Realizado por Andres Benjumea. \n Por favor, ingrese a continuacion los minutos de la llamada teniendo en cuenta que: \n El cargo basico de la llamada es de  $0.5 hasta los 3 min de duracion. \n Para una llamada de duracion mayor a 3 min, se aplicara el cargo basico mas $0.1 por cada minuto adicional. ");
            minutos_llamada = in.nextInt();
            
            
            //SALIDAS
            
            if(minutos_llamada != 0 && minutos_llamada > 0) System.out.println("El costo final de la llamada fue de $" + Calcular_Costo(minutos_llamada));
            else System.out.println("Error. Has ingresado un numero negativo o el 0");
            
        } catch (Exception e) {
            System.out.println("-----------Ha ocurido un error.-----------");
        }
    }
    
    //FUNCIONES:
    
    static float Calcular_Costo(int minutos){
        
        try {
            
            //ENTRADAS
            
            final float costo_fijo = 0.5f, costo_ad = 0.1f;
            float costo_final = 0;
            
            //PROCEDIMIENTO
            
            if(minutos > 0 && minutos <= 3){
                costo_final = costo_fijo;
            }else if(minutos > 3){
                minutos = (minutos - 3);
                costo_final = costo_fijo + (costo_ad * minutos);
            }else{
                System.out.println("No fue posible calcular el valor de la llamada.");
            }    
            
            //SALIDAS
            
            return costo_final;
            
        } catch (Exception e) {
            System.out.println("-----------Ha ocurido un error.-----------");
            return 0;
        }
        
    }
}
