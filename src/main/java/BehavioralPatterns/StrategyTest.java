package BehavioralPatterns;

import BehavioralPatterns.StrategyPattern.Context;
import BehavioralPatterns.StrategyPattern.StrategyImpl.StrongStrategy;
import BehavioralPatterns.StrategyPattern.StrategyImpl.WeakStrategy;

/**
 * 策略模式
 *
 * 适用场景
 * 1，对客户隐藏具体策略(算法)的实现细节，彼此完全独立。
 * 2，针对同一类型问题的多种处理方式，仅仅是具体行为有差别时。
 * 3，一个类定义了很多行为，而且这些行为在这个类里的操作以多个条件语句的形式出现。
 * 策略模式将相关的条件分支移入它们各自的 Strategy 类中以代替这些条件语句。
 *
 * 优点
 * 1，策略模式提供了管理相关的算法族的办法。策略类的等级结构定义了一个算法或行为族。恰当使用继承可以把公共的代码转移到父类里面，
 * 从而避免重复的代码。
 * 2，使用策略模式可以避免使用多重条件转移语句。多重转移语句不易维护，它把采取哪一种算法或采取哪一种行为的逻辑与算法或行为的逻辑混合在一起，
 * 统统列在一个多重转移语句里面，比使用继承的办法还要原始和落后。
 *
 * 缺点
 * 1，客户端必须知道所有的策略类，并自行决定使用哪一个策略类。这就意味着客户端必须理解这些算法的区别，以便适时选择恰当的算法类。
 * 换言之，策略模式只适用于客户端知道所有的算法或行为的情况。
 * 2，策略模式造成很多的策略类，每个具体策略类都会产生一个新类。有时候可以通过把依赖于环境的状态保存到客户端里面，而将策略类设计成可共享的，
 * 这样策略类实例可以被不同客户端使用。换言之，可以使用享元模式来减少对象的数量。
 *
 */
public class StrategyTest {

    public static void main(String[] args){
        Context context = new Context(new WeakStrategy());
        context.fighting();

        context = new Context(new StrongStrategy());
        context.fighting();
    }
}
