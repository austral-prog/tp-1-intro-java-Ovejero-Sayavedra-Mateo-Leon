package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if (number%2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if(a>b){
            return a;
        }
        else if (b>a) {
            return b;
        }
        else{
            return a;
        }
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        if(n == 0 || n == 1 ){
            return 1;
        }
        if(n<0){
            return 1;
        }
        if(n > 1){
            int resultado = 1;
            for (int i = 1; i <= n; i++){
                resultado *= n;
            }
            return resultado;
        }
    return 1;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        int contador = 0;
        for(int i = 0; i <= input.length(); i++){
            contador += i;
        }
        return contador;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String palabra_inversa = "";
        for (int i = 0; i < input.length(); i++) {
            palabra_inversa = palabra_inversa + input.charAt(i);
        }
        return palabra_inversa;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if(number == 1){return false;}
        else if(number == 3 || number == 2){return true;}
        else if(number % 2 == 0 || number % 3 == 0){return false;}
        else if(number >= 5){for (int i = 5; i*i <= number; i += 6){
            if (number % i == 0 || (number % (i + 2)) == 0){
                return false;
            }
        }}
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        if(array == null || array.length == 0){return 0;}
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minValue){minValue = array[i];}
        }
        return minValue;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int result = 0;
        if (array == null) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double transform = (celsius * (9/5)) + 32;
        return transform;
    }
}
