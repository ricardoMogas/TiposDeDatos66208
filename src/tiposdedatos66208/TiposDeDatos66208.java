package tiposdedatos66208;

public class TiposDeDatos66208 {
    
    public static void main(String[] args) {
    byte datoByteMin = -128;
    byte datoByteMax = 127;
    
    short datoShortMin = -32768;
    short datoShortMax = 32767;
    
    int datoIntMin = -2147483648;
    int datoIntMax = 2147483647;
    
    long datoLongMin = -9223372036854775808L;
    long datoLongMax = 9223372036854775807L;
    
    double datoDoubleMin = 2.2250738585072014e-308;
    double datoDoubleMax = 1.7976931348623158e+308;
    
    System.out.println( "BYTE:" + "Minimo valor=" + datoByteMin + "   " + "Maximo Valor=" + datoByteMax);
    System.out.println( "SHORT:" + "Minimo valor=" + datoShortMin + "   " + "Maximo Valor=" + datoShortMax);
    System.out.println( "INT:" + "Minimo valor=" + datoIntMin + "   " + "Maximo Valor=" + datoIntMax);
    System.out.println( "LONG:" + "Minimo valor=" + datoLongMin + "   " + "Maximo Valor=" + datoLongMax);
    System.out.println( "DOUBLE:" + "Minimo valor=" + datoDoubleMin + "   " + "Maximo Valor=" + datoDoubleMax);
    }
    
}
