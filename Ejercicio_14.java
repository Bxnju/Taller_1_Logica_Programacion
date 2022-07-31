/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°14 - LOGICA DE PROGRAMACION
 * 30/07/2022
 * ANDRES BENJUMEA REINOSO
 * 000491320
 ****************************************************************************** */

/*

INDICACIONES:



RESUMEN:

Datos de entrada: Ultimo digito del id y pago por hora
Funciones: Calcular_Bono
Datos de salida: Valor del bono ha recibir

FUNCIONAMIENTO: Se ingresa el ultimo digito del id y posteriormente el pago por hora, luego el programa calcula 
segun si es par o impar ese ultimo digito y le da el valor final del bono segun los datos recibidos.

 */

package logica_programacion.Taller_1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_14 {
    
    static Scanner in = new Scanner(System.in);
    static DecimalFormat formato = new DecimalFormat();
    
    public static void main(String[] args) {
        try {
            //VARIABLES
            
            int ult_dig_id, valor_hora;
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al programa para calcular bonos Realizado por Andres Benjumea Reinoso. \n Por favor, ingrese a continuacion el ultimo digito de su ID:");
            ult_dig_id = in.nextInt();
            System.out.println("Perfecto, ahora ingrese por favor el pago por hora en pesos colombianos:");
            valor_hora = in.nextInt();
            
            //SALIDAS
            
            System.out.println("El valor total del bono para usted es: $" + formato.format((int)(Calcular_Bono(ult_dig_id, valor_hora))));
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
    static float Calcular_Bono(int ult_dig_id, int valor_hora){
        try {
            //VARIABLES
            
            final float dias = 24, horas_dia = 8.5f;
            float modulo, porcentaje_boni, valor_bono = 0;
            
            //PROCEDIMIENTOS
            
            if(ult_dig_id >= 0 && ult_dig_id < 10){
                
                modulo = ult_dig_id / 2;
            
                if(modulo == 0) porcentaje_boni = 1.12f;
                else porcentaje_boni = 1.165f;

                valor_bono = valor_hora * dias * horas_dia * porcentaje_boni;
                
            }else{
                System.out.println("El rango para el ultimo digito del id es de 0 a 9.");
            }
            
            //SALIDAS
            
            return valor_bono;
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
            return 0;
        }
    }
}
