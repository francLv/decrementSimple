import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] enums;
        final int four = 4;
        enums = new Integer[four];
        System.out.print("Введите 4 целых числа: ");
        for (int i = 0; i < enums.length; i++){
            enums[i] = scanner.nextInt();
            enums[i]--;
        }
        for (Integer anEnum : enums) {
            System.out.print(anEnum + " ");
        }
    }
}