import java.time.temporal.ValueRange;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Phone[] phonesList = phonesList();
        System.out.println("----------a)відомості про абонентів, у яких час міських розмов перевищує заданий.");
        System.out.print("Задайте час міських розмов: ");
        phoneCheckTimeTownCalls(phonesList, scanner.nextInt());

        System.out.println("----------b)Вивести відомості про абонентів, які користувалися міжміським зв'язком.");
        phoneCheckLongDistanceCalls(phonesList);

        System.out.println("----------c)відомості про абонентів чий номер рахунку знаходиться у  діапазоні: 0 - 10000");
        phoneSubscribers(phonesList);


    }


    static Phone[] phonesList() {
        {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введіть кількість абонентів: ");
            Phone[] phones = new Phone[scanner1.nextInt()];
            for (int i = 0; i < phones.length; i++) {
                phones[i] = new Phone();
                System.out.println();
                System.out.print("Введіть id: ");
                phones[i].setId(scanner1.nextInt());
                System.out.print("Введіть прізвище: ");
                phones[i].setSurname(scanner1.next());
                System.out.print("Введіть ім'я: ");
                phones[i].setName(scanner1.next());
                System.out.print("Введіть По батькові: ");
                phones[i].setMiddleName(scanner1.next());
                System.out.print("Введіть номер рахунку: ");
                phones[i].setScore(scanner1.nextInt());
                System.out.print("Введіть час міських розмов: ");
                phones[i].setTimeTownCalls(scanner1.nextInt());
                System.out.print("Введіть час міжміських розмов: ");
                phones[i].setTimeLongDistanceCalls(scanner1.nextInt());
            }

            return phones;
        }
    }

    static void phoneCheckTimeTownCalls(Phone[] phones, int time) {
        for (Phone phone : phones) {
            if (phone.getTimeTownCalls() > time) System.out.println(phone.toString());
        }
        System.out.println();
    }

    static void phoneCheckLongDistanceCalls(Phone[] phones) {
        for (Phone phone : phones) {
            if (phone.getTimeLongDistanceCalls() > 0) {
                System.out.println(phone.toString());
            }
        }
        System.out.println();
    }

    static void phoneSubscribers(Phone[] phones) {

        ValueRange rang = ValueRange.of(0, 10000);
        for (Phone phone : phones) {
            System.out.println(phone.toString());
        }
    }
}