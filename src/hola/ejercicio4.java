package hola;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero n:");

        int n = 0;

        n = sc.nextInt();


        for(int i = 0 ; i<n; i++){
            if(esPrimo(i)){
                System.out.println(i);
            }
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
