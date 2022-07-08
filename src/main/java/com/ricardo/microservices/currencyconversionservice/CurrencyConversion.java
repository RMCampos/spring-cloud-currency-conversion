package com.ricardo.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.Objects;

public class CurrencyConversion {

  private Long id;
  private String from;
  private String to;
  private BigDecimal quantity;
  private BigDecimal conversionMultiple;
  private BigDecimal totalCalculatedAmount;
  private String environment;

  public CurrencyConversion() {
    this(0L, "", "", BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, "");
  }

  public CurrencyConversion(Long id, String from, String to, BigDecimal quantity,
      BigDecimal conversionMultiple, BigDecimal totalCalculatedAmount, String environment) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
    this.quantity = quantity;
    this.totalCalculatedAmount = totalCalculatedAmount;
    this.environment = environment;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public BigDecimal getConversionMultiple() {
    return conversionMultiple;
  }

  public void setConversionMultiple(BigDecimal conversionMultiple) {
    this.conversionMultiple = conversionMultiple;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public BigDecimal getTotalCalculatedAmount() {
    return totalCalculatedAmount;
  }

  public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
    this.totalCalculatedAmount = totalCalculatedAmount;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  @Override
  public String toString() {
    return "CurrencyConversion{" +
        "id=" + id +
        ", from='" + from + '\'' +
        ", to='" + to + '\'' +
        ", conversionMultiple=" + conversionMultiple +
        ", quantity=" + quantity +
        ", totalCalculatedAmount=" + totalCalculatedAmount +
        ", environment='" + environment + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyConversion that = (CurrencyConversion) o;
    return id.equals(that.id) && from.equals(that.from) && to.equals(that.to)
        && conversionMultiple.equals(that.conversionMultiple) && quantity.equals(that.quantity)
        && Objects.equals(totalCalculatedAmount, that.totalCalculatedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, to, conversionMultiple, quantity);
  }
}
