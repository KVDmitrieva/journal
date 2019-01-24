public class Learner extends Participant{
    Parrent[] parrents= new Parrent[2];
    Learner(String fullName, int phone, int cardID, Parrent mom,Parrent dad){
        super(fullName, phone, cardID);
        parrents[0]=mom;
        parrents[1]=dad;
    }
}
