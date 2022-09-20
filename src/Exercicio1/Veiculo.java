package Exercicio1;

import java.util.Scanner;

public class Veiculo {

    static Scanner scann = new Scanner(System.in);
    private String Marca;
    private String Modelo;
    private String Placa;
    private String Cor;
    private Float km;
    private static Boolean isLigado;
    private Integer litrosCombustivel;
    private Integer Velocidade;
    private Double preco;

    public Veiculo() {
        Marca = marca;
        Modelo = modelo;
        Placa = placa;
        Cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        Velocidade = velocidade;
        this.preco = preco;

    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public Float getKm() {
        return km;
    }

    public void setKm(Float km) {
        this.km = km;
    }

    public static Boolean getIsLigado() {
        return isLigado;
    }

    public static void setIsLigado(Boolean isLigado) {
        Veiculo.isLigado = isLigado;
    }

    public Integer getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(Integer litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public Integer getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        Velocidade = velocidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public class Metodos {


        public static void acelerar() {

            System.out.println("Informe a velocidade atual: ");
            scann.next();
            int resultado1 = 0;
            int velocidade = 0;
            resultado1 = velocidade + 20;

            System.out.println(resultado1);
        }

        public static void abastecer(int litrosCombustivel) {

            System.out.println("Informe qual é o volume atual do tanque: ");
            String volumeAtual = scann.next();

            System.out.println("Informe o volume a ser abastecido: ");
            scann.next(String.valueOf(litrosCombustivel));

            if (litrosCombustivel + volumeAtual) <60 {

                int resultado2 = Integer.parseInt(litrosCombustivel + volumeAtual);
                abastecer(litrosCombustivel);
                System.out.println(resultado2);
            } else{

                System.out.println("O volume a abastecer excede o limite do tanque");

            }
        }

        public static void frear() {

            System.out.println("Informe a velocidade atual: ");
            scann.next();
            int velocidade = 0;
            int resultado3 = 0;
            resultado3 = velocidade - 20;

            System.out.println(resultado3);
        }

        public static void pintar(String cor) {

            System.out.println("Informe a cor que deseja pintar o carro: ");
            scann.next();
            System.out.println("O carro foi pintado de " + scann.next());

        }

        public static void ligar() {

            if (isLigado) {
                System.out.println("O carro já está ligado: ");
            } else {
                System.out.println("Ligar o carro");
            }

        }

        public static void desligar() {

            if (isLigado) {
                System.out.println("Desligar o carro. ");
            }
        }
    }
}
