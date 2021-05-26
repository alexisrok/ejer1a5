package hola;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero n:");

        int n = 0;

        n = sc.nextInt();


        if(esPrimo(n)){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }

        sc.close();
    }

    public static boolean esPrimo(int num){
        int contador = 2;
        boolean primo=true;

        while ((primo) && (contador!=num)){

            if (num % contador == 0)
                primo = false;

            contador++;
        }
        return primo;
    }

}
