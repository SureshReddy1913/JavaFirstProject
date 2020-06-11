package com.sapient.problem2;
public class Runner {

	public static void main(String[] args) throws InterruptedException {
		TicTok t1 = new TicTok("tic");
		t1.start();
		TicTok t2 = new TicTok("tok");
		t2.start();
		t1.join();
		t2.join();
	}

}
