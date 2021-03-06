/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosdavidferrandez;

/**
 *
 * @author Vladimir Harkonnen
 */
public class BasicosDavidFerrandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Variables
        double tipoDouble;
        int tipoEntero;
        byte tipoByte;
        short tipoShort;
        
        //Declaracion
        tipoDouble = Double.MAX_VALUE;
        tipoEntero = 666;
        tipoByte = Byte.MAX_VALUE;
        tipoShort = Short.MIN_VALUE;
        
        //Llamadas a metodos
        mostrarDouble(tipoDouble);
        mostrarInt(tipoEntero);
        mostrarByte(tipoByte);
        mostrarShort(tipoShort);
    }
    
    public static void mostrarDouble(double valor)
    {
       System.out.println("Valor Double: " + valor);
    }
    
    public static void mostrarInt(int valor)
    {
       System.out.println("Valor Int: " + valor);
    }

    private static void mostrarByte(byte valor) 
    {
        System.out.println("Valor Byte: " + valor);
    }

    private static void mostrarShort(short valor) 
    {
        System.out.println("Valor Short: " + valor);
    }
}
