package neuq.edu.pokerface.inquiry.model.weather.result.data;

import com.google.gson.annotations.Expose;

import neuq.edu.pokerface.inquiry.model.weather.result.data.life.Info;

/**
 * Created by PokerFace on 2015/8/22.
 * 生活指数
 *
 */
public class Life {

    //日期
    @Expose
    private String date;

    //生活指数内容
    @Expose
    private Info info;


    //getter setter
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
}
