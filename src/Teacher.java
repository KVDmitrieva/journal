public class Teacher extends Participant {

    String position, qualification;

    Teacher(String fullName, int phone, int cardID, String position, String qualification){
        super(fullName, phone, cardID);
        this.position = position;
        this.qualification = qualification;
    }

}
