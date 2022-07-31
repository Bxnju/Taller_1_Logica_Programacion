/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°17 - LOGICA DE PROGRAMACION
 * 31/07/2022
 * ANDRES BENJUMEA REINOSO
 * ID: 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Basado en la tabla a continuación, Escriba un programa que dado el día de la semana
y el dígito final de la placa defina una función que indique si el carro tiene 
o no pico y placa.

RESUMEN:

Datos de entrada: Dia semana, Ultimo digito de la placa
Funciones: Pico_y_Placa
Datos de salida: Texto que dice si tiene o no, pico y placa

FUNCIONAMIENTO: Ingresa por consola el ultimo digito de la placa y luego el dia de la semana en texto, luego el programa verifica si
en el dia ingresado, el digito tiene pico y placa o no.

 */

package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_17 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        try {
            //VARIABLES
            
            String dia_semana, dia_semana_lower;
            byte ult_dig_placa;
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al programa para conocer el pico y placa en Medellin, Realizado por Andres Benjumea Reinoso. \n Por favor ingrese su ultimo digito de placa:");
            ult_dig_placa = in.nextByte();
            System.out.println("Bien, ahora ingrese el dia de la semana, en texto:");
            dia_semana = in.next();
            dia_semana_lower = dia_semana.toLowerCase();
            
            
            //SALIDAS
            
            if("lunes".equals(dia_semana_lower) || "martes".equals(dia_semana_lower) || "miercoles".equals(dia_semana_lower) || "jueves".equals(dia_semana_lower) || "viernes".equals(dia_semana_lower)){
                Pico_y_Placa(dia_semana, ult_dig_placa);
            }else{
                System.out.println("No se reconoce el dia de la semana ingresado");
            }
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
    //FUNCIONES
    
    static void Pico_y_Placa(String dia_semana, byte ult_dig_placa){
        
        try {
            //VARIABLES
            
            String dia;
            
            //PROCEDIMIENTOS
            
            dia = dia_semana.toLowerCase();
            
            if(ult_dig_placa >= 0 && ult_dig_placa < 10){
                
                switch (dia) {
                    case "lunes" -> {
                        if(ult_dig_placa > 5 && ult_dig_placa <= 9){
                            System.out.println("Usted SI tiene pico y placa los lunes");
                        }else{
                            System.out.println("El "+ dia +" NO tienes pico y placa");
                        }
                    }
                    case "martes" -> {
                        if(ult_dig_placa > 1 && ult_dig_placa <= 3){
                            System.out.println("Usted SI tiene pico y placa los martes");
                        }else{
                            System.out.println("El "+ dia +" NO tienes pico y placa");
                        }
                    }
                    case "miercoles" -> {
                        if(ult_dig_placa > 3 && ult_dig_placa <= 8){
                            System.out.println("Usted SI tiene pico y placa los miercoles");
                        }else{
                            System.out.println("El "+ dia +" NO tienes pico y placa");
                        }
                    }
                    case "jueves" -> {
                        if(ult_dig_placa >= 0 && ult_dig_placa < 8){
                            System.out.println("Usted SI tiene pico y placa los jueves");
                        }else{
                            System.out.println("El "+ dia +" NO tienes pico y placa");
                        }
                    }
                    case "viernes" -> {
                        if(ult_dig_placa > 0 && ult_dig_placa <= 5){
                            System.out.println("Usted SI tiene pico y placa los viernes");
                        }else{
                            System.out.println("El "+ dia +" NO tienes pico y placa");
                        }
                    }
                }
                
            }else{
                System.out.println("Ultimo digito de placa fuera de rango. (0-9)");
            }
            
            //SALIDAS
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
        
    }
}
