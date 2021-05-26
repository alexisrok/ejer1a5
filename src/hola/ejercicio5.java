package hola;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int cantidadImprimir,minimoBuscar,digitoBuscar = 0;


        System.out.println("Ingrese un numero n:");
        cantidadImprimir = sc.nextInt();

        System.out.println("Ingrese un numero m:");
        minimoBuscar = sc.nextInt();

        System.out.println("Ingrese un numero d:");
        digitoBuscar = sc.nextInt();

        int cantidad = 0;
        int numero = digitoBuscar;

    while(cantidad < cantidadImprimir){
       int digitosEncontrados = 0;
       int numeroIt = numero;

       while(numeroIt > 0 ){
           if(numeroIt % 10 == digitoBuscar){
               ++digitosEncontrados;
           }
           numeroIt = numeroIt/10;
       }

       if(digitosEncontrados == minimoBuscar){
           System.out.println(numero);
           ++cantidad;
       }
    }


        sc.close();
    }

}
