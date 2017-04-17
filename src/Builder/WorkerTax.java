package builder;

/**
 * 劳务工的个人所得税计算实现类
 */
public class WorkerTax implements Tax {
    public String doTax(String name) {
        return name+"个人所得税开始计算";
    }
}
