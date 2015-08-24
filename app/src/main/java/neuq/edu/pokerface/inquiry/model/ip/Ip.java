package neuq.edu.pokerface.inquiry.model.ip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by PokerFace on 2015/8/24.
 */
public class Ip {

    @Expose
    private String resultcode;
    @Expose
    private String reason;
    @Expose
    private Result result;
    @SerializedName("error_code")
    @Expose
    private Integer errorCode;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
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

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
