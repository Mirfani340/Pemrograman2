import StudentClass.Student1;

public class Main {
    public static void main(String[] args) {
        Student1 s1 = new Student1("irfan", 19);

        System.out.println("Name :\t\t" + s1.getName());
        System.out.println("Age :\t\t" + s1.getAge());
        System.out.println("Kode Kelas :\t" + s1.KodeKelas());
        System.out.println("KRS :\t\t" + s1.KRS());

    }
}
