import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//      Пользователь вводит, сколько лет он состоит в браке. Программа должна вывести,
//      какая годовщина свадьбы будет у пользователя следующей (бумажная, ситцевая, чугунная, серебряная и.д.).
//      Не обязательно указывать все годовщины, достаточно 10-15.
        Scanner scan = new Scanner(System.in);
        System.out.println("Хотите узнать какая у вас годовщина свадьбы? Введите количество лет вашего брака: ");
        int weddingYear = scan.nextInt();
        switch (weddingYear) {
            case 0 :
                System.out.println("Поздравляю с вашей свадьбой!");
                break;
            case 1 :
                System.out.println("Поздравляю - У вас ЗЕЛЕНАЯ свадьба!");
                break;
            case 2 :
                System.out.println("Поздравляю - У вас Бумажная свадьба!");
                break;
            case 3 :
                System.out.println("Поздравляю - У вас Кожаная свадьба!");
                break;
            case 4 :
                System.out.println("Поздравляю - У вас Льняная свадьба!");
                break;
            case 5 :
                System.out.println("Поздравляю - У вас Деревянная свадьба!");
                break;
            case 6 :
                System.out.println("Поздравляю - У вас Чугунная свадьба!");
                break;
            case 7 :
                System.out.println("Поздравляю - У вас Медная свадьба!");
                break;
            case 8 :
                System.out.println("Поздравляю - У вас Жестяная свадьба!");
                break;
            case 9 :
                System.out.println("Поздравляю - У вас Фаянсовая свадьба!");
                break;
            case 10 :
                System.out.println("Поздравляю - У вас Оловянная свадьба!");
                break;
            case 11 :
                System.out.println("Поздравляю - У вас Стальная свадьба!");
                break;
            case 12 :
                System.out.println("Поздравляю - У вас Никелевая свадьба!");
                break;
            case 13 :
                System.out.println("Поздравляю - У вас Кружевная свадьба!");
                break;
            case 14 :
                System.out.println("Поздравляю - У вас Агатовая свадьба!");
                break;
            case 15 :
                System.out.println("Поздравляю - У вас Хрустальная свадьба!");
                break;
               };
//       2 Напишите консольную игру "Камень, ножницы, бумага". Пользователь вводит свой выбор
//       (в виде строки или числа - выберете что-то одно). Программа случайным образом делает свой выбор
//       и выводит на экран. Далее программа показывает, кто победитель - пользователь или программа.

        Scanner scan2 = new Scanner(System.in);
        Random random = new Random();
        System.out.println("СДЕЛАЙТЕ ВАШ ВЫБОР : 1 = КАМЕНЬ , 2 = НОЖНЕЦИ , 3 = БУМАГА : ");
        int choice = scan2.nextInt();
        int choiceComp = random.nextInt(1, 4);
        System.out.println("Ваш соперник выбрал  - " + choiceComp);
        if (choice == choiceComp) {
            System.out.println("Победителя нету вы выбрали одинаково");
        }
        System.out.println(choice + 1 < choiceComp ? "Вы проиграли :( !" : (choice - 1 == choiceComp ? "Вы проиграли :( !" : "Ура! Вы выиграли ;) !16"));

            }
}