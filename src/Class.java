public class Class {
    String number;
    Teacher classTeacher;
    Learner [] learners = new Learner[0];
    Class(Teacher classTeacher, String number){
        this.number = number;
        this.classTeacher = classTeacher;
    }

    void getList(){
        for(int i=0; i<learners.length; i++){
            System.out.println("Full name: "+learners[i].fullName+" Card Id: " + learners[i].cardID + " Phone: "+learners[i].phone);
        }

    }
    void getListParrents(){
        for(int i=0;i<learners.length; i++){
            Parrent parrent1 = learners[i].parrents[0];
            Parrent parrent2 = learners[i].parrents[1];
            System.out.println("Student: "+learners[i].fullName + " Parrents: "+parrent1.fullName+" "+parrent1.phone+" "+parrent2.fullName+" "+parrent2.phone);
        }
    }
}
