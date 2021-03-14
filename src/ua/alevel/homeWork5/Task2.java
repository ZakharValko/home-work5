package ua.alevel.homeWork5;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(areFibNumbers(1,3,8,7));
    }

    public static boolean areFibNumbers(int...numbers){
        int answer = 0;
        boolean finalAnswer = false;

        for (int i = 0; i < numbers.length; i++) {
            double temp = 5 * numbers[i] * numbers[i] - 4;
            double temp1 = 5 * numbers[i] * numbers[i] + 4;
            double sq = (int) Math.sqrt(temp);
            double sq1 = (int) Math.sqrt(temp1);
            if (sq * sq == temp || sq1 * sq1 == temp1){
                answer += 1;
            }
        }
        if (answer == numbers.length){
            finalAnswer = true;
        }
        return finalAnswer;
    }
}
