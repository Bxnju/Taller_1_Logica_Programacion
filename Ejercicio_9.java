/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°9 - LOGICA DE PROGRAMACION
 * 29/07/2022
 * ANDRES BENJUMEA REINOSO
 * 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Diseñe un algoritmo e implemente una función en Java llamada Calcular_Salario, que 
reciba el nombre de un trabajador, el valor de la hora y la cantidad de horas trabajadas 
en el mes.

El trabajador debe trabajar 172 horas por lo menos cada mes y no puede 
pasar de 200 horas. Se debe verificar que la cantidad de horas recibidas 
en la función, están dentro de este rango. Sino debe dar un mensaje indicando 
que las horas están fuera del rango.

Adicionalmente, y para los trabajadores que se les reporta bien las
horas, se debe liquidar así: si el valor bruto a recibir es mayor a $2.100.000 
se hace un descuento del 6%, de lo contrario no se hace descuento.

Al final debe retornar un texto como el siguiente ejemplo:

Nombre: Juan Machado

Valor Hora: $20000

Cantidad de horas: 200

Valor Bruto a recibir: $400000

Descuento: $240.000

Valor Neto a recibir: $3760000

RESUMEN:

Datos de entrada: nombre, valor de hora y horas trabajadas
Funciones: Calcular_Salario
Datos de salida: String con todos los datos recogidos

FUNCIONAMIENTO: Se ingresa por consola el nombre, las horas trabajadas y el valor por hora, luego el programa 
mediante una funcion calcular_salario, obtiene el salario a recibir, cumpliendo ciertas condiciones dadas previamente.

 */
package logica_programacion.Taller_1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_9 {
    
    static DecimalFormat formato = new DecimalFormat();
    
    public static void main(String[] args) {
        try {
            //VARIABLES

            Scanner in = new Scanner(System.in);
            String nombre;
            int horas_trabajadas, valor_hora;
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al sistema para calcular salarios Realizado por Andres Benjumea Reinoso. \n A continuacion, ingrese su nombre por favor:");
            nombre = in.nextLine();
            System.out.println("Listo " + nombre + ", ahora ingrese por favor el pago por hora:");
            valor_hora = in.nextInt();
            System.out.println("Ingrese por favor las horas trabajadas:");
            horas_trabajadas = in.nextInt();
            
            //SALIDAS
            
            Calcular_Salario(nombre, valor_hora, horas_trabajadas);
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
    static void Calcular_Salario(String nombre, int valor_hora, int horas_trabajadas){
        try {
            //VARIABLES
            
            int salario_bruto, salario_neto, descuento;
            final float porcentaje_descuento = 0.06f;

            //PROCEDIMIENTOS Y SALIDAS
            
            if(horas_trabajadas >= 172 && horas_trabajadas < 201){
                
                salario_bruto = horas_trabajadas * valor_hora;
                
                if(salario_bruto > 2100000){
                    
                    descuento = (int)(salario_bruto * porcentaje_descuento);
                    salario_neto = salario_bruto - descuento;
                    
                    System.out.println("\n Nombre: " + nombre + "\n Valor hora: $" + formato.format(valor_hora) + "\n Cantidad de horas: " + formato.format(horas_trabajadas) + "\n Valor bruto a recibir: $" + formato.format(salario_bruto) + "\n Descuento: $" + formato.format(descuento) + "\n Valor Neto a recibir: $" + formato.format(salario_neto));
                }else{
                    System.out.println("\n Nombre: " + nombre + "\n Valor hora: $" + formato.format(valor_hora) + "\n Cantidad de horas: " + formato.format(horas_trabajadas) + "\n Valor total a recibir: $" + formato.format(salario_bruto));
                }
                
            }else{
                System.out.println("Las horas trabajadas estan fuera de rango.");
            }
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
