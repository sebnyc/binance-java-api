package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * A dividend received on a Binance account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dividend {

  /**
   * Amount received
   */
  private String amount;

  /**
   * Symbol.
   */
  private String asset;

  /**
   * Dividend time.
   */
  private String divTime;

  /**
   * Comment
   */
  private String enInfo;

  /**
   * Transaction id
   */
  private String tranId;

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public String getDivTime() {
    return divTime;
  }

  public void setDivTime(String divTime) {
    this.divTime = divTime;
  }

  public String getEnInfo() {
    return enInfo;
  }

  public void setEnInfo(String enInfo) {
    this.enInfo = enInfo;
  }

  public String getTranId() {
    return tranId;
  }

  public void setTranId(String tranId) {
    this.tranId = tranId;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("amount", amount)
            .append("asset", asset)
            .append("divTime", divTime)
            .append("tranId", enInfo)
            .append("tranId", tranId)
            .toString();
  }
}
