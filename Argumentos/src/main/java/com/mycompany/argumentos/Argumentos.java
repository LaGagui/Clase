
package com.mycompany.argumentos;

public class Argumentos {

    public static void main(String[] args) {
         
        String argumento1;
        //String argumento2;
        
        argumento1 = args[0];
        //argumento2 = args[1];
        
        System.out.println("argumento 1: " + argumento1);
        //System.out.println("argumento 2: " + argumento2);
        
        switch(argumento1){
            case "1":{
                System.out.println("Idioma Español");
                break; 
            }  
            case "2":{
                System.out.println("Hi Bitch");
                break;
            }
            default: {
            }
        }
    }
}
