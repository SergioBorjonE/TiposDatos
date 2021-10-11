package com.generation;

public class Main {

    public static void main(String[] args) {
        String nombre="Sergio";  //Variable del tipo string
        byte num1 = 12;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        //datos primitivos con punto flotante
        float decimal1 = 2.71828182f;
        double decimal2 = 3.141592653589793238462d;

        //el poderosisimo char
        char caracter = 'a';

        //tipo booleano
        Boolean booleano=true;

        //Conversiones de tipos
        /*Java realiza la conversion en automatico para
        byte->short->int->long->float->double */

        byte byte1 = 10;
        short short1 = byte1;
        int int1 = short1;
        long long1 =int1;
        float float1=long1;
        double double1=float1;

        /*podemos realizar el proceso inverso bajo dos reservas
        1) el proceso ya no será automatico debemos indicarlo con un
        float b=3.51;
        int a= (int) b;
        2) Dependiendo el número original comenzaremos a perder datos
        ej sea b=3.51 que es evidentemente un float al pasarlo a int
        perderemos el .51 no recomendable en ciertos contextos
         */

        byte numbyte1 = 120;
        byte numbyte2 = 120;
        //short suma= (short) (numbyte1+numbyte2);
        //la conversion a short es necesaria pues los numeros
        // se salian de

        /*operadores aritméticos del tio Java*/
        // suma + (también para concatenar cadenas)
        // resta -
        // producto *
        // division /
        // módulo % (residuo de la division)



        int a=5;
        int b=3;
        float c=3.5f;

        int suma = a+b;
        int resta = a-b;
        float producto = b*c;
        float division1 = (a/c);
        float division2 = (float) a/b;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(producto);
        System.out.println(division1);
        System.out.println(division2);
    }


}
