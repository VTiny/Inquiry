package neuq.edu.pokerface.inquiry.model.weather.result.data.pm25;

import com.google.gson.annotations.Expose;

/**
 * Created by PokerFace on 2015/8/22.
 * pm2.5内容，这都是什么鬼
 */
public class Pm25Data {

    @Expose
    private String curPm;
    @Expose
    private String pm25;
    @Expose
    private String pm10;
    @Expose
    private Integer level;
    @Expose
    private String quality;
    @Expose
    private String des;

    public String getCurPm() {
        return curPm;
    }

    public void setCurPm(String curPm) {
        this.curPm = curPm;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
