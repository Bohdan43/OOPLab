public class TextProcessor {
    private String text;
    private char symbol;
    private int k;
    private String processedText;

    public TextProcessor(String text, char symbol, int k) {
        this.text = text;
        this.symbol = symbol;
        this.k = k;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getK() {
        return this.k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public String getProcessedText() {
        return this.processedText;
    }

    public void setProcessedText(String processedText) {
        this.processedText = processedText;
    }

    public void processText() {
        String[] words = this.text.split("\\s+");
        StringBuilder sb = new StringBuilder();
        String[] var3 = words;
        int var4 = words.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String word = var3[var5];
            if (word.length() > this.k) {
                word = word.replace(String.valueOf(this.symbol), "");
            }

            sb.append(word).append(" ");
        }

        this.processedText = sb.toString().trim();
    }
}