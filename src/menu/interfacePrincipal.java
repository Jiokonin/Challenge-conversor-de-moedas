package menu;

import Conversor.Conversor;

import java.util.Scanner;

public class interfacePrincipal {

    private Scanner entrada;
    private Conversor conversor;
    private int opcao = 0;
    private double resultado = 0;
    private double valor = 0;

    public interfacePrincipal() {
        entrada = new Scanner(System.in);
        conversor = new Conversor();
        iniciar();
    }

    private void menu(){
        System.out.print("""     
              **************************************************************
              ===== Challenge Alura ONE turma 6 - Conversor de Moedas =====
             
              1 - Dólar >>>>> Peso Argentino
              2 - Peso Argentino >>>>> Dólar
              3 - Dólar >>>>> Real
              4 - Real >>>>> Dólar
              5 - Dólar >>>>> Peso Colombiano
              6 - Peso Colombiano >>>>> Dólar
              7 - FECHAR
              
              Selecione uma das opções para conversão:
              ***************************************************************                               
              """);

    }

    private void iniciar(){
        while (opcao!=7){
            menu();
            opcao = entrada.nextInt();

            if (opcao == 7){
                break;
            }else if (opcao < 1 || opcao > 7){
                System.out.println("Opção inválida");
            }else {
                System.out.println("Insira o valor para conversão: ");
                valor = entrada.nextDouble();
            }

            if (opcao == 1){
                resultado = conversor.dolarPesoArg(valor);
                System.out.printf("O valor %.2f [USD]  vale na data da consulta:  %.2f [ARS]\n", valor, resultado);

            }else if (opcao  == 2){
                resultado = conversor.pesoArgDolar(valor);
                System.out.printf("O valor %.2f [ARS]  vale na data da consulta:  %.2f [USD]\n", valor, resultado);

            }else if (opcao == 3){
                resultado = conversor.dolarReal(valor);
                System.out.printf("O valor %.2f [USD]  vale na data da consulta:  %.2f [BRL]\n", valor, resultado);

            }else if (opcao == 4){
                resultado = conversor.realDolar(valor);
                System.out.printf("O valor %.2f [BRL]  vale na data da consulta:  %.2f [USD]\n", valor, resultado);

            } else if (opcao == 5) {
                resultado = conversor.dolarPesoCol(valor);
                System.out.printf("O valor %.2f [USD] vale na data da consulta:  %.2f [COP]\n", valor, resultado);

            } else if (opcao == 6) {
                resultado = conversor.pesoColDolar(valor);
                System.out.printf("O valor %.2f [COP]  vale na data da consulta:  %.2f [USD]\n", valor, resultado);
            }
        }
        System.out.println("Encerrando aplicação.");
        entrada.close();
    }
}