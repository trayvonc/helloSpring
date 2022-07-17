package com.fan.demo01;

public class Proxy implements Rent{
    private Host host;
    public Proxy() {
    }
    public Proxy(Host host) {
        seeHouse();
        this.host = host;
        heTong();
        fare();
    }

    @Override
    public void rent() {
        host.rent();

    }
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void fare(){
        System.out.println("收中介费");
    }
    public void heTong(){
        System.out.println("签租赁合同");
    }
}
