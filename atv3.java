import java.util.Scanner;

public class atv3 {
	
        public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        //Variaveis
        double numeroUm;
        double numeroDois;
        double somaDosnumeros;

        // Entrada de dados

        System.out.print("Insira o primeiro número ");
        numeroUm = entrada.nextDouble();
        System.out.print("Insira o segundo número ");
        numeroDois = entrada.nextDouble();
        entrada.close();
        //Processamento de dados

        somaDosnumeros = numeroUm + numeroDois;

        // Saida de dados
        
     System.out.println("A soma do número é " + somaDosnumeros + "");

 }
}