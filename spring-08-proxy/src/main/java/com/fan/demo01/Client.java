package com.fan.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy=new Proxy(host);
        proxy.rent();//虽然通过代理rent但是本质还是用房东rent
    }
}
