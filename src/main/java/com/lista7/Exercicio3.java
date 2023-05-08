package com.lista7;
import java.util.Scanner;

public class Exercicio3
{
    public static void main( String[] args )
    {
        double produto,produto10,np;
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        produto = leia.nextDouble();
        produto10 = produto  *10/100;
        np=produto10 + produto;
        System.out.println("Com um acrescimo de 10%, o valor é de " + np);
        leia.close();
    }

    public Double produto(double  produto) {
        return produto;
    }

    public Double produto10(double produto10) {
        return produto10;
    }

    public Double np(double np) {
        return np;
    }
}


