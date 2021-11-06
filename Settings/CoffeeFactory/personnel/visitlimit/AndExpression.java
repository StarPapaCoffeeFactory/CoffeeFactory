package Settings.CoffeeFactory.personnel.visitlimit;

/**
 * @description: 拆解表达式并判断合法
 * @author: YXJ
 * @date: 2021-10-12 20:01:22
 */
public class AndExpression implements AbstractExpression {

    private AbstractExpression person = null;

    private AbstractExpression area = null;

    public AndExpression(AbstractExpression person, AbstractExpression area) {
        this.person = person;
        this.area = area;
    }

    public boolean interpret(String info) {
        //info格式 ： person access area
        String[] s = info.split(" access ");
        if(s.length !=2)
        {
            System.out.println("错误 : 非法的表达式  —— AndExpression.interpret");
            return false;
        }
        return person.interpret(s[0]) && area.interpret(s[1]);
    }

    @Override
    public String toString() {
        return "class AndExpression implements Expression";
    }
}
