import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private Phone[] phones = new Phone[5];
    public static void main(String[] args) {

        Main main = new Main();

        main.displayAll();

    }

    public Main(){
        phones[0] = new Phone(1, "Роман", "Олексійович", "Шевченко", 5327);
        phones[1] = new MobilePhone(2, "Василь", "Дмитрович", "Яремчук", 5981, "Lifecell", "Platinum");
        phones[2] = new LandlinePhone(3, "Ірина", "Михайлівна", "Тіцька",4564, 9.1, 6.2);
    }
    public void displayAll(){
        for (int i=0; i < phones.length; i++)
        {
            phones[i].printAll();
        }
    }
}