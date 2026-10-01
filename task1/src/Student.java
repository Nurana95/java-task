public class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    public Student(int id, String name, int age, String grade) {
        this.id = id;
        setName(name);
        setAge(age);
        setGrade(grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0){
        this.age = age;}
        else {
            System.out.println("error");

        }
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        for (int i = 0; i < grade.length(); i++) {
            int c = grade.charAt(i);
            if (c>11||c<1){
                System.out.println("error");

            }else {
                this.grade = grade;
            }
        }
    }
}

