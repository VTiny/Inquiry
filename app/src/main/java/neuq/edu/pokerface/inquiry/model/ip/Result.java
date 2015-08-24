package neuq.edu.pokerface.inquiry.model.ip;

import com.google.gson.annotations.Expose;

/**
 * Created by PokerFace on 2015/8/24.
 */
public class Result {

    @Expose
    private String area;
    @Expose
    private String location;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
