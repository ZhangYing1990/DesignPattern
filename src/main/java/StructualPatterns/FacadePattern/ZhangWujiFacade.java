package StructualPatterns.FacadePattern;

public class ZhangWujiFacade {

    private ZhaoShi zhaoShi;
    private NeiGong neiGong;
    private JingMai jingMai;

    public ZhangWujiFacade(ZhaoShi zhaoShi, NeiGong neiGong, JingMai jingMai) {
        this.zhaoShi = zhaoShi;
        this.neiGong = neiGong;
        this.jingMai = jingMai;
    }

    public void useTaiJiJian(){
        jingMai.jingmai();
        neiGong.JiuYang();
        zhaoShi.Taiji();
    }

    public void useQianKun(){
        jingMai.jingmai();
        neiGong.QianKun();
    }
}
