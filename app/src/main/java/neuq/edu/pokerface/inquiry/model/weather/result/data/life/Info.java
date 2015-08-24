package neuq.edu.pokerface.inquiry.model.weather.result.data.life;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PokerFace on 2015/8/22.
 * 生活指数的内容
 */
public class Info {

    //穿衣指数
    @Expose
    private List<String> chuanyi = new ArrayList<String>();
    //感冒指数
    @Expose
    private List<String> ganmao = new ArrayList<String>();
    //空调指数
    @Expose
    private List<String> kongtiao = new ArrayList<String>();
    //污染指数
    @Expose
    private List<String> wuran = new ArrayList<String>();
    //洗车指数
    @Expose
    private List<String> xiche = new ArrayList<String>();
    //运动指数
    @Expose
    private List<String> yundong = new ArrayList<String>();
    //紫外线指数
    @Expose
    private List<String> ziwaixian = new ArrayList<String>();


    //getter setter
    public List<String> getChuanyi() {
        return chuanyi;
    }

    public void setChuanyi(List<String> chuanyi) {
        this.chuanyi = chuanyi;
    }

    public List<String> getGanmao() {
        return ganmao;
    }

    public void setGanmao(List<String> ganmao) {
        this.ganmao = ganmao;
    }

    public List<String> getKongtiao() {
        return kongtiao;
    }

    public void setKongtiao(List<String> kongtiao) {
        this.kongtiao = kongtiao;
    }

    public List<String> getWuran() {
        return wuran;
    }

    public void setWuran(List<String> wuran) {
        this.wuran = wuran;
    }

    public List<String> getXiche() {
        return xiche;
    }

    public void setXiche(List<String> xiche) {
        this.xiche = xiche;
    }

    public List<String> getYundong() {
        return yundong;
    }

    public void setYundong(List<String> yundong) {
        this.yundong = yundong;
    }

    public List<String> getZiwaixian() {
        return ziwaixian;
    }

    public void setZiwaixian(List<String> ziwaixian) {
        this.ziwaixian = ziwaixian;
    }
}
