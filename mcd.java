import java.util.Scanner;

public class mcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int numero1 = input.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = input.nextInt();
        
        int mcd = calcularMCD(numero1, numero2);
        
        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es " + mcd);
    }
    
    public static int calcularMCD(int n1, int n2) {
        while (n2 != 0) {
            int resu = n2;
            n2 = n1 % n2;
            n1 = resu;
        }
        return n1;
    }
}