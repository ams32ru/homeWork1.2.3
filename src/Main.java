public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int oldYears = 2022 - 200;
        int futureYears = 2022 + 100;
        for (int i = oldYears; i < futureYears; i++) {
            if (i % 79 == 0){
                System.out.println("Комета видна в " + i + " году");
            }
        }
        System.out.println("Задание 2");
        int num2 = 2;
        for (int i = 1; i <=10; i++) {
            System.out.println("2" + "*" + i + "=" + num2*i);


        }
    }
}