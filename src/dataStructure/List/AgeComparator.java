package dataStructure.List;


/**
 * Created by Administrator on 2017/2/28/028.
 */
public class AgeComparator implements Comparator<Student> {
    public int compare(Object o1, Object o2) {
        Student student1 = (Student)o1;
        Student student2 = (Student)o2;
        if (student1.getAge() > student2.getAge()){
            return 1;
        }else if (student1.getAge() < student2.getAge()) {
            return -1;
        }else {
            return 0;
        }
    }
}
