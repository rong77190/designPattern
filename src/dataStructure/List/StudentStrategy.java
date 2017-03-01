package dataStructure.List;

/**
 * Created by Administrator on 2017/2/28/028.
 */
public class StudentStrategy implements Strategy {
    public boolean equal(Object obj1, Object obj2) {
        if (obj1 instanceof Student && obj2 instanceof Student){
            Student student1 = (Student)obj1;
            Student student2 = (Student)obj2;
            return (student1.getId()==student2.getId());
        }else
            return false;
    }

    public int compareTo(Object obj1, Object obj2) {
        Student student1 = (Student)obj1;
        Student student2 = (Student)obj2;
        return student1.compareTo(student2);
    }
}
