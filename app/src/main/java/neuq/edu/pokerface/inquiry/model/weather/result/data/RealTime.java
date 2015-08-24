package neuq.edu.pokerface.inquiry.model.weather.result.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import neuq.edu.pokerface.inquiry.model.weather.result.data.realtime.Weather;
import neuq.edu.pokerface.inquiry.model.weather.result.data.realtime.Wind;

/**
 * Created by PokerFace on 2015/8/22.
 */
public class RealTime {

    //���д���
    @SerializedName("city_code")
    @Expose
    private String cityCode;

    //������
    @SerializedName("city_name")
    @Expose
    private String cityName;

    //��������
    @Expose
    private String date;

    //��ǰʱ��
    @Expose
    private String time;

    //����
    @Expose
    private Integer week;

    //��������
    @Expose
    private String moon;

    //��ȡ����ʱ�䣿ò����ʱ�����
    @Expose
    private Integer dataUptime;

    //��ǰʵ������
    @Expose
    private Weather weather;

    //��ǰ������
    @Expose
    private Wind wind;



    //getter��setter
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getMoon() {
        return moon;
    }

    public void setMoon(String moon) {
        this.moon = moon;
    }

    public Integer getDataUptime() {
        return dataUptime;
    }

    public void setDataUptime(Integer dataUptime) {
        this.dataUptime = dataUptime;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
