package com.example.task06;

public class Task06 {

    public static int getCountsOfDigits(long number) {
        return (number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }

    public static int solution(int x, int y) {


        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        return getCountsOfDigits(x + y);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(12, 34);
        System.out.println(result);

    }

}
