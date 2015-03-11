package threadtest;

public class ThreadWorker implements Runnable {

	private static int[] j = new int[10000];

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10000; i++) {
				j[i] = i;
			}
		} catch (Exception e) {
		}
	}
	
}
