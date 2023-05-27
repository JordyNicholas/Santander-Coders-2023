package Exercícios;
import java.util.Scanner;

public class exercicios
{
public static void main(String[] args)
    {
        System.out.printf("--- Moisés, bem vindo ao Jorbank!\n");

        try (Scanner s = new Scanner (System.in)) {
            int I = 0;
            float val;
            float saldo = 1000;
            float poup = 500;

                do{
                System.out.println("Digite 1 para APLICAR.\nDigite 2 para RESGATAR.\nDigite 3 para SAIR.");
                System.out.printf("\nSeu saldo atual é de R$ %.2f", saldo);
                System.out.printf("\nSua poupança atual é de R$ %.2f", poup);
                System.out.println("\n");
                I = s.nextInt();
                    if(I == 1)
                    {
                    System.out.printf("\nValor da aplicação: ");
                    val = s.nextFloat();
                    if(val > saldo)
                        System.out.printf("\nSaldo de conta corrente insuficiente.\n");
                    else
                    {
                        saldo = saldo - val;
                        poup = poup + val;
                        System.out.println("\nAplicação realizada com sucesso.");
                        System.out.printf("\nValor do saldo: %.2f", saldo);
                        System.out.printf("\nValor da poupança: %.2f\n", poup);
                    }
                
                    }else if (I == 2)
                    {
                    System.out.printf("\nValor do resgate: ");
                    val = s.nextFloat();
                    if(val > poup)
                        System.out.println("\nSaldo da poupança insuficiente.\n");
                    else
                        {
                        saldo = saldo + val;
                        poup = poup - val;
                        System.out.println("\nResgate realizado com sucesso.");
                        System.out.printf("\nValor do saldo: %.2f", saldo);
                        System.out.printf("\nValor da poupança: %.2f\n", poup);
                        };
                    }
                    else
                       System.out.println("\nAté logo!");
                }while (I != 3);
        }
        };

        /*int T = 1;
        int M = 5;
        int C = 10;

       do{
            T++;
            C = C * T;
        }while(T < M);
        System.out.printf("Total: %d", C);*/
}; 