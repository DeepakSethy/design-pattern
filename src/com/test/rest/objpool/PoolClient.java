package com.test.rest.objpool;

import javafx.geometry.Point2D;

public class PoolClient {
	public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("bitmap.logo"),5);
	public static void main(String[] args) {
		Bitmap bt = bitmapPool.get();
		bt.setLocation(new Point2D(10, 10));
		
		Bitmap bt1 = bitmapPool.get();
		bt1.setLocation(new Point2D(-10, 10));
		
		bt.draw();
		bt1.draw();
		
		bitmapPool.release(bt);
		bitmapPool.release(bt1); 
	}
	
}
