public class hello{
    public static void main(String args[]){
        System.out.println("Hello World!");

        byte x;//8 bits de memoria -128 a 127, es tipo entero
        short z;//16 bits de memoria -32,768 a 32,767, es de tipo entero
        int y;//32 bits de memoria
        long w;//64 nits de memoria
        z = 32767;
        x = -128;
        y=-2000000;
        w=9000000;
         

        float num1;//32 bits de memoria 
        double num2;//64 bits de memoria

        num2 = -56.5677554;
        num1 = 3.1416f;

        char letra;
        letra = 'a';

        boolean desicion;
        boolean desicion1;
        desicion1 = false;
        desicion = true;

        System.out.println("Numero Negativo " + x);
        System.out.println("Numero Positivo " + w);
        System.out.println("Numero Positivo " + z);
        System.out.println("Numero Negativo " + y);

        System.out.println("Numero Negativo " + num2);
        System.out.println("Numero decimal " + num1);

        System.out.println("Caracter = " + letra);
        System.out.println("Desicion = " + desicion);
        System.out.println("Desicion = " + desicion1);

        //No primitivo

        Integer vacio;
        vacio = null;

        System.out.println(vacio);

        //Cadenas
        String cadena = "HELLO WORL!";
        System.out.println(cadena);

        final int num3 = 5050;//Valor constante
        System.out.println(num3);
    }
}