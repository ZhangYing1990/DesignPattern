package StructualPatterns;

import StructualPatterns.FlyWeightPattern.FlyWeightFactory;
import StructualPatterns.FlyWeightPattern.IGoods;

/**
 * 享元模式
 *
 * 用例：资源池技术
 *
 * 适用场景：
 * 1，系统中存在大量的相似对象。
 * 2，需要缓冲池的场景。
 * 3，细粒度的对象都具备较接近的外部状态，而且内部状态与环境无关，也就是说对象没有特定身份。
 */
public class FlyWeightTest {

    public static void main(String[] args){
        IGoods iGoods = FlyWeightFactory.getGoods("iphone7");
        iGoods.showGoodsPrice("32G");
        IGoods iGoods1 = FlyWeightFactory.getGoods("iphone7");
        iGoods1.showGoodsPrice("32G");
        IGoods iGoods2 = FlyWeightFactory.getGoods("iphone7");
        iGoods2.showGoodsPrice("64G");
    }
}
