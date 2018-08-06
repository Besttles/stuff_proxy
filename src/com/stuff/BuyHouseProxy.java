package com.stuff;

public class BuyHouseProxy implements BuyHouse{

	private BuyHouse buyHouse;
	public BuyHouseProxy(final BuyHouse buyHouse){
		this.buyHouse = buyHouse;
	}
	@Override
	public void buyHosue() {
         System.out.println("买房前");
         buyHouse.buyHosue();
         System.out.println("买房后");
	}

}
