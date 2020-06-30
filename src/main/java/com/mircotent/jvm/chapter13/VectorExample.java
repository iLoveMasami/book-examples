package com.mircotent.jvm.chapter13;

import java.util.Vector;

public class VectorExample {

  private static Vector<Integer> v = new Vector<>();

  public static void main(String[] args) {
    while (true) {
      for (int i = 0; i < 10; ++i) {
        v.add(i);
      }
      Thread removeThread = new Thread(new Runnable() {

        @Override
        public void run() {
					for (int i = 0; i < v.size(); ++i) {
						v.remove(i);
					}
        }
      });

      Thread printThread = new Thread(new Runnable() {

        @Override
        public void run() {
					for (int i = 0; i < v.size(); ++i) {
						System.out.println(v.get(i));
					}
        }

      });

      removeThread.start();
      printThread.start();
			while (Thread.activeCount() > 20) {
				;
			}
    }
  }
}
