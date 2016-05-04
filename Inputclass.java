/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.easyinput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author jobayer
 */
public class Inputclass {
    
    private static  BufferedReader bufferreader(){
        BufferedReader br=new BufferedReader(
                                new InputStreamReader(System.in)
                                );
        return br;
    
    }
    
    public static int inputinteger(String message){
    System.out.println(message);
    
        
        int ret=0;
    try{
        String get=bufferreader().readLine();
        
         ret=Integer.parseInt(get);
        
        
        
    }
    catch(Exception e){
    System.out.println("Please Give correct input");
    }
    
    return ret;
    }
    
    
    public static double inputdouble(String message){
    System.out.println(message);
    
        
        double ret=0;
    try{
        String get=bufferreader().readLine();
        
         ret=Double.parseDouble(get);
        
        
        
    }
    catch(Exception e){
    System.out.println("Please Give correct input");
    }
    
    return ret;
    }
    
    
    public static double inputfloat(String message){
    System.out.println(message);
    
        
        float ret=0;
    try{
        String get=bufferreader().readLine();
        
         ret=Float.parseFloat(get);
        
        
        
    }
    catch(Exception e){
    System.out.println("Please Give correct input");
    }
    
    return ret;
    }
    
    public static String inputline(String message){
    System.out.println(message);
    
        
        
        String get="";
        
    try{
        get=bufferreader().readLine();
        
     }
    catch(Exception e){
    System.out.println("Please Give correct input");
    }
    
    return get;
    }
    
    
}
