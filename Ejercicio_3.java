/** ****************************************************************************
 * TALLER N°1 - EJERCICIO N°3 - LOGICA DE PROGRAMACION
 * 29/07/2022
 * ANDRES BENJUMEA REINOSO
 * ID: 000491320
 ****************************************************************************** */

/*

INDICACIONES:

Diseñe y desarrolle una función en Java llamada Calcular_Propina que reciba 
del usuario la satisfacción y el valor de la cuenta y retorne el monto de la 
propina teniendo en cuenta la siguiente tabla:

Satisfacción Porcentaje de la Propina:

1 (Baja)                        3%

2(Media)                        7%

3(Alta)                         10%

En otra función devolverá el monto total a pagar por la cena, el cuál es 
calculado de la siguiente manera: El valor de la cuenta más el impuesto al 
consumo que es del 8% del valor de la cuenta más la propina. Defina usted los 
elementos de esta última función, de acuerdo a las recomendaciones vistas en clase.

RESUMEN:

Datos de entrada: valor de la cuenta sin propina ni impuestos, satisfaccion
Funciones: Calcular_Propina, Valor_Total
Datos de salida: String con el valor final de la cuenta

FUNCIONAMIENTO: Se ingresa primero la satisfaccion del 1 al 3, luego calcula la propina segun la satisfaccion, la agrega al valor de la cuenta y posteriormente calcula el valor final de la cuenta sumandole el impuesto de consumo.

 */
package logica_programacion.Taller_1;
import java.text.DecimalFormat;
import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        try {
            
            
            //VARIABLES
            
            int valor, satisfaccion;
            float valor_cuenta;
            DecimalFormat formato = new DecimalFormat();
            
            //PROCEDIMIENTOS
            
            JOptionPane.showMessageDialog(null, "Bienvenido al programa para calcular el valor final de la cuenta. \n Por favor, califique la atencion recibida siendo 1 la nota mas baja y 3 la mas alta.",
                "Calcular Cuenta - Andres Benjumea Reinoso", JOptionPane.INFORMATION_MESSAGE);
            satisfaccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es su satisfaccion?", "Calcular Cuenta - Andres Benjumea Reinoso", JOptionPane.QUESTION_MESSAGE));
            valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ahora el valor de la cuenta.."));           
            valor_cuenta = Calcular_Propina(satisfaccion, valor);
            
            //SALIDAS
            
            if( satisfaccion == 1 || satisfaccion == 2 || satisfaccion == 3){
                JOptionPane.showMessageDialog(null, "Perfecto, el valor total de la cuenta es: $" + formato.format((int)(Valor_Total(valor_cuenta))) + " COP", "Calcular Cuenta - Andres Benjumea Reinoso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ingresaste una nota de Satisfaccion Incorrecta",
                "Error - Calcular Cuenta", JOptionPane.ERROR_MESSAGE);
            }
            
                
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL PROCESO PRINCIPAL",
                "Error - Calcular Cuenta", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //FUNCIONES
    
    static float Valor_Total(float valor_cuenta){
        try {
            //VARIABLES
            
            float valor_final;
            final float impuesto = 0.08f;
            
            //PROCEDIMIENTOS
            
            valor_final = (valor_cuenta * impuesto) + valor_cuenta;
            
            //SALIDAS
            
            return valor_final;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR CALCULANDO EL VALOR TOTAL",
                "Error - Calcular Cuenta", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    static float Calcular_Propina(int satis, int valor_cuenta){
        
        try {
            
            //VARIABLES
            
                float porcentaje_propina = 0, valor_final;
                final float impuesto = 0.8f;
                
            
            //PROCEDIMIENTOS
            
                switch(satis){
                    case 1: porcentaje_propina = 0.03f; break;
                    case 2: porcentaje_propina = 0.07f; break;
                    case 3: porcentaje_propina = 0.1f; break;    
                    default: System.out.println("Error, no se elijio el valor de satisfaccion correcto");
                }
                
                valor_final = (valor_cuenta * porcentaje_propina) + valor_cuenta;
                
                return valor_final;
            
            //SALIDAS
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR CALCULANDO EL VALOR DE LA CUENTA",
                "Error - Calcular Cuenta", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
        
    }
    
}
