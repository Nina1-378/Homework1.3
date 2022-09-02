public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка");
        }

        System.out.println("Задание 2");
        int yearOfManufactureOfTheDevice = 2014; {
        var device = clientOS == 0 ? "iOS" : "Android";
        var applicationVersion = yearOfManufactureOfTheDevice >= 2015 ? "версию" : "облегченную версию";
            System.out.print("Установите " + applicationVersion + " приложения для " + device + " по ссылке");
        }

        System.out.println("Задание 3");
        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "Год является високосным");
        } else {
            System.out.println(year + "Год не является високосным");
        }

        System.out.println("Задание 4. Вариант 1-й");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет 1 день");
        } else if ((deliveryDistance > 20) && (deliveryDistance < 60)) {
            System.out.println("Доставка займет 2 дня");
        } else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            System.out.println("Доставка займет 3 дня");
        }

        System.out.println("Задание 4. Вариант 2-й");
        int totalDeliveryDistance = 95;
        int deliveryDays = 1;
        int startInterval = 20;
        int subsequentIntervals = 40;
        if (totalDeliveryDistance < startInterval) {
            System.out.println("Доставка займет дней: " + deliveryDays);
        } else {
            deliveryDays = deliveryDays +
                    (int) Math.ceil((totalDeliveryDistance - startInterval) / (double) subsequentIntervals);
            System.out.println("Доставка займет дней: " + deliveryDays);
        }

        System.out.println("Задание 5");
        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
                System.out.print("Январь - ");
                break;
            case 2:
                System.out.print("Февраль ");
                break;
            case 3:
                System.out.print("Март ");
                break;
            case 4:
                System.out.print("Апрель ");
                break;
            case 5:
                System.out.print("Май ");
                break;
            case 6:
                System.out.print("Июнь ");
                break;
            case 7:
                System.out.print("Июль ");
                break;
            case 8:
                System.out.print("Август ");
                break;
            case 9:
                System.out.print("Сентябрь ");
                break;
            case 10:
                System.out.print("Октябрь ");
                break;
            case 11:
                System.out.print("Ноябрь ");
                break;
            case 12:
                System.out.print("Декабрь ");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого сезона не существует");
        }
    }
}