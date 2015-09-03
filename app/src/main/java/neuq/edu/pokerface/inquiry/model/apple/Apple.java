package neuq.edu.pokerface.inquiry.model.apple;

import com.google.gson.annotations.Expose;

/**
 * Created by PokerFace on 2015/9/3.
 */
public class Apple {

    @Expose
    private int resultcode;

    @Expose
    private String reason;

    @Expose
    private Result result;


    public int getResultcode() {
        return resultcode;
    }

    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
