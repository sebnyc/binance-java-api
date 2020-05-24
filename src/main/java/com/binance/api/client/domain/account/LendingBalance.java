package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * An lending balance in an Account.
 *
 * @see Account
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LendingBalance {

  /**
   * Asset symbol.
   */
  private String asset;

  /**
   * Balance.
   */
  private String amount;

  /**
   * Amount in USDT
   */
  private String amountInUSDT;

  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getAmountInUSDT() {
    return amountInUSDT;
  }

  public void setAmountInUSDT(String amountInUSDT) {
    this.amountInUSDT = amountInUSDT;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("asset", asset)
        .append("amount", amount)
        .append("amountInUSDT", amountInUSDT)
        .toString();
  }
}
