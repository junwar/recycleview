package com.example.recycleview;

public class clubmodel {
    private String nameclub;
    private int logoclub;

    public clubmodel(String nameclub, int logoclub) {
        this.nameclub = nameclub;
        this.logoclub = logoclub;
    }

    public String getNameclub() {
        return nameclub;
    }

    public void setNameclub(String nameclub) {
        this.nameclub = nameclub;
    }

    public int getLogoclub() {
        return logoclub;
    }

    public void setLogoclub(int logoclub) {
        this.logoclub = logoclub;
    }
}
