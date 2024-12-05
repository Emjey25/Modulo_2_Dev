package Class_01;
public class App {
    public static void main(String[] args) throws Exception {
        
        Student studentOne = new Student("Juan", 20);
        System.out.println(studentOne.toString());
        studentOne.calculatePromedio(new double[]{5.0, 4.0, 3.0, 5.0, 1.0});

        Student studentTwo = new Student("Pedro", 21);
        System.out.println(studentTwo.toString());
        studentTwo.calculatePromedio(new double[]{4.0, 5.0, 3.0, 5.0, 2.0});

        Student studentThree = new Student("Pedro", 21);
        System.out.println(studentThree.toString());
        studentThree.calculatePromedio(new double[]{2.0, 2.0, 3.0, 2.0, 2.0});
        
    }
}
