package com.stuff;

public class Main {
     public static void main(String[] args) {
		BuyHouse buyHouse = new BuyHouseImpl();
		buyHouse.buyHosue();
		BuyHouseProxy proxy = new BuyHouseProxy(buyHouse);
		proxy.buyHosue();
	}
}
