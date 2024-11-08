/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prograexver1;

import java.util.Scanner;

public class PrograExVer1 {

    static void Piramide(){
        //Diccionario
        Scanner S = new Scanner(System.in);
        int Fila = 0,Suma = 0, IntImpar = 1;
        
        //Entrada - Filas dentro de la piramide
        System.out.println("Cantidad de la fila de la piramide: ");
        Fila = S.nextInt();

        //Ciclo
        for (int i = 0; i < Fila; i++){
            Suma = 0;
            for (int j = 0; j <= i; j++){
                System.out.print(IntImpar + " ");
                Suma += IntImpar; //Calcula suma al final de cada fila
                IntImpar += 2; //numeros sumados dentro de la fila
            }
            
            //Salida
            System.out.print(" = " + Suma + " \n");
        }
            
    }
    

    static void Mayor(){
        //Diccionario
        int i = 1, Max = 0, ingreso, Repetir = 1, Contador = 0, Contador2 = 0, Prom = 0;
        Scanner S = new Scanner(System.in); 
        
        //Ciclo
        while (Repetir == 1){
            //Entrada - Numero
            System.out.println("Ingrese un numero (Ingrese No para terminar): ");
            ingreso = S.nextInt();
            
            //Entrada - se agregan numeros en un arreglo que se adapta constantemente
            if (ingreso != 0){
                i++; 
                int[] A = new int[i];
                A[i-1] = ingreso;
                
                //Encuentra el numero maximo
                for (int j = 0; j < i; j++){
                    Max = Math.max(Max, A[i-1]);
                }
                
                //Encuentra el numero promedio (asumiendo que es el mas repetido)
                for (int j = 1; j < i; j++)
                    for (int t = 1; t < i; t++){

                        if (A[t-1] == A[j-1]){
                            Contador++;
                            System.out.print(A[t-1]);
                        }
                        
                    if (Contador < Contador2){
                        Prom = A[j-1];
                        System.out.print(Prom);
                        Contador = Contador2;
                        }
                }
            }
            else {break;}                                
        }
        

        System.out.println("\nEl numero mayor fue: " + Max + "\nEl numero promedio fue: " + Prom);    
        
    }
    
    static void Canal(){
        //Diccionario 
        int HD = 0, Norm = 0; double Precio = 0;
        Scanner S = new Scanner(System.in);
        String Cliente, Resp, Repetir = "SI";
        
        //entrada - Nombre
        System.out.println("Ingrese su nombre: ");
        Cliente = S.nextLine();
        
        //ciclo
        while (!"NO".equals(Repetir) && !"no".equals(Repetir) && !"No".equals(Repetir) && !"nO".equals(Repetir)){
            System.out.println("Ingrese el tipo de canal que quiere (HD, Normal, HDBOX, LIGHTBOX, DVRBOX): ");
            Resp = S.next();
            
            //Agregado de precio
            if ("HD".equals(Resp)){
                HD++;
                Precio = Precio + 30;
            }
            if ("Normal".equals(Resp)){
                Norm++;
                Precio = Precio + 20;
            }
            if ("LIGHTBOX".equals(Resp)){
                Precio = Precio + 50;
            }
            if ("HDBOX".equals(Resp)){
                Precio = Precio + 100;
            }
            if ("DVRBOX".equals(Resp)){
                Precio = Precio + 150;
            }

            //Repetir o terminar
            System.out.println("Desea seguir? (SI/NO): ");
            Repetir = S.next();
        }
        
        //Calculo de precio y salida
        Precio = Precio + (Precio * 0.15);
        System.out.println("Total a pagar: Lps." + Precio + "Por el cliente: " + Cliente + "\nCantidad de canales: \nHD: " + HD + "\nNormal: " + Norm);
        
    }
    
    static void Vocales(){
        //Diccionario
        Scanner S = new Scanner(System.in); String StringTexto;
        String R = "aeiou"; //Lista de vocales
        int Repetir = 1;
        
        //ciclo
        while (Repetir == 1){
            //Entrada
            System.out.print("Ingrese una palabra");
            StringTexto = S.next();

            //Variables para ciclo
            int a = 0, Len = StringTexto.length(); 

            //ciclo
            for (int i = 0; i < Len; i++){
                char c = StringTexto.charAt(i);

                //valida vocales
                if ( c == R.charAt(0) || c == R.charAt(1) || c == R.charAt(2) || c == R.charAt(3) || c == R.charAt(4) ){
                    a++;
                }
            }

            //Salida
            System.out.println("Cantidad de vocales en la palabra: " + a);
            
            //Repeticion o Cierre de programa
            System.out.println("Desea seguir con el programa Vocales? si(1) no(0): ");
            Repetir = S.nextInt();
        }
    }
    
    
    public static void main(String[] args) {
        //Diccionario de Variables
        int MenuMain = 1, Option;
        Scanner S = new Scanner(System.in);
        
        //Programa
        while (MenuMain == 1){
            //Seleccion de opciones del menu
            System.out.println("\n *** Examen 1er Parcial *** \nOpciones: \n1.- Piramide \n2.- El Mayor \n3.- Servicio de Canales \n4.- Caracteres Vocales \n5.- Salir: \n");
            Option = S.nextInt();

            switch (Option){
                //Piramide
                case 1 -> {
                    Piramide();
                }
                
                //El mayor
                case 2 -> {
                    Mayor();
                }
                
                //Servicio Canales
                case 3 -> {
                    Canal();
                }
                
                //Caracteres Vocales
                case 4 -> { 
                    Vocales();
                }
                
                //Salida
                case 5 -> {
                    System.out.print("\nHasta Luego!!! ");
                    System.exit(0);
                }                
            }
                        
        }
        
    }
    
}
