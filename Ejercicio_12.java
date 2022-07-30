/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°12 - LOGICA DE PROGRAMACION
 * 30/07/2022
 * ANDRES BENJUMEA REINOSO
 * 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Solicite a un usuario que ingrese el número del mes, para enviarlos a una función
que, debe controlar que el mes ingresado esté entre 1 y 12 y si esto es correcto
debe comparar contra la lista y devolver el mes en texto y la cantidad de días que
tiene el mes. De lo contrario, debe devolver error en el mes.

Enero tiene 31 días

Febrero puede tener hasta 29 días

Marzo tiene 31 días

Abril tiene 30 días

Mayo tiene 31 días

Junio tiene 30 días

Julio tiene 31 días

Agosto tiene 31 días

Septiembre tiene 30 días

Octubre tiene 31 días

Noviembre tiene 30 días

Diciembre tiene 31 días

Defina usted los elementos de esta función de acuerdo a las recomendaciones vistas en clase.

RESUMEN:

Datos de entrada: Numero del Mes
Funciones: Dia_Mes
Datos de salida: Cadena de texto con el mes y la cantidad de dias que tiene

FUNCIONAMIENTO: Se ingresa por consola el numero del mes entre un rango de 1 a 12, y luego el programa arroja el mes seleccionado
y la cantidad de dias que posee.

 */

package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_12 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            //VARIABLES
            
            byte nro_mes;
                    
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al sistema para calcular los dias del mes Realizado por Andres Benjumea Reinoso. \n Por favor, ingrese el numero del mes: \n (Rango: 1-12)");
            nro_mes = in.nextByte();
            
            //SALIDAS
            
            Dias_Mes(nro_mes);
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
    static void Dias_Mes(byte nro_mes){
        try {

            //PROCEDIMIENTOS Y SALIDAS  
            
            if(nro_mes > 0 && nro_mes <= 12){
                
                switch(nro_mes){
                    case 1: System.out.println("El mes es:\n Enero y tiene 31 dias."); break;
                    case 2: System.out.println("El mes es:\n Febrero y tiene 28 o hasta 29 dias."); break;
                    case 3: System.out.println("El mes es:\n Marzo y tiene 31 dias."); break;
                    case 4: System.out.println("El mes es:\n Abril y tiene 30 dias."); break;
                    case 5: System.out.println("El mes es:\n Mayo y tiene 31 dias."); break;
                    case 6: System.out.println("El mes es:\n Junio y tiene 30 dias."); break;
                    case 7: System.out.println("El mes es:\n Julio y tiene 31 dias."); break;
                    case 8: System.out.println("El mes es:\n Agosto y tiene 31 dias."); break;
                    case 9: System.out.println("El mes es:\n Septiembre y tiene 30 dias."); break;
                    case 10: System.out.println("El mes es:\n Octubre y tiene 31 dias."); break;
                    case 11: System.out.println("El mes es:\n Noviembre y tiene 30 dias."); break;
                    case 12: System.out.println("El mes es:\n Diciembre y tiene 31 dias."); break;
                    default: System.out.println("No ha sido posible calcular el mes.");
                }
                
            }else{
                System.out.println("Error en el mes.");
            }
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
