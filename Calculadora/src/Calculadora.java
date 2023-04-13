import java.util.Scanner;

public class Calculadora {

    public static void main(String args[])
    {
        int n1, n2, total;
        Scanner s = new Scanner( System.in );

        System.out.println( "Digite o primeiro número: ");
        n1 = s.nextInt();

        System.out.println( "Digite o segundo número: ");
        n2 = s.nextInt();

        total = n1 + n2;

        System.out.println( "O total da soma é: " + total );
    }
}
