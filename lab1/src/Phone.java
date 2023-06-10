public class Phone {

    private int id;

    private String name;

    private String middleName;

    private String surname;

    private int score;

    private int timeTownCalls;

    private int timeLongDistanceCalls;

    public Phone() {
        this.name = "";
        this.middleName = "";
        this.surname = "";
        this.score = 0;
        this.timeTownCalls = 0;
        this.timeLongDistanceCalls = 0;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setScore (int score) {
        if (score > 0) {
            this.score = score;
        } else System.out.println("Номер рахунку");
    }

    public int getTimeTownCalls() {
        return timeTownCalls;
    }

    public void setTimeTownCalls(int timeTownCalls) {
        if (timeTownCalls >= 0) {
            this.timeTownCalls = timeTownCalls;
        } else System.out.println("Час міських розмов не може бути від'ємним");
    }

    public int getTimeLongDistanceCalls() {
        return timeLongDistanceCalls;
    }

    public void setTimeLongDistanceCalls(int timeLongDistanceCalls) {
        if (timeLongDistanceCalls >= 0) {
            this.timeLongDistanceCalls = timeLongDistanceCalls;
        } else System.out.println("Час міжміських розмов не може бути від'ємним");
    }


    @Override
    public String toString() {
        return "Телефон --- " + "id=" + id + ", Прізвище=" + surname + ", Ім'я=" + name + ", По батькові=" + middleName + ", Номер рахунку=" + score + ", Час міських розмов=" + timeTownCalls + ", Час міжміських розмов=" + timeLongDistanceCalls;
    }
}