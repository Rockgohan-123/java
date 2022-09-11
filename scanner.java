import java.util.Scanner;

public class scanner {
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        System.out.print("Input Number = ");
        float flotante;
        flotante = x.nextFloat();

        System.out.print("Input Number = ");
        int entero;
        entero = x.nextInt();

        System.out.println("The number is " + flotante);

        System.out.println("The number is " + entero);

        System.out.print("Input string : ");
        String cadena, cadena2;
        cadena = x.next();//Solamente almacenara una palabra
        System.out.print("Input string : ");
        cadena2 = x.nextLine();//Almacenara toda las palabra introducidas
        System.out.println("The string is = " + cadena);
        System.out.println("The string is = " + cadena2);

        System.out.print("Input letter : ");
        char letra;
        letra = x.next().charAt(1);
        System.out.println(letra);
    }
}
