/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°7 - LOGICA DE PROGRAMACION
 * 29/07/2022
 * ANDRES BENJUMEA REINOSO
 * ID: 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Diseñe un algoritmo e implemente una función en Java que identifique y escriba el número mayor entre 3 números 
short digitados por los usuarios. 
Defina usted los elementos de esta función de acuerdo a las recomendaciones vistas en clase.

RESUMEN:

Datos de entrada: n1, n2, n3
Funciones: Numero_Mayor 
Datos de salida: El numero mayor de entre los 3 ingresados

FUNCIONAMIENTO: Se ingresan 3 numeros y el sistema muestra en pantalla cual fue el mayor numero ingresado

 */

package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_7 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            //VARIABLES
            
            short n1, n2, n3;
            
            //PROCEDIMIENTOS
            
            System.out.println("Biendenido al sistema para calcular el numero mayor Realizado por Andres Benjumea Reinoso. \n Por favor, ingrese el primer numero:");
            n1 = in.nextShort();
            System.out.println("Ahora el segundo numero:");
            n2 = in.nextShort();
            System.out.println("Ahora el tercer numero:");
            n3 = in.nextShort();
            
            //SALIDAS
            
            Numero_Mayor(n1,n2,n3);
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
    static void Numero_Mayor(short n1, short n2, short n3){
        try {

            if(n1 > n2 && n1 > n3){
                System.out.println("El mayor numero es el: " + n1);
            }else if(n2 > n1 && n2 > n3){
                System.out.println("El mayor numero es el: " + n2);
            }else if(n3 > n1 && n3 > n2){
                System.out.println("El mayor numero es el: " + n3);
            }else{
                System.out.println("Los 3 numeros son el mismo.");
            }
            
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
}
