import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();
        System.out.println("Введіть символ:");
        char symbol = scanner.next().charAt(0);
        System.out.println("Введіть число k:");
        int k = scanner.nextInt();
        TextProcessor textProcessor = new TextProcessor(text, symbol, k);
        System.out.println("Початковий рядок: " + textProcessor.getText());
        textProcessor.processText();
        System.out.println("Результат: " + textProcessor.getProcessedText());
    }
}