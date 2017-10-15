package com.oracle;

public class HondaBike extends BikeAbs {
	public void run(){
		System.out.println("Running bike is successful");
		}
	
	public static void main(String[] args){
		BikeAbs bikeabs = new HondaBike();
		bikeabs.run();
	}

}
