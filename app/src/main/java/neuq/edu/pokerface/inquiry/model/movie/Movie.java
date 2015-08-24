package neuq.edu.pokerface.inquiry.model.movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PokerFace on 2015/8/24.
 */
public class Movie {

    @Expose
    private String resultcode;
    @Expose
    private String reason;
    @Expose
    private List<Result> result = new ArrayList<Result>();
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

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
