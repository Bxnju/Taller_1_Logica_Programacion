/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°10 - LOGICA DE PROGRAMACION
 * 30/07/2022
 * ANDRES BENJUMEA REINOSO
 * ID: 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Diseñe un algoritmo e implemente una función en Java que reciba en 
números el día de la semana y retorne un mensaje con el día en texto, e indique si éste es laborable o no. 
El número 1 corresponde a domingo y el 7 a sábado. La función debe validar que el número esté entre 1 y 7, si esto 
es correcto lo compara contra la lista de opciones y si no es correcto, retorna un mensaje diciendo número de día no válido.
Sábados y Domingos NO son laborables.

Defina usted los elementos de esta función de acuerdo a las recomendaciones vistas en clase.

RESUMEN:

Datos de entrada:  Numero del dia
Funciones: Dias_Laborables
Datos de salida: Dia escogido segun el numero ingresado y si es laborable o no.

FUNCIONAMIENTO: Se ingresa por consola un numero del 1 al 7, el programa hace una validacion si el numero ingresado pertenece a ese
rango y luego arroja el nombre del dia y si es laborable o no.

 */

package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_10 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        try {
            //VARIABLES
            
            byte dia;

            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al programa para calcular el dia de la semana Realizado por Andres Benjumea Reinoso. \n Por favor, ingrese a continuacion el numero del dia que desea conocer: \n (Rango: 1-7)");
            dia = in.nextByte();
            
            //SALIDAS
            
            Dias_Laborables(dia);
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
    //FUNCIONES
    
    static void Dias_Laborables(byte dia){
        try {
            
            //PROCEDIMIENTOS Y SALIDAS
            
            if(dia > 0 && dia <= 7){
                switch(dia){
                    case 1: System.out.println("Has escogido el dia DOMINGO, el cual es NO laborable"); break;
                    case 2: System.out.println("Has escogido el dia LUNES, el cual es laborable"); break;
                    case 3: System.out.println("Has escogido el dia MARTES, el cual es laborable"); break;
                    case 4: System.out.println("Has escogido el dia MIERCOLES, el cual es laborable"); break;
                    case 5: System.out.println("Has escogido el dia JUEVES, el cual es laborable"); break;
                    case 6: System.out.println("Has escogido el dia VIERNES, el cual es laborable"); break;
                    case 7: System.out.println("Has escogido el dia SABADO, el cual es NO laborable"); break;
                    default: System.out.println("Has ingresado un valor incorrecto para el numero del dia."); break;
                }
            }else{
                System.out.println("Numero de dia no valido.");
            }
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
