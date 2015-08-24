package neuq.edu.pokerface.inquiry.model.weather.result.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import neuq.edu.pokerface.inquiry.model.weather.result.data.pm25.Pm25Data;

/**
 * Created by PokerFace on 2015/8/22.
 */
public class Pm25 {


    @Expose
    private String key;
    @SerializedName("show_desc")
    @Expose
    private Integer showDesc;
    @Expose
    private Pm25Data pm25;
    @Expose
    private String dateTime;
    @Expose
    private String cityName;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getShowDesc() {
        return showDesc;
    }

    public void setShowDesc(Integer showDesc) {
        this.showDesc = showDesc;
    }

    public Pm25Data getPm25Data() {
        return pm25;
    }

    public void setPm25Data(Pm25Data pm25) {
        this.pm25 = pm25;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
