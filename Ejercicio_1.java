/******************************************************************************
TALLER N°1 - EJERCICIO N°1 - LOGICA DE PROGRAMACION
ANDRES BENJUMEA REINOSO
000491320
*******************************************************************************/

/*

INDICACIONES:

Diseñe y desarrolle una función en Java llamada Verificar_Orden, 
que reciba 2 números y retorne un mensaje si están en orden creciente o decreciente. 
Considere el caso en que sean iguales.

*/

package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_1 {
       
    public static void main(String[] args) {
        
        try {
            
            Scanner in = new Scanner(System.in);
            int nro_1, nro_2;
        
            System.out.println("Bienvenido al ejercicio 1 del Taller 1 Realizado por Andres Benjumea \n Por favor, ingrese a continuacion 2 numeros para que el sistema pueda identificar si estan en orden creciente, decreciente o son el mismo numero");
            System.out.println("Ingrese por favor el primer numero:");
            nro_1 = in.nextInt();
            System.out.println("Ingrese por favor el segundo numero:");
            nro_2 = in.nextInt();
            
            System.out.println(Verificar_Orden(nro_1, nro_2));
            
        } catch (Exception e) {
            System.out.println("-----------Ha ocurido un error.-----------");
        }
        
        
    }
    
    static String Verificar_Orden(int nro_1,int nro_2){
        try {
            
            String tipo = "";
            
            if(nro_1 > nro_2){
                tipo = "estan en orden decreciente";
            }else if(nro_1 < nro_2){
                tipo = "estan en orden creciente";
            }else if(nro_1 == nro_2){
                tipo = "son el mismo numero";
            }
            
            return "Los 2 numeros " + tipo;
            
        } catch (Exception e) {
            
            return "-----------Ha ocurido un error.-----------";
            
        }
    }
            
}
