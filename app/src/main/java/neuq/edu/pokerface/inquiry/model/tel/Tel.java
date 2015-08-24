package neuq.edu.pokerface.inquiry.model.tel;

import com.google.gson.annotations.Expose;

/**
 * Created by PokerFace on 2015/8/20.
 */
public class Tel {

    @Expose
    private int resultcode;
    @Expose
    private String reason;
    @Expose
    private Result result;
    @Expose
    private int error_code;

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

    public int getError_code() {

        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
}
