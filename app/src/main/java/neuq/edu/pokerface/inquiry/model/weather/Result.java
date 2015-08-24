package neuq.edu.pokerface.inquiry.model.weather;

import com.google.gson.annotations.Expose;

import neuq.edu.pokerface.inquiry.model.weather.result.Data;

/**
 * Created by PokerFace on 2015/8/22.
 */
public class Result {

    @Expose
    private Data data;


    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
