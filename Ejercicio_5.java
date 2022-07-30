/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°5 - LOGICA DE PROGRAMACION
 * 29/07/2022
 * ANDRES BENJUMEA REINOSO
 * 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Diseñe un algoritmo, defina e implemente la función Estimar_Cambio que 
recibe un monto en pesos (COPs), arma y devuelve en un texto, el equivalente en las 
siguientes monedas, según el factor:

1 Dólar Americano = $4445

1Euro = $4560

1Dólar canadiense = $4365

1Yen japonés = $34,7

Considere para este ejercicio definir los factores como constantes y globales 
para que lo pueda usar cualquier función definida

RESUMEN:

Datos de entrada: pesos
Funciones: Estimar_Cambio
Datos de salida: Las conversiones de pesos a: USD, EUR, CAD, JDY

FUNCIONAMIENTO: Ingresa la cantidad de pesos a convertir y el programa imprime en 
pantalla el equivalente en cada una de las monedas pedidas en las indicaciones.

 */

package logica_programacion.Taller_1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_5 {
    
    //VARIABLES GLOBALES
    
    static final float dolar = 4445,euro  = 4560, dolarC = 4365, yen = 34.7f;
    static Scanner in = new Scanner(System.in);
    static DecimalFormat formato = new DecimalFormat("###.##");
    
    public static void main(String[] args) {
        try {
            //VARIABLES
            
            float pesos;
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al sistema de conversion realizado por Andres Benjumea Reinoso.\n Ingrese por favor la cantidad de pesos a convertir:");
            pesos = in.nextFloat();
            
            //SALIDAS
            
            System.out.println(Estimar_Cambio(pesos));
            
        } catch (Exception e) {
             System.out.println("-----------Ha ocurrido un error.-----------");
        }
    }
    
    //FUNCIONES
    
    static String Estimar_Cambio(float pesos){
        
        try {
            //VARIABLES
            
            float dolares, euros, dolaresC, yenes;

            //PROCEDIMIENTOS
            
            dolares = pesos / dolar;
            euros = pesos / euro;
            dolaresC = pesos / dolarC;
            yenes = pesos / yen;
            
            //SALIDAS
            
            return "Perfecto, las conversiones para $" + (int)pesos + " COP son: \n 1. Dolares Americanos: $"+formato.format(dolares)+" USD \n 2. Euros: $"+formato.format(euros)+" EUR \n 3. Dolares Canadienses: $"+formato.format(dolaresC)+" CAD \n 4. Yenes: $"+formato.format(yenes)+" JPY";
            
        } catch (Exception e) {
            return "-----------Ha ocurrido un error.-----------";
        }
        
    }
}
