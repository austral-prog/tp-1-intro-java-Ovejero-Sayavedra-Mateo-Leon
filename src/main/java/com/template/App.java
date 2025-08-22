package com.template;

import java.util.*;
import java.util.stream.Collectors;

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
        if(n == 0 || n == 1 ){return 1;}
        int resultado = 1;
        for (int i = 2; i <= n; i++){resultado *= i;}
        return resultado;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String palabra_inversa = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            palabra_inversa += input.charAt(i);
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
        double transform = (celsius * 1.8) + 32;
        return transform;
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        int sumaNumeros = 0;
        for (int i = 0; i < list.size(); i++){
            sumaNumeros += list.get(i);
        }
        return sumaNumeros;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        if(list.size()==0){
            throw new IllegalArgumentException("Size of list less than 1");
        }
        int minValue = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) > minValue){
                minValue = list.get(i);
            }
        }
        return minValue;
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if((list.get(i) % 2) == 0){
                evenNumbers.add(list.get(i));
            }
        }
        return evenNumbers;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        List<String> motherList= new ArrayList<>();
        //Afrefando las listas a la lista madre
        motherList.addAll(list1);
        motherList.addAll(list2);
        return motherList;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        if(list.contains(element)){
            return true;}
        else {
            return false;
        }
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        List<String> uppercases = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            uppercases.add(list.get(i).toUpperCase());
        }
        return uppercases;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> number = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            number.add(list.get(i));
        }
        return number.stream().toList();
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        return new HashSet<>(list);
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        return map.containsKey(key);
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        return map.containsValue(value);
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            result.add(entry.getKey() + " -> " + entry.getValue());
        }

        return result;
    }
}
