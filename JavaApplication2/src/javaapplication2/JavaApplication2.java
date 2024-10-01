/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.text.DecimalFormat;
import java.util.*;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ACTIVO EL ESCANNER Y MANDO POR CONSOLA LA BIENVENIDA CON EL LOGO
        Scanner sc = new Scanner(System.in);
        final String rojo = "\u001B[31m";
        System.out.println("=========================================================\n" +
                           "|                     "+rojo+"BIENVENIDO A                      |\n" +
                           "|                  "+rojo+"MARISQUERIA GUZMAN                   |\n" +
                           "=========================================================\n" +
                           "|                                                       |\n" +
                           "|              "+rojo+"▄█▀▀▀             ▀▀▀█▄              |\n" +
                           "|             "+rojo+"▄███▄▄  ▀▄██▄▀   ▄▄███▄           |\n" +
                           "|             "+rojo+"▀██▄▄▄▄████████▄▄▄▄██▀          |\n" +
                           "|              "+rojo+" ▄▄▄▄██████████▄▄▄▄              |\n" +
                           "|              "+rojo+"▐▐▀▐▀ ▀██████▀ ▀▌▀▌▌               |\n" +
                           "|                                                       |\n" +
                           "|                                                       |\n" +
                           "=========================================================");
        
        //MANDO PRODUCTOS CON PRECIOS
        final String salmon = "Salmon";
        final String gambas = "Gambas";
        final String pulpo = "Pulpo";
        final String calamar = "Calamar";
        final String cangrejo = "Cangrejo";
        final double valorSalmon = 18;
        final double valorGambas = 12;
        final double valorPulpo = 10;
        final double valorCalamar = 8;
        final double valorCangrejo = 15; 
        final double iva = 0.21;
        System.out.println("=========================================================\n" +
                            "|                 "+rojo+"NUESTROS PRODUCTOS:                   |\n" +
                            "|   -"+salmon+"   "+valorSalmon+"                                      |\n" +
                            "|   -"+gambas+"   "+valorGambas+"                                      |\n" +
                            "|   -"+pulpo+"    "+valorPulpo+"                                      |\n" +
                            "|   -"+calamar+"  "+valorCalamar+"                                      |\n" +
                            "|   -"+cangrejo+" "+valorCangrejo+"                                      |\n" +
                            "|                                                       |\n" +
                            "=========================================================");
        //el usuario ingresa todos los datos
        System.out.println("por favor ingrese cuanto Salmon desea:");
        double cantidadSalmon = sc.nextDouble();
        System.out.println("por favor ingrese cuantas Gambas desea:");
        double cantidadGambas = sc.nextDouble();
        System.out.println("por favor ingrese cuantos Pulpos desea:");
        double cantidadPulpo = sc.nextDouble();
        System.out.println("por favor ingrese cuantos Calamares desea:");
        double cantidadCalamar = sc.nextDouble();
        System.out.println("por favor ingrese cuantos Cangrejos desea:");
        double cantidadCangrejo = sc.nextDouble();
        sc.nextLine();
        System.out.println("por favor ingrese su nombre completo: ");
        String nombre = sc.nextLine();
        //hago los calculos con los datos que ingreso el usuario
        double total = (valorPulpo*cantidadPulpo)+(valorSalmon*cantidadSalmon)+(valorGambas*cantidadGambas)+(valorCalamar*cantidadCalamar)+(valorCangrejo*cantidadCangrejo);
        //importo el decimal format para no tener que dividir por 100 y pasar a string 
        DecimalFormat fm = new DecimalFormat("##.##");
        //saco los calculos de iva repercutido y el total con iva 
        double ivaRepercutido = total*iva;
        double totalIva = ivaRepercutido+total;
        System.out.println("=========================================================\n" +
                           "|                  "+rojo+"RESUMEN DE FACTURA                    \n" +
                           "| -NOMBRE: "+nombre+"                                    \n" +
                           "|                                                        \n" +
                           "| -"+salmon+": "+cantidadSalmon+"                        \n" +
                           "| -"+gambas+": "+cantidadGambas+"                        \n" +
                           "| -"+pulpo+": "+cantidadPulpo+"                          \n" +
                           "| -"+calamar+": "+cantidadCalamar+"                      \n" +
                           "| -"+cangrejo+": "+cantidadCangrejo+"                    \n" +
                           "|                                                        \n" +
                           "| -Total sin iva: "+total+"                              \n" +
                           "| -IVA aplicado:   21%                                   \n" +
                           "| -IVA repercutido: "+fm.format(ivaRepercutido)+"        \n" +
                           "| -Total con IVA: "+fm.format(totalIva)+"                           \n" +
                           "|                                                        \n" +
                           "|              "+rojo+"MUCHAS GRACIAS POR SU COMPRA              \n" +
                           "=========================================================\n");
        
        
        
        
    }
    
}
