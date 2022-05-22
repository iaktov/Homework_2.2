
public class Main {
    public static void main(String[] args) {

        Hogwarts harry = new Gryffindor("Harry Potter", 86, 36, 53, 61, 50);
        Hogwarts hermione = new Gryffindor("Hermione Granger", 87, 95, 69, 40, 71);
        Hogwarts ron = new Gryffindor("Ron Weasley", 63, 40, 63, 56, 99);

        Hogwarts zacharias = new Hufflepuff("Zacharias Smith", 42, 23, 63, 51, 42);
        Hogwarts cedric = new Hufflepuff("Cedric Diggory", 46, 22, 36, 41, 50);
        Hogwarts justin = new Hufflepuff("Justin Finch-Fletchley", 40, 33, 30, 35, 40);

        Hogwarts draco = new Slytherin("Draco Malfoy", 60, 23, 50, 40, 30, 30, 90);
        Hogwarts graham = new Slytherin("Graham Montagu", 30, 30, 36, 30, 24, 37, 40);
        Hogwarts gregory = new Slytherin("Gregory Goyle", 20, 20, 20, 20, 21, 20, 1);

        Hogwarts zhou = new Ravenclaw("Zhou Chang", 40, 36, 25, 21, 41, 36);
        Hogwarts padma = new Ravenclaw("Padma Patil", 32, 24, 11, 64, 25, 70);
        Hogwarts marcus = new Ravenclaw("Marcus Belby", 15, 26, 24, 31, 52, 10);


        StudentsMethod studentsMethod = new StudentsMethod();
        studentsMethod.info(harry);
        studentsMethod.studentComprassion(harry, ron);
        studentsMethod.studentComprassionInFaculties((Slytherin) draco, (Slytherin) graham);


    }


}