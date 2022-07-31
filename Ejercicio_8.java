/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°8 - LOGICA DE PROGRAMACION
 * 29/07/2022
 * ANDRES BENJUMEA REINOSO
 * ID: 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Diseñe un algoritmo e implemente una función en Java que solicite dos números, 
escoja el mayor de ellos y lo eleve al cuadrado y al cubo. 
Retorne un mensaje indicando cuál fue el número mayor, su cuadrado y su cubo. 
Defina usted los elementos de esta función de acuerdo a las 
recomendaciones vistas en clase.

RESUMEN:

Datos de entrada: n1, n2, n3
Funciones: Convertir_Mayor
Datos de salida: String con el numero mayor, el numero mayor al cuadrado y al cubo

FUNCIONAMIENTO: Se ingresan 3 numeros enteros, el sistema detecta cual de los 3 es el mayor y usando la funcion pow de la clase
Math elevamos este numero al cuadrado y al cubo, y lo mostramos por pantalla.

 */

package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_8 {
    
    public static void main(String[] args) {
        
        try {
           
            //VARIABLES
            
            Scanner in = new Scanner(System.in);
            int n1, n2, n3;
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al programa para convertir el numero mayor de una serie Realizado por Andres Benjumea Reinoso. \n Por favor ingrese el primer numero");
            n1 = in.nextInt();
            System.out.println("Ahora ingrese el segundo numero:");
            n2 = in.nextInt();
            System.out.println("Ahora ingrese el tercer numero");
            n3 = in.nextInt();
            
            //SALIDAS
            
            Convertir_Mayor(n1, n2, n3);
            
        } catch (Exception e) {
            System.out.println("El programa ha sido interrumpido por un error.");
        }
    }
    
    static void Convertir_Mayor(int n1, int n2, int n3){
        try {
            //VARIABLES

            double cuadrado, cubo;
            
            //PROCEDIMIENTOS Y SALIDAS
            
            if(n1 > n2 && n1 > n3){
                
                cuadrado = Math.pow(n1, 2);
                cubo = Math.pow(n1, 3);
                System.out.println("El numero mayor fue: " + n1 + "\n Este numero al cuadrado es: "+ (int)cuadrado +" \n Este numero al cubo es: " + (int)cubo);
                        
            }else if(n2 > n1 && n2 > n3){
                
                cuadrado = Math.pow(n2, 2);
                cubo = Math.pow(n2, 3);
                System.out.println("El numero mayor fue: " + n2 + "\n Este numero al cuadrado es: "+ (int)cuadrado +" \n Este numero al cubo es: " + (int)cubo);
                        
            }else if(n3 > n1 && n3 > n2){
                
                cuadrado = Math.pow(n3, 2);
                cubo = Math.pow(n3, 3);
                System.out.println("El numero mayor fue: " + n3 + "\n Este numero al cuadrado es: "+ (int)cuadrado +" \n Este numero al cubo es: " + (int)cubo);
                        
            }else{
                
                cuadrado = Math.pow(n1, 2);
                cubo = Math.pow(n1, 3);
                System.out.println("Los 3 numeros son el mismo. Aun asi, aqui tienes el cuadrado y el cubo de: " + n1 +"\n Este numero al cuadrado es: "+ (int)cuadrado +" \n Este numero al cubo es: " + (int)cubo);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
}

