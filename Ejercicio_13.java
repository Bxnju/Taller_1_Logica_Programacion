/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°13 - LOGICA DE PROGRAMACION
 * 30/07/2022
 * ANDRES BENJUMEA REINOSO
 * 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Solicite al usuario ingrese los siguientes datos en formato numérico: 
día, mes, año para enviarlos a una función que retorne la fecha en el 
siguiente formato: dia de mes en texto de año.
f
Por ejemplo, si el usuario ingresa:

Dia 10

Mes 12

Año 2019

El programa debe retornar 10 de Diciembre de 2019.

Cuando el usuario ingrese la información, el programa 
debe controlar que los años no sean inferiores a 1950 ni mayores a 2020, los 
meses estén entre 1 Y 12 y para cada mes, dentro de las opciones de la lista 
de comparación, los días correctos:

Enero entre 1 y 31

Febrero entre 1 y 29

Marzo entre 1 y 31

Abril entre 1 y 30

Mayo entre 1 y 31

Junio entre 1 y 30

Julio entre 1 y 31

Agosto entre 1 y 31

Septiembre entre 1 y 30

Octubre entre 1 y 31

Noviembre entre 1 y 30

Diciembre entre 1 y 31

Defina usted los elementos de esta función de acuerdo a las 
recomendaciones vistas en clase.

RESUMEN:

Datos de entrada: dia, mes, año
Funciones: Formato_Fecha
Datos de salida: String que recoge la informacion y la devuelve con formato fecha

FUNCIONAMIENTO: Ingresa el dia, mes y año al cual le quiere dar formato. Luego el sistema arroja un texto con la fecha formateada.

 */

package logica_programacion.Taller_1;
import java.util.Scanner;

public class Ejercicio_13 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            //VARIABLES
            
            byte dia, mes;
            short anio;
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al sistema para formatear fechas Realizado por Andres Benjumea Reinoso. \n Por favor, ingrese el numero del dia:");
            dia = in.nextByte();
            
            
            
            System.out.println("Listo, ahora ingrese el numero del mes:");
            mes = in.nextByte();
            
            
            
            System.out.println("Por ultimo, ingrese el anio:");
            anio = in.nextShort();
            
            
            
            //SALIDAS
            
            Formato_Fecha(dia, mes, anio);
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
    //FUNCIONES 
    
    static void Formato_Fecha(byte dia, byte mes, short anio){
        
        try {
            //VARIABLES
            
            String nombre_mes;
            
            //PROCEDIMIENTOS
            
            if(anio > 1949 && anio <= 2020){
                
                if(mes > 0 && mes <= 12){
                    
                    if(dia > 0 && dia <= 31){
                        
                        if((dia == 31 && mes == 2) || (dia == 31 && mes == 4) || (dia == 31 && mes == 6) || (dia == 31 && mes == 9) || (dia == 31 && mes == 11) ){
                        System.out.println("El mes seleccionado no posee 31 dias.");
                        }else{

                           nombre_mes = switch(mes){
                               case 1 -> "Enero";
                               case 2 -> "Febrero";
                               case 3 -> "Marzo";
                               case 4 -> "Abril";
                               case 5 -> "Mayo";
                               case 6 -> "Junio";
                               case 7 -> "Julio";
                               case 8 -> "Agosto";
                               case 9-> "Septiembre";
                               case 10 -> "Octubre";
                               case 11-> "Noviembre";
                               case 12 -> "Diciembre"; 
                               default -> "Error nombre mes.";   
                           };
                        
                            System.out.println("La fecha seleccionada fue: " + dia + " de "+ nombre_mes + " del " + anio);
                        
                    }
                        
                    }else{
                        System.out.println("Dias fuera de rango valido. (1-31)");
                    }
                    
                }else{
                    System.out.println("Mes fuera de rango valido. (1-12)");
                }
                
            }else{
                System.out.println("Fecha fuera del rango valido.");
            }
                
            //SALIDAS
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
        
    }
}
