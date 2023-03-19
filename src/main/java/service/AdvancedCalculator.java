package service;

public class AdvancedCalculator {

    private Calculator basicCalculator;

    public void setBasicCalculator(Calculator basicCalculator) {
        this.basicCalculator = basicCalculator;
    }

    public int add(int a,int b){
        return basicCalculator.add(a,b);
    }

    public int diff(int a,int b){
        return basicCalculator.diff(a,b);
    }

    public int multiply(int a,int b){
        return basicCalculator.multiply(a,b);
    }

    public int div(int a,int b){
        return basicCalculator.div(a,b);
    }

    public  int square(int a){
        return a*a;
    }
}
