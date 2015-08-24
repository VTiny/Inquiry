package neuq.edu.pokerface.inquiry.model.weather.result.data.realtime;

import com.google.gson.annotations.Expose;

/**
 * Created by PokerFace on 2015/8/22.
 * ������
 */
public class Wind {

    //����
    @Expose
    private String direct;

    //����
    @Expose
    private String power;

    //����ֵ��
    @Expose
    private Object offset;

    //����
    @Expose
    private Object windspeed;



    //getter��setter
    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Object getOffset() {
        return offset;
    }

    public void setOffset(Object offset) {
        this.offset = offset;
    }

    public Object getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Object windspeed) {
        this.windspeed = windspeed;
    }
}
