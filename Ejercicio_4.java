/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°4 - LOGICA DE PROGRAMACION
 * 29/07/2022
 * ANDRES BENJUMEA REINOSO
 * ID: 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Diseñe un algoritmo, defina e implemente una función en java que permita al usuario ingrese 5 números y 
adicionalmente deberá pedir otro número. El programa indicará si el último número está contenido en los primeros 5 números. 
Todos los números que serán ingresados son enteros. 
Defina usted los elementos de esta función de acuerdo a las recomendaciones vistas en clase.

RESUMEN:

Datos de entrada: un array de 5 posiciones y luego un ultimo numero para compararlos
Funciones: Buscar_Numero
Datos de salida: String que dice si lo encontro o no

FUNCIONAMIENTO: Pide primero los 5 numeros y posteriormente pide otro numero el cual lo va a comparar con los 5 primeros. Si
encuentra coincidencias dice la posicion y el numero que fue encontrado igual, sino, dice que no se encontro ninguna coincidencia.

 */
package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_4 {
    
    static Scanner in =  new Scanner(System.in);
   
    public static void main(String[] args) {
        try {

            System.out.println("Bienvenido al sistema de buscar numeros Realizado por Andres Benjumea Reinoso.");
            
            Buscar_Numero();

        } catch (Exception e) {
            System.out.println("-----------Ha ocurrido un error 1.-----------");
        }
    }
    
    //FUNCIONES
    
    static void Buscar_Numero(){
        
        try {
            
            //VARIABLES
            
            int[] nros = new int[5];
            int ultimo_nro;
        
            //PROCEDIMIENTOS
            
            System.out.println("Ingrese los primeros 5 numeros enteros para hacer la comparacion.");
        
            for (int i = 0; i <= 4; i++) {
                System.out.println("Por favor ingrese el " + (i+1) + " numero:");
                nros[i] = in.nextInt();
            }

            System.out.println("Perfecto, ahora por favor, ingrese el ultimo numero:");
            ultimo_nro = in.nextInt();
            
            //SALIDAS
            
            if(ultimo_nro == nros[0]) System.out.println("El ultimo numero coincide con el primer numero ingresado, que fue: " + nros[0]);
            else if(ultimo_nro == nros[1]) System.out.println("El ultimo numero coincide con el segundo numero ingresado, que fue: " + nros[1]);
            else if(ultimo_nro == nros[2]) System.out.println("El ultimo numero coincide con el tercer numero ingresado, que fue: " + nros[2]);
            else if(ultimo_nro == nros[3]) System.out.println("El ultimo numero coincide con el cuarto numero ingresado, que fue: " + nros[3]);
            else if(ultimo_nro == nros[4]) System.out.println("El ultimo numero coincide con el quinto numero ingresado, que fue: " + nros[4]);
            else System.out.println("El ultimo numero ingresado no coincide con ninguno de los 5 anteriores");
            
                    
        } catch (Exception e) {
            System.out.println("-----------Ha ocurrido un error.-----------");
        }
            
        
    }
    
}
