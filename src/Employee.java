public class Employee extends Participant{
    String position;
    Employee(String fullName, int phone, int cardID, String position){
        super(fullName, phone, cardID);
        this.position = position;
    }

}
