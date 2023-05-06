public class Phone{
    private int id;
    private String name;
    private String middleName ;
    private String surname;
    private long phoneNumber;

    public Phone (int id, String name, String middleName ,
                  String surname, long phoneNumber){
        this.id = id;
        this.name = name;
        this.middleName  = middleName ;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }


    public String getMiddleName () {
        return middleName ;
    }


    public String getSurname() {
        return surname;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }


    public void printAll(){
        System.out.println("\nPhone ID = "+id+"\nName of the phone user = "+name+"\nMiddle name of the phone user = "+middleName +"\nSurname of the phone user = "+surname+"\nPhone number = "+phoneNumber);
    }

}