package ru.sibiryaq.model;

public class Currency {
    /// TODO автоинкрементный первичный ключ
    private int id;
    /// TODO Unique индекс для гарантий уникальности валюты в таблице, и для ускорения поиска валюты по её аббревиатуре
    //  https://www.iban.com/currency-codes. коды валют мира
    private String code; // Код валюты
    private String fullName; // Полное имя валюты
    private String sign; // Символ валюты

    public Currency() {
    }

    public Currency(int id, String code, String sign, String fullName) {
        this.id = id;
        this.code = code;
        this.sign = sign;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
