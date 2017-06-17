package com.ericsson.request;

/**
 * Created by edoaxio on 6/17/2017.
 */
public class MerchantQueryParam extends Page {

    private String merchantId;

    private String merchantName;

    private Integer status;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
