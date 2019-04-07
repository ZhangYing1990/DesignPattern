package StructualPatterns.FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private static Map<String, IGoods> goodsMap = new HashMap<String, IGoods>();

    public static IGoods getGoods(String name){
        if(goodsMap.containsKey(name)){
            System.out.println("通过缓存获取：" + name);
            return goodsMap.get(name);
        }else {
            IGoods goods = new GoodsFlyWeight(name);
            goodsMap.put(name, goods);
            System.out.println("通过新建获取：" + name);
            return goods;
        }
    }
}
