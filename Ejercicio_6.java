/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°6 - LOGICA DE PROGRAMACION
 * 29/07/2022
 * ANDRES BENJUMEA REINOSO
 * ID: 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Diseñe un algoritmo e implemente una función en Java 
(defina el nombre como lo hemos recomendado en clase) que reciba dos 
números enteros, calcule su residuo y retorne un booleano si la división es 
exacta true o de lo contrario false. Revise el funcionamiento del operador mod 
que le puede ayudar. Verifique que el denominador no sea cero, y en caso que sea, 
debe reportar el error y retornar false

RESUMEN:

Datos de entrada: n1, n2
Funciones: Calcular_Modulo
Datos de salida: Booleano segun si es exacta o no la division

FUNCIONAMIENTO: Se ingresan dos numeros para dividirlos entre ellos mismos. Si el modulo de la division es cero devuelve true, sino
devuelve false

 */

package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_6 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            //VARIABLES

            int n1, n2;
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al sistema para calcular modulo Realizado por Andres Benjumea Reinoso. \n Por favor, ingrese el numerador de la division:");
            n1 = in.nextInt();
            System.out.println("Listo, ahora ingrese el denominador:");
            n2 = in.nextInt();
            
            //SALIDAS
            
            System.out.println(Calcular_Modulo(n1, n2));
            
        } catch (Exception e) {
            System.out.println("-----------Ha ocurrido un error.-----------");
        }
    }
    
    static boolean Calcular_Modulo(int n1, int n2){
        try {
            //VARIABLES
            
            boolean bool = false;
            float modulo = 0;
            
            //PROCEDIMIENTOS
            
            if(n2 == 0){
                System.out.println("Error. No es posible la division entre cero.");
            }else{
                modulo = n1 % n2;
                if(modulo == 0){
                    bool = true;
                }
            }
            
            //SALIDAS
            
            return bool;
            
        } catch (Exception e) {
            return false;
        }
    }
}
