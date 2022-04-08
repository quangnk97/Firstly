package com.example.myapplication;

public class account {
    String nameOut, passOut, gtinh, ngsinh;

    public account(){
        this.nameOut = "";
        this.passOut = "";
        this.gtinh = "";
        this.ngsinh = "01-01-0001";
    }
    public account(String nameOut, String passOut, String gtinh, String ngsinh){
        this.nameOut = nameOut;
        this.passOut = passOut;
        this.gtinh = gtinh;
        this.ngsinh = ngsinh;
    }
    public String getNameOut(){return nameOut;}
    public String getPassOut(){return passOut;}
    public String getGtinh(){return gtinh;}
    public String getNgsinh(){return ngsinh;}
}
