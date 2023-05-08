package com.lista7;
import org.junit.Test;

public class Exercicio3Test
{
   
        @Test 
        public  void testeAcrescimo10(){
             Exercicio3 tAcrescimo10 = new Exercicio3();
             Double produto = tAcrescimo10.produto(50);
             Double produto10 = tAcrescimo10.produto10(5);
             Double np = tAcrescimo10.np(55);
             System.out.println(produto + "" + produto10 + "" + ""+np);
}
}
