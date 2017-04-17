package builder;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class Cilent {

    public static void main(String[] args) {
        Director director = new Director();
        director.setFactory(new WorkerFactory());
        System.out.println(director.doSalary("劳务工"));
    }

    
}
