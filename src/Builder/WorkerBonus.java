package builder;

/**
 * 合同工的奖金计算实现类
 */
public class WorkerBonus implements Bonus{
    public String doBonus(String name) {
        return name+"奖金开始计算";
    }
}
