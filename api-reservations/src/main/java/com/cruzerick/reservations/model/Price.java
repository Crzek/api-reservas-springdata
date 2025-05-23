package com.cruzerick.reservations.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "total_price", nullable = false)
    private BigDecimal totalPrice;

    @Column(name = "total_tax", nullable = false)
    private BigDecimal totalTax;

    @Column(name = "base_price", nullable = false)
    private BigDecimal basePrice;

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(id, price.id) && Objects.equals(totalPrice, price.totalPrice) && Objects.equals(totalTax, price.totalTax) && Objects.equals(basePrice, price.basePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalPrice, totalTax, basePrice);
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", totalTax=" + totalTax +
                ", basePrice=" + basePrice +
                '}';
    }
}
