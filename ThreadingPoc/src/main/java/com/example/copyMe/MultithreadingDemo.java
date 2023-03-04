package com.example.copyMe;

public class MultithreadingDemo extends Thread {
	public void run()
    {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
        int i = 0;
//        while (true) {
//            System.out.println(this.getName() + ": New Thread is running..." + i++);
////            try {
////                //Wait for one sec so it doesn't print too fast
////             //   Thread.sleep(1000);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//        }
        System.out.println(this.getName() + ": New Thread is running..." + i++);
    }

}