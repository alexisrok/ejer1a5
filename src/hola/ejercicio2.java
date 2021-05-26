package hola;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,m = 0;



        System.out.println("Ingrese un numero n:");
        n = sc.nextInt();

        System.out.println("Ingrese un numero m :");
        m = sc.nextInt();



        for(int i=1 ; i<n+1 ; i++){

            if(esMultiplo(i,m)){
                System.out.println("El numero "+ i +" es multiplo de "+ m);
            }
        }

        sc.close();
    }

    public static boolean esMultiplo(int a, int b){
        return (a % b) == 0;
    }
}
