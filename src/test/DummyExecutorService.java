/*package test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DummyExecutorService {
	public static void main(String[] args) {
		ExecutorService service= Executors.newFixedThreadPool(10);
		
		try {
			Future<Order> future = (Future<Order>) service.submit(getOrderTask());
			Order order = future.get();
			
			Future<Order> future1 =  (Future<Order>) service.submit(enrichTask(order));
			order = future1.get();
			
			Future<Order> future2 = (Future<Order>) service.submit(performPaymentTask(order));
			order = future2.get();
			
			Future<Order> future3 = (Future<Order>) service.submit(dispatchTask(order));
			order = future3.get();
			
			Future<Order> future4 = (Future<Order>) service.submit(sendMailTask(order));
			order = future4.get();
			
			
			CompletableFuture.supplyAsync(() -> getOrderTask())
			.thenApply( order -> enrichTask(order))
			.thenApply(order -> performPaymentTask(order))
			.thenApply(order -> dispatchTask(order))
			.thenAccept(order -> sendMailTask(order));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static Runnable sendMailTask(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Runnable dispatchTask(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Runnable performPaymentTask(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Runnable enrichTask(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Runnable getOrderTask() {
		// TODO Auto-generated method stub
		return null;
	}

	public class Order {

	}
}
*/