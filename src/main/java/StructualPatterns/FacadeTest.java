package StructualPatterns;

import StructualPatterns.FacadePattern.JingMai;
import StructualPatterns.FacadePattern.NeiGong;
import StructualPatterns.FacadePattern.ZhangWujiFacade;
import StructualPatterns.FacadePattern.ZhaoShi;

/**
 * 外观模式：
 * 外观模式本身就是将子系统的逻辑和交互隐藏起来，为用户提供一个高层次的接口，
 * 使得系统更加易用，同时也隐藏了具体的实现，这样即使具体的子系统发生了变化，用户也不会感知到。
 *
 * 适用场景：
 * 1，构建一个有层次结构的子系统时，使用外观模式定义子系统中每层的入口点，如果子系统之间是相互依赖的，则可以让他们通过外观接口进行通信，
 * 减少子系统之间的依赖关系。
 *
 * 2，子系统往往会因为不断的重构演化而变得越来越复杂，大多数的模式使用时也会产生很多很小的类，这给外部调用他们的用户程序带来了使用的困难，
 * 我们可以使用外观类提供一个简单的接口，对外隐藏子系统的具体实现并隔离变化。
 *
 * 3，当维护一个遗留的大型系统时，可能这个系统已经非常难以维护和拓展，但因为它含有重要的功能，新的需求必须依赖于它，则可以使用外观类，
 * 来为设计粗糙或者复杂的遗留代码提供一个简单的接口，让新系统和外观类交互，而外观类负责与遗留的代码进行交互。
 *
 *
 */
public class FacadeTest {


    public static void main(String[] args){
        ZhangWujiFacade zhangWujiFacade = new ZhangWujiFacade(new ZhaoShi(), new NeiGong(), new JingMai());
        zhangWujiFacade.useQianKun();

        zhangWujiFacade.useTaiJiJian();
    }

}
