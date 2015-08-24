package neuq.edu.pokerface.inquiry.model.weather.result.data.realtime;

import com.google.gson.annotations.Expose;

/**
 * Created by PokerFace on 2015/8/22.
 * ��ǰʵ������
 */
public class Weather {

    //�¶�
    @Expose
    private String temperature;

    //ʪ��
    @Expose
    private String humidity;

    //����
    @Expose
    private String info;

    //����֪������ʲôָ��
    @Expose
    private String img;



    //����getter��setter
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
