package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Account information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LendingAccount {

  /**
   * List of assets positionsof this savingsaccount.
   */
  private List<LendingBalance> positionAmountVos;

  public List<LendingBalance> getPositionAmountVos() {
    return positionAmountVos;
  }

  public void setPositionAmountVos(List<LendingBalance> positionAmountVos) {
    this.positionAmountVos = positionAmountVos;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("positionAmountVos", positionAmountVos)
        .toString();
  }
}
