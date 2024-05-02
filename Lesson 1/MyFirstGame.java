package lesson1;

public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 1;
        int userNumber = 48;
        do {
            if (userNumber > secretNumber) {
                System.out.println("Число " + userNumber + " больше того, что загадал компьютер");
                userNumber--;
            } else if (userNumber < secretNumber) {
                System.out.println("Число " + userNumber + " меньше того, что загадал компьютер");
                userNumber++;
            }
        } while (userNumber != secretNumber);
        System.out.println("Вы победили!");
    }
}
