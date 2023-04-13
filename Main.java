//cabeçalho
package Calculadora;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bem vindo a calculadora de força resultante");
        
        //funcionamento
        System.out.println("digite a massa: ");
       int f = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("digite a aceleração: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("a força resultante é de "+ f * a );
    }
    
}