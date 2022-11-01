/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shakersort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Shakersort {
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
     
        int  A[]=new int [6];
        
        int i, a, Der, Izq, Aux, b;
     
        System.out.print("Ingrese dimension del arreglo: ");
        entrada = bufer.readLine();
        b = Integer.parseInt(entrada);
        
                a=b;
               Izq=2;
               Der=b;
             
        for(i=1;i<=b;i++){
            System.out.print("A["+i+"]= ");
            entrada = bufer.readLine();
            A[i] = Integer.parseInt(entrada);
            
        }
     
            do{//inicio del ordenamiento
        for(i=Der;i>=Izq;i--){//derecha a izquierda
        if(A[i-1]>A[i]){
        Aux=A[i-1];
        A[i-1]=A[i];
        A[i]=Aux;
        a=i;
    }
  }
        Izq=a+1;
            for(i=Izq;i<=Der;i++)//izquierda a derecha
        if(A[i-1]>A[i]){
         Aux=A[i-1];
        A[i-1]=A[i];
         A[i]=Aux;
        a=i;
    }
        Der=a-1;
  }     while(Izq<Der);//Fin del ordenamiento
     
            System.out.println("EL ARREGLO ORDENADO");
            for(i=1;i<=b;i++){
                System.out.println("[" +i+ "]: " + A[i]);
         
        }
 
}
}

    
    

