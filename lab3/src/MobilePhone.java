public class MobilePhone extends Phone{

    private String mobileOperator;
    private String tariffName;

    public MobilePhone(int id, String name, String middleName ,
                       String surname, long phoneNumber, String mobileOperator, String tariffName)
    {
        super(id, name, middleName , surname, phoneNumber);
        this.mobileOperator = mobileOperator;
        this.tariffName = tariffName;
    }

    public String getMobileOperator() {
        return mobileOperator;
    }

    public void setMobileOperator(String mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    @Override
    public void printAll()
    {
        super.printAll();
        System.out.println("Mobile operator = "+mobileOperator+"\nMobile tariff = "+tariffName);
    }
}