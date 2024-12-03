public class Student {
    
    private String name;
    private int age;
    private double promedio;


    public Student(String name, int age, double promedio) {
        this.name = name;
        this.age = age;
        this.promedio = promedio;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public double getPromedio() {
        return promedio;
    }


    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void calculatePromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota; // suma = suma + nota
        }
        this.promedio = suma / notas.length;
        IsAproved(this.promedio);
    }
        

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public void IsAproved(double promedio) {
        if(promedio >= 3.0){
            this.promedio = promedio;
            System.out.println("Aprobado con " + promedio);
        }else{
            this.promedio = promedio;
            System.out.println("Reprobado   con " + promedio);
        }
    }





    



    








}
