package Exercicio1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();

        Scanner scann = new Scanner(System.in);
        System.out.println(veiculo);

        System.out.println("Informe a marca do veículo: ");
        scann.next(veiculo.Marca);

        System.out.println("Informe a placa do veículo: ");
        scann.next(veiculo.Placa);


        System.out.printf("Informe a cor do veículo: ");
        Veiculo.Cor.scann.next();
        System.out.println("A cor do veículo é: " + Cor);

        //Acelerar

        Veiculo.acelerar();

        //Abastecer

        Veiculo.abastecer();

        //Pintar

        Veiculo.pintar();

        //Ligar
        Veiculo.ligar();

        //Desligar
        Veiculo.desligar();





    }
}
