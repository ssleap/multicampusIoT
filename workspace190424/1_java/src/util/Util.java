package util;

public class Util {

	public static int[] sort(int[] n) {
		int[] a = n.clone();
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		return a;
	}
}
