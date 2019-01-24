import java.util.Arrays;
import java.util.Random;

public class School {
        int em=0, t=0, l=0,el=0,s=0,c=0;
        Employee[] employes = new Employee[em];
        Teacher[] teachers = new Teacher[t];
        Learner[] learners = new Learner[l];
        String adress, name;
        Elective[] electives = new Elective[el];
        Section[] sections = new Section[s];
        Class[] classes = new Class[c];

        School(String adress, String name){
            this.adress = adress;
            this.name = name;
        }

        void addEmployee( Employee employee){
            em++;
            this.employes = Arrays.copyOf(this.employes, em);
            employes[em-1] = employee;

        }

        void addLearner(Learner learner){
            l++;
            this.learners = Arrays.copyOf(this.learners, l);
            learners[l-1]=learner;
        }
        void addTeacher(Teacher teacher){
            t++;
            this.teachers = Arrays.copyOf(this.teachers, t);
            teachers[t-1] = teacher;
        }
        void addClass(Class classn){
        c++;
        this.classes = Arrays.copyOf(this.classes, c);
        classes[c-1]=classn;
        }
        void addElective(Elective elective){
        el++;
        electives = Arrays.copyOf(this.electives, el);
        electives[el-1]=elective;
        }
        void addSection(Section section){
            s++;
            sections = Arrays.copyOf(this.sections, s);
            sections[s-1]=section;
        }


        void addToClass(Learner learn, Class add){
            add.learners = Arrays.copyOf(add.learners, add.learners.length+1);
            add.learners[add.learners.length-1]=learn;
        }
    void addToSection(Learner learn, Section add){
        add.learners = Arrays.copyOf(add.learners, add.learners.length+1);
        add.learners[add.learners.length-1]=learn;

    }void addToElective(Learner learn, Elective add){
        add.learners = Arrays.copyOf(add.learners, add.learners.length+1);
        add.learners[add.learners.length-1]=learn;
    }


    void getListTeachers(){
        System.out.println("List of teachers:");
        for(int i=0; i<teachers.length; i++){
            System.out.println("Teacher: "+teachers[i].fullName+"   Qualification: "+teachers[i].qualification);
        }
    }
    void getListEmployeers(){
        System.out.println("List of employees:");
        for(int i=0; i<employes.length; i++){
            System.out.println("Employees: "+employes[i].fullName+"  Card ID: "+employes[i].cardID+"    Phone: "+employes[i].phone+"    Position: "+employes[i].position);
        }
    }
    void getListLearners() {
        System.out.println("List of learners:");
       for (int j=0; j < classes.length; j++) {
            for (int i = 0; i < classes[j].learners.length; i++) {
                Learner student = classes[j].learners[i];
                System.out.println("Full name: " + student.fullName + "     Class: " + classes[j].number + "    Age: " + (j/2+7));
           }
        }
    }

    void getParticipant(){
            System.out.println("List of participants:");
            for(int i=0; i<employes.length;i++){
                System.out.println("Name: "+employes[i].fullName+"   Card ID: "+employes[i].cardID);
            }
        for(int i=0; i<teachers.length;i++){
            System.out.println("Name: "+teachers[i].fullName+"   Card ID: "+teachers[i].cardID);
        }
        for(int i=0; i<learners.length;i++){
            System.out.println("Name: "+learners[i].fullName+"   Card ID: "+learners[i].cardID);
        }

    }
    void getElectronicJournal(){
        System.out.println("Electronic Journal:");
        String[] week = {"Monday", "Tuesday","Wednesday","Thursday","Friday"};
        String[] sub = {"math", "literature","biology","chemistry","history","physic","geography","english","spanish","music"};
        for(int i=0; i<week.length; i++){
            System.out.println(week[i]);
            for (int j=0; j<learners.length;j++){
                System.out.println(learners[j].fullName+" "+sub[i]+" "+ (int)(10*Math.random()/2+1)+" "+sub[i+1]+" "+(int)(10*Math.random()/2+1));

            }

        }

    }
}
