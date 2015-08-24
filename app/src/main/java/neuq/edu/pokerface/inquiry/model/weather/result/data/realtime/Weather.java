package neuq.edu.pokerface.inquiry.model.weather.result.data.realtime;

import com.google.gson.annotations.Expose;

/**
 * Created by PokerFace on 2015/8/22.
 * 当前实况天气
 */
public class Weather {

    //温度
    @Expose
    private String temperature;

    //湿度
    @Expose
    private String humidity;

    //天气
    @Expose
    private String info;

    //并不知道这是什么指数
    @Expose
    private String img;



    //各种getter和setter
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
