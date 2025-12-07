package ru.sibiryaq.model;

import java.math.BigDecimal;

/**
 * Индексы:
 *
 * Первичный ключ по полю ID
 * Unique индекс по паре полей
 * BaseCurrencyId,
 * TargetCurrencyId для гарантий уникальности валютной пары,
 * и для ускорения поиска курса по паре валют
 */
public class ExchangeRate {
    private int id; //Айди курса обмена, автоинкремент, первичный ключ
    private Currency BaseCurrencyId; // ID базовой валюты, внешний ключ на Currencies.ID
    private Currency TargetCurrencyId; // ID целевой валюты, внешний ключ на Currencies.ID
    private BigDecimal rate; // курс обмена
    // Decimal(6) - десятичное число с 6 знаками после запятой.
    // Полезно для валют, отличающихся на порядки


    public ExchangeRate() {
    }

    public ExchangeRate(int id, BigDecimal rate, Currency targetCurrencyId, Currency baseCurrencyId) {
        this.id = id;
        this.rate = rate;
        TargetCurrencyId = targetCurrencyId;
        BaseCurrencyId = baseCurrencyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Currency getBaseCurrencyId() {
        return BaseCurrencyId;
    }

    public void setBaseCurrencyId(Currency baseCurrencyId) {
        BaseCurrencyId = baseCurrencyId;
    }

    public Currency getTargetCurrencyId() {
        return TargetCurrencyId;
    }

    public void setTargetCurrencyId(Currency targetCurrencyId) {
        TargetCurrencyId = targetCurrencyId;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
