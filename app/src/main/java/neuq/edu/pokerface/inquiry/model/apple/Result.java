package neuq.edu.pokerface.inquiry.model.apple;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by PokerFace on 2015/9/3.
 *
 */
public class Result {

    /*设备型号*/
    @SerializedName("phone_model")
    @Expose
    private String phoneModel;

    /*设备序列号*/
    @SerializedName("serial_number")
    @Expose
    private String serialNumber;

    /*IMEI号*/
    @SerializedName("imei_number")
    @Expose
    private String imeiNumber;

    /*激活状态*/
    @Expose
    private String active;

    /*保修状态*/
    @SerializedName("warranty_status")
    @Expose
    private String warrantyStatus;

    /*保修日期*/
    @Expose
    private String warranty;

    /*电话支持到期*/
    @SerializedName("tele_support")
    @Expose
    private String teleSupport;

    /*电话支持状态*/
    @SerializedName("tele_support_status")
    @Expose
    private String teleSupportStatus;

    /*生产工厂*/
    @SerializedName("made_area")
    @Expose
    private String madeArea;

    /*生产时间开始*/
    @SerializedName("start_date")
    @Expose
    private String startDate;

    /*生产时间结束*/
    @SerializedName("end_date")
    @Expose
    private String endDate;

    /*颜色*/
    @Expose
    private String color;

    /*规格*/
    @Expose
    private String size;


    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getWarrantyStatus() {
        return warrantyStatus;
    }

    public void setWarrantyStatus(String warrantyStatus) {
        this.warrantyStatus = warrantyStatus;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getTeleSupport() {
        return teleSupport;
    }

    public void setTeleSupport(String teleSupport) {
        this.teleSupport = teleSupport;
    }

    public String getTeleSupportStatus() {
        return teleSupportStatus;
    }

    public void setTeleSupportStatus(String teleSupportStatus) {
        this.teleSupportStatus = teleSupportStatus;
    }

    public String getMadeArea() {
        return madeArea;
    }

    public void setMadeArea(String madeArea) {
        this.madeArea = madeArea;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
