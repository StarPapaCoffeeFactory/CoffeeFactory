package Demo.CoffeeFactory.personnel.visitlimit;

/**
 * @ program: coffeefactory
 * @ description: 描述上下文  这里描述的是person与area之间的对应关系
 * @ author: YXJ
 * @ date: 2021-10-12 21:07:19
 */
public class LimitContext {
    private AbstractExpression visitlimit;
    public LimitContext(String[] persons , String[] areas)
    {
        visitlimit = new AndExpression(new TerminalExpression(persons), new TerminalExpression(areas));
    }
    public boolean canAccess(String info) {
        return visitlimit.interpret(info);
    }

    @Override
    public String toString() {
        return "class Context";
    }

}
