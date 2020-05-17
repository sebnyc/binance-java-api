package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * History of dividends.
 *
 * @see Dividend
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DividendHistory {

  @JsonProperty("rows")
  private List<Dividend> rows;

  private String total;

  public List<Dividend> getRows() {
    return rows;
  }

  public void setRows(List<Dividend> rows) {
    this.rows = rows;
  }

  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("rows", rows)
        .append("total", total)
        .toString();
  }
}
