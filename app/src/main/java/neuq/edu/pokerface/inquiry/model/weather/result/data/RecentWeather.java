package neuq.edu.pokerface.inquiry.model.weather.result.data;

import com.google.gson.annotations.Expose;

import neuq.edu.pokerface.inquiry.model.weather.result.data.recentweather.Info;

/**
 * Created by PokerFace on 2015/8/22.
 */
public class RecentWeather {

    @Expose
    private String date;
    @Expose
    private Info info;
    @Expose
    private String week;
    @Expose
    private String nongli;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getNongli() {
        return nongli;
    }

    public void setNongli(String nongli) {
        this.nongli = nongli;
    }
}
