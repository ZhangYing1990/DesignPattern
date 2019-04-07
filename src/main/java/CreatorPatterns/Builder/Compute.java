package CreatorPatterns.Builder;

/**
 * 产品定义
 * 产品的组成
 * 产品各组成的基础装配方法
 */
public class Compute {
    private String cpu;
    private String memory;
    private String other;

    public void buildCpu(String cpu){
        this.cpu = cpu;
    }
    public void buildMemory(String memory){
        this.memory = memory;
    }
    public void buildOther(String other){
        this.other = other;
    }

    public String getComputeInfo(){
        return "cpu: " + this.cpu + "; memory: " + this.memory + "; other: " + this.other;
    }
}
