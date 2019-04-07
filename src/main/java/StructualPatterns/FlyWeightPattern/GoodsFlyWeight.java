package StructualPatterns.FlyWeightPattern;

public class GoodsFlyWeight implements IGoods{

    // 内部状态
    private String name;

    public GoodsFlyWeight(String name){
        this.name = name;
    }

    // 外部状态：version
    public void showGoodsPrice(String version) {

        if("32G".equals(version)){
            System.out.println("售价5999");
        }else if("64G".equals(version)){
            System.out.println("售价6999");
        }

    }
}
