public class Main {
    public static void main(String[] args) {
        int[] payments = generateRandomArray();

        //Задача 1

        int sum = 0;
        for (int payment : payments){
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int payment : payments){
            if (payment < min) {
                min = payment;
            }
            if (payment > max) {
                max = payment;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        //Задача 3

        double sum1 = (double) sum / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + sum1 + " рублей");

        //Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int s = reverseFullName.length - 1; s >= 0; s--){
            System.out.print(reverseFullName[s]);
        }
        System.out.println();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}