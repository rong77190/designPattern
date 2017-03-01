package dataStructure.List;


/**
 * Created by Administrator on 2017/2/28/028.
 */
public class Student implements Comparable<Student> {
    public int id;
    public String name;
    public int age;

    public Student(){}
    public Student(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    private Comparator<Student> comparator =  new AgeComparator();
    public Comparator getComparator() {
        return comparator;
    }
    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
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
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public int compareTo(Object o) {

        return comparator.compare(this,o);
    }
}

