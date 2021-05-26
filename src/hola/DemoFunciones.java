package hola;

import java.util.Scanner;

public class DemoFunciones {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero:");

        int i = 0;

        i = sc.nextInt();

        if(esPar(i)){
            System.out.println("El numero "+i+" es par.");

        }else{
            System.out.println("El numero "+i+" es impar.");

        }
        sc.close();
    }

    public static boolean esPar(int i){
        return i%2==0;
    }


}
