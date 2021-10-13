package Settings.CoffeeFactory.personnel.visitlimit;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

/**
 * @ program: coffeefactory
 * @ description: 存储表达式的终结符  在此例中用于存储 person 或 area 的数据
 * @ author: YXJ
 * @ date: 2021-10-12 20:55:33
 */
public class TerminalExpression implements AbstractExpression{
    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        set.addAll(Arrays.asList(data));
    }

    public boolean interpret(String info) {
        return set.contains(info);
    }

    @Override
    public String toString()
    {
        return "class TerminalExpression implements Expression";
    }
}
