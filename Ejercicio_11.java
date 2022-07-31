/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°11 - LOGICA DE PROGRAMACION
 * 30/07/2022
 * ANDRES BENJUMEA REINOSO
 * ID: 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Un grupo de amigos hace un sorteo semanalmente con pelotas de ping pong, 
para saber quién invita y a qué la próxima salida.

Defina una función llamada Definir_Invitación que no recibe nada y 
devuelve un mensaje de texto con el color de la bola y la invitación:

verde: Invita a las cervezas (1)

azul: Invita a la pizza (2)

rojo: Invita al postre (3)

amarillo: paga el parqueadero de todos (4)

Quien saque otro color, simplemente va y disfruta. (5, 6)

Usando random de la clase math en el programa principal, calcular un aleatorio 
entre 1 y 6. Luego invoque la función enviando el aleatorio y obtenga la respuesta.

RESUMEN:

Datos de entrada: N/A
Funciones: Definir_Invitacion
Datos de salida: Color de la bola y la invitacion.

FUNCIONAMIENTO: Se ejecuta el programa y el aleatoriza entre numeros del 1 al 6. Segun el numero, corresponde 
a una bola de un color en especifico, la cual significa una invitacion para una salida de amigos.

 */

package logica_programacion.Taller_1;

public class Ejercicio_11 {
    public static void main(String[] args) {
        try {
            
            //PROCEDIMIENTOS
            
            System.out.println("Bienvenido al programa para obtener una pelota aleatoria Realizado por Andres Benjumea Reinoso.");
            
            //SALIDAS
            
            Definir_Invitacion();
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
    
    //Funciones
    
    static void Definir_Invitacion(){
        
        try {
            
            //VARIABLES
            
            byte nro_aleatorio = (byte)(Math.random() * 6 + 1);
        
            //PROCEDIMIENTOS Y SALIDAS
            
            switch(nro_aleatorio){
                case 1: System.out.println("Color de la bola: verde =  Invita a las cervezas"); break;
                case 2:System.out.println("Color de la bola: azul = Invita a la pizza"); break;
                case 3:System.out.println("Color de la bola: rojo = Invita al postre"); break;
                case 4:System.out.println("Color de la bola: amarillo = paga el parqueadero de todos"); break;
                case 5:System.out.println("Te toco disfrutar!"); break;
                case 6:System.out.println("Te toco disfrutar!"); break;
                default: System.out.println("Error en calcular el numero aleatorio."); 
            }
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
        }
        
    }
}
