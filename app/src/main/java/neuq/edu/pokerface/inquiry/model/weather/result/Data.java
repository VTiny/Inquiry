package neuq.edu.pokerface.inquiry.model.weather.result;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

import neuq.edu.pokerface.inquiry.model.weather.result.data.Life;
import neuq.edu.pokerface.inquiry.model.weather.result.data.Pm25;
import neuq.edu.pokerface.inquiry.model.weather.result.data.RealTime;
import neuq.edu.pokerface.inquiry.model.weather.result.data.RecentWeather;

/**
 * Created by PokerFace on 2015/8/22.
 */
public class Data {

    @Expose
    private RealTime realtime;
    @Expose
    private Life life;
    @Expose
    private List<RecentWeather> recentWeather = new ArrayList<RecentWeather>();
    @Expose
    private Pm25 pm25;
    @Expose
    private Object date;
    @Expose
    private Integer isForeign;

    public RealTime getRealtime() {
        return realtime;
    }

    public void setRealtime(RealTime realtime) {
        this.realtime = realtime;
    }

    public Life getLife() {
        return life;
    }

    public void setLife(Life life) {
        this.life = life;
    }

    public List<RecentWeather> getRecentWeather() {
        return recentWeather;
    }

    public void setRecentWeather(List<RecentWeather> weather) {
        this.recentWeather = weather;
    }

    public Pm25 getPm25() {
        return pm25;
    }

    public void setPm25(Pm25 pm25) {
        this.pm25 = pm25;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Integer getIsForeign() {
        return isForeign;
    }

    public void setIsForeign(Integer isForeign) {
        this.isForeign = isForeign;
    }
}
