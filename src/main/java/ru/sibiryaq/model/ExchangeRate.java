package ru.sibiryaq.model;

import java.math.BigDecimal;

public class ExchangeRate {
    int id; //Айди курса обмена, автоинкремент, первичный ключ
    Currency BaseCurrencyId; // ID базовой валюты, внешний ключ на Currencies.ID
    Currency TargetCurrencyId; // ID целевой валюты, внешний ключ на Currencies.ID
    BigDecimal rate; // курс обмена
}
