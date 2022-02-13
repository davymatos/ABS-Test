package app;

import java.util.ArrayList;
import java.util.List;
import util.Console;
import java.io.IOException;
/**
 *
 * @author davym
 */
public class Main {
    public int opcao = 0;
    public String bebida, copo, gelo, tipo;
    public String tamanho = null;
    
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.view();
    }
    public String tipoCopo(String bebida){
        this.bebida = bebida;
        this.copo = copo;
        
         if(bebida == "SUCO DE UVA" || bebida == "SUCO DE LARANJA"){ 
             copo = "Copo de plástico";
         }
        else{
            copo = "Copo de papel";
        }
        return copo;
        
    }
    public void view()throws IOException{
        do{
            do{
                System.out.println("\nSEJA BEM VINDO");
                System.out.println("+-------------------------------+");
                System.out.println("|1 - COCA-COLA                  |"
                        + "\n+-------------------------------+\n"
                        + "|2 - GUARANÁ                    |"
                        + "\n+-------------------------------+\n"
                        + "|3 - SUCO DE UVA                |"
                        + "\n+-------------------------------+\n"
                        + "|4 - SUCO DE LARANJA            |"
                        );
                System.out.println("+-------------------------------+");
                System.out.printf("Selecione o Sabor da bebida: ");

                opcao = Console.readInt();

                if(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
                    System.out.println("Opção Inválida");
                }
            }while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4);
            
            if(opcao == 1){
                bebida = "COCA-COLA";
            }
            else if(opcao == 2){
                bebida = "GUARANÁ";
            }
            else if(opcao == 3){
                bebida = "SUCO DE UVA";
            }
            else{
                bebida = "SUCO DE LARANJA";
            }
            // Atribuição copo
            if(opcao == 1 || opcao == 2){
                copo = "Copo de papel";
            }
            else{
                copo = "Copo de plástico";
            }
            
            if(opcao == 1 || opcao == 2){
                do{
                    System.out.println("+-------------------------------+");
                    System.out.println("|1 - PEQUENO(300ML)             |"
                            + "\n+-------------------------------+\n"
                            + "|2 - MÉDIO(500ML)               |"
                            + "\n+-------------------------------+\n"
                            + "|3 - GRANDE(700ML)              |"
                            + "\n+-------------------------------+"
                            );
                    System.out.printf("Selecione o tamanho da bebida: ");

                    opcao = Console.readInt(); 
                }while(opcao != 1 && opcao != 2 && opcao != 3);
                if(opcao == 1){
                    tamanho = "PEQUENO(300ML)";
                }
                else if(opcao == 2){
                    tamanho = "MÉDIO(500ML)";
                }
                else{
                    tamanho = "GRANDE(700ML)";
                }
            }
            else{
               do{
                    System.out.println("+-------------------------------+");
                    System.out.println("|1 - PEQUENO(300ML)             |"
                            + "\n+-------------------------------+\n"
                            + "|2 - GRANDE(500ML)              |"
                            + "\n+-------------------------------+"
                            );
                    System.out.printf("Selecione o tamanho da bebida: ");

                    opcao = Console.readInt();
                    if(opcao == 1){
                        tamanho = "PEQUENO(300ML)";
                    }
                    else if(opcao == 2){
                        tamanho = "GRANDE(500ML)";
                    }
                }while(opcao != 1 && opcao != 2); 
            }
            tamanho = tamanho;
            
            do{
                System.out.println("Deseja Gelo? ");
                System.out.println("Para SIM - Digite 1");
                System.out.println("Para NÃO - Digite 0");

                opcao = Console.readInt();

                if(opcao != 1 && opcao != 0){
                    System.out.println("Opção Inválida");
                }
            }while(opcao != 1 && opcao != 0);

            if(opcao == 1){
                gelo = "com gelo";
            }
            else{
                gelo = "sem gelo";
            }

            do{
                System.out.println("Como vai consumir?");
                System.out.println("1 - Delivery");
                System.out.println("2 - Comer no restaurante");

                opcao = Console.readInt();
                if(opcao != 1 && opcao != 2){
                    System.out.println("Opção Inválida");
                }
            }while(opcao != 1 && opcao != 2);
            if(opcao == 1){
                tipo = "Tampa Take Out - Delivery";
            }
            else{
                tipo = "Tampa Eat In - Comer no restaurante";
            }
            System.out.println("+--------------------------------------------------+");
            System.out.println("DETALHES DO PEDIDO");
            System.out.println(bebida + " - " + tamanho + gelo + " | " + copo);
            System.out.println(tipo);
            System.out.println("+--------------------------------------------------+");


            System.out.println("Confirmar Pedido?");
            System.out.println("1 - SIM");
            System.out.println("0 - NÃO");

            opcao = Console.readInt();
            if(opcao != 1){
                System.out.println("+-------------------------------+");
                System.out.println("Cancelado! Faça outro pedido");
            }
            
        }while(opcao !=1);
        System.out.println("Pedido sendo preparado!");
    }
}
