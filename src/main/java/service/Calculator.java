package service;

public class Calculator {

     public int add(int a, int b){
         return a+b;
     }

    public int diff(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        if(b==0)
            return 0;
         return a/b;
    }
}
