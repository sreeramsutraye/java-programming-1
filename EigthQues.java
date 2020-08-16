package com.jetbrains;
import java.util.*;
class customException extends Exception{
    @Override
    public String getMessage() {
        return "Strings are actually not allowed in this particular function";
    }
}
class genericFunctionClass{
    public <T> void genericFunction(T... args){
       int itemsToPrint = (args.length * 2)/3;
       try{
           for(T i : args){
               if(i instanceof String){
                    throw new customException();
               }
           }
           for(int i = 0; i <= itemsToPrint ; i ++){
               System.out.println(args[i]);
           }
       }catch(customException e){
           System.out.println(e.getMessage());
       }
    }
}
public class Main {
    Main(){
        genericFunctionClass generic = new genericFunctionClass();
        generic.genericFunction(1,2,3,"String");
        generic.genericFunction(2,4,6,8,10,12,14,16,18);
    }
    public static void main(String[] args) {
        Main test = new Main();
    }
}
