

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student compare){
        if(this.getName().equals(compare.getName())){
            return 0;
        }

        return this.getName().compareTo(compare.getName());
    }

}
