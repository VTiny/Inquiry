package neuq.edu.pokerface.inquiry.model.weather.result.data.recentweather;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PokerFace on 2015/8/22.
 */
public class Info {

    @Expose
    private List<String> dawn = new ArrayList<String>();
    @Expose
    private List<String> day = new ArrayList<String>();
    @Expose
    private List<String> night = new ArrayList<String>();

    public List<String> getDawn() {
        return dawn;
    }

    public void setDawn(List<String> dawn) {
        this.dawn = dawn;
    }

    public List<String> getDay() {
        return day;
    }

    public void setDay(List<String> day) {
        this.day = day;
    }

    public List<String> getNight() {
        return night;
    }

    public void setNight(List<String> night) {
        this.night = night;
    }
}
