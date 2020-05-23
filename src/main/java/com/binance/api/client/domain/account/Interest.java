package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * An interest transaction received on a Binance savings account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Interest {

  /**
   * Symbol.
   */
  private String asset;

  /**
   * Amount received
   */
  private String interest;

  /**
   * lendingType : DAILY or REGULAR or CUSTOMIZED_FIXED
   */
  private String lendingType;

  /**
   * Product name
   */
  private String productName;

  /**
   * Interest time.
   */
  private String time;

  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public String getInterest() {
    return interest;
  }

  public void setInterest(String interest) {
    this.interest = interest;
  }

  public String getLendingType() {
    return lendingType;
  }

  public void setLendingType(String lendingType) {
    this.lendingType = lendingType;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
            .append("asset", asset)
            .append("interest", interest)
            .append("lendingType", lendingType)
            .append("productName", productName)
            .append("time", time)
            .toString();
  }
}
