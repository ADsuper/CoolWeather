package com.luoshen.coolweather.db;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

public class province extends LitePalSupport {

    @Column(unique = true)
    private String provinceName;
    @Column(unique = true)
    private int provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
