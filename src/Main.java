public class Main {
    public static void main(String[] args){

        School school = new School("London", "Best school");

        Employee emp = new Employee("Adam Norman", 863745, 112, "crew"); school.addEmployee(emp);


        Teacher matht = new Teacher("John Smith", 8999444, 100, "teacher", "math"); school.addTeacher(matht);
        Teacher historyt = new Teacher("Amanda Redstone", 8999555, 101, "teacher", "history"); school.addTeacher(historyt);
        Teacher biot = new Teacher("Matthew Lamb", 8933334, 102, "teacher", "biology"); school.addTeacher(biot);
        Teacher physict = new Teacher("John Robertson", 8999445, 103, "teacher", "physic"); school.addTeacher(physict);
        Teacher chemt = new Teacher("Tyrone Griffith", 89342442, 104, "teacher", "chemistry"); school.addTeacher(chemt);
        Teacher artt = new Teacher("Donald Webster", 89675822, 105, "teacher", "art"); school.addTeacher(artt);
        Teacher musict = new Teacher("Felix Poole", 89462522, 106, "teacher", "music"); school.addTeacher(musict);
        Teacher litert = new Teacher("Jodie Hancock", 8412322, 107, "teacher", "literature"); school.addTeacher(litert);


        Parrent p11 = new Parrent("Angela Cooper", 876543);
        Parrent p12 = new Parrent("Mark Cooper", 765432);
        Parrent p21 = new Parrent("Selena Golden", 7652345);
        Parrent p22 = new Parrent("Mike Golden", 943756);
        Parrent p41 = new Parrent("Lavanda Lambert", 3265955);
        Parrent p42 = new Parrent("Sam Lambert", 86259848);

        Learner l1 = new Learner("Kenneth Cooper",342113, 113,p11,p12);  school.addLearner(l1);
        Learner l2 = new Learner("Harry Golden",456789,114,p21,p22); school.addLearner(l2);
        Learner l3 = new Learner("Emma Lambert",325367,115,p41,p42); school.addLearner(l3);
        Learner l4 = new Learner("Edward Lambert",876432,116,p41,p42); school.addLearner(l4);


        Class a1 = new Class(matht, "1a"); school.addClass(a1);
        Class b1 = new Class(historyt, "1b"); school.addClass(b1);
        Class a2 = new Class(biot, "2a"); school.addClass(a2);
        Class b2 = new Class(physict, "2b"); school.addClass(b2);


        school.addToClass(l1, a1);
        school.addToClass(l2, b1);
        school.addToClass(l3, a2);
        school.addToClass(l4, b2);



        Elective math = new Elective("Math", matht); school.addElective(math);
        Elective history = new Elective("History", historyt); school.addElective(history);
        Elective bio = new Elective("Biology", biot); school.addElective(bio);
        Elective physic = new Elective("Physic", physict); school.addElective(physic);
        Elective chem = new Elective("Chemistry", chemt); school.addElective(chem);
        Elective lit = new Elective("Literature", litert); school.addElective(lit);

        school.addToElective(l2,math);

        Section art = new Section("Art", artt); school.addSection(art);
        Section mus = new Section("Music", musict); school.addSection(mus);

        school.addToSection(l1, mus);


        school.getListTeachers();
        System.out.println();
        school.getListEmployeers();
        System.out.println();
        school.getListLearners();
        System.out.println();
        school.getParticipant();
        System.out.println();
        System.out.println("Class 1a. List of parents:");
        a1.getListParrents();
        System.out.println();
        System.out.println("Elective math. List of parents:");
        math.getListParrents();
        System.out.println();
        System.out.println("Section music. List of learners:");
        mus.getList();
        System.out.println();
        school.getElectronicJournal();




    }
}
