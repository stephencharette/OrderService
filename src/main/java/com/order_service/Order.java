package com.order_service;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "orders")
public class Order {
  @Id
  private Long id;
  private Long temperature;
  private Date date;
	private Long sizeId;
	private Long menuItemId;
	private Long customerId;


  protected Order() {}

  public Order(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setTemperature(Long temperature) {
    this.temperature = temperature;
  }

  public Long getTemperature() {
    return temperature;
  }

  public Long getSizeId() {
    return sizeId;
  }

  public void setSizeId(Long sizeId) {
    this.sizeId = sizeId;
  }

  public Long getMenuItemId() {
    return menuItemId;
  }

  public void setMenuItemId(Long menuItemId) {
    this.menuItemId = menuItemId;
  }

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }
}