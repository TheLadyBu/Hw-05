public class Main {

    public static void main(String[] args) {
        String month = "November";
        // Виведення пори року
        switch (month) {
            case "September":
            case "October":
            case "November": {
                System.out.println("Now is Fall");
                break;
            }
            case "January":
            case "February":
            case "December": {
                System.out.println("Now is Winter");
                break;
            }
            case "March":
            case "April":
            case "May": {
                System.out.println("Now is Spring");
                break;
            }
            case "June":
            case "July":
            case "August": {
                System.out.println("Now is Summer");
                break;
            }
            default:
                System.out.println("Not such a season");
        }
        // Обчислення суми кратних 3 чисел від 20 до 100
        int sum = 0;
        for (int i = 20; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        // Виведення суми в консоль
        System.out.println("The sum of multiples of 3 numbers from 20 to 100 is equal: " + sum);
    }
}