package com.calculator.Calculator;

public class Calculator {
    public int add(int...numbers){
        int sum=0;
        for(int num : numbers){
            sum +=num;
        }
        return sum;
    }
    public int multiply(int...numbers){
        int product =1;
        for (int num: numbers){
            product *=num;
        }
        return product;
    }
    public int division(int... numbers) {
        if (numbers.length == 0) return 0;

        int divided = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] == 0) throw new ArithmeticException("Number cannot divide by zero!");
            divided /= numbers[i];
        }
        return divided;
    }

    public int subtraction(int...numbers) {
        if (numbers.length == 0)
            return 0;
        {
            int subtracted = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                subtracted -= numbers[i];
            }
            return subtracted;
        }
    }
}
