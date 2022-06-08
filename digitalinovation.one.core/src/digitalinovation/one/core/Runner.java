package digitalinovation.one.core;

import digitalinovation.one.utils.Calculadora;
//import digitalinovation.one.utils.interno.SumHelper;

public class Runner {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.div(15, 3));
        //SumHelper - não da pra acessar por conta da modularização
    }
}
