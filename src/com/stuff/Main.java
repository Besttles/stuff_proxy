package com.stuff;

import java.lang.reflect.Proxy;


public class Main {
	public static void main(String[] args) {
		BuyHouse buyHouse = new BuyHouseImpl();
		buyHouse.buyHosue();
		BuyHouseProxy proxy = new BuyHouseProxy(buyHouse);
		proxy.buyHosue();
		System.out.println("--------------动态代理-------------");
		BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new
		Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
		proxyBuyHouse.buyHosue();
		System.out.println("-----------------cglib代理---------------");
		 CglibProxy cglibProxy = new CglibProxy();
		          BuyHouseImpl buyHouseCglibProxy = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
		          buyHouseCglibProxy.buyHosue();
	}
/*     public static void main(String[] args) {    
		BuyHouse buyHouse = new BuyHouseImpl();
		buyHouse.buyHosue();
		BuyHouseProxy proxy = new BuyHouseProxy(buyHouse);
		proxy.buyHosue();
		System.out.println("--------------动态代理-------------");
		BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new
		Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
		proxyBuyHouse.buyHosue();
	}*/
}
