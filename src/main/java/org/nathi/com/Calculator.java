package org.nathi.com;

class Calculator {
    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public int multiply(int... numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }


}
