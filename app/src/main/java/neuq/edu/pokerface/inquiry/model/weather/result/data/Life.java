package neuq.edu.pokerface.inquiry.model.weather.result.data;

import com.google.gson.annotations.Expose;

import neuq.edu.pokerface.inquiry.model.weather.result.data.life.Info;

/**
 * Created by PokerFace on 2015/8/22.
 * ����ָ��
 *
 */
public class Life {

    //����
    @Expose
    private String date;

    //����ָ������
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
