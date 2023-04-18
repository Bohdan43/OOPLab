
public class LandlinePhone extends Phone {
    private double talkTimeInCity;
    private double talkTimeOutCity;

    public LandlinePhone (int id, String Name, String middleName , String surname, long phoneNumber, double talkTimeInCity, double talkTimeOutCity )
    {
        super(id, Name, middleName , surname, phoneNumber);
        this.talkTimeInCity = talkTimeInCity;
        this.talkTimeOutCity = talkTimeOutCity;
    }

    public double getTalkTimeInCity() {
        return talkTimeInCity;
    }

    public void setTalkTimeInCity(double talkTimeInCity) {
        this.talkTimeInCity = talkTimeInCity;
    }

    public double getTalkTimeOutCity() {
        return talkTimeOutCity;
    }

    public void setTalkTimeOutCity(double talkTimeOutCity) {
        this.talkTimeOutCity = talkTimeOutCity;
    }

    @Override
    public void printAll()
    {
        super.printAll();
        System.out.println("Talk time in city = "+talkTimeInCity+"\nTalk time out city = "+talkTimeOutCity);
    }
}