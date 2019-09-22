package andrei.project;

import java.util.Arrays;

public class HighestNumber {
	public static void main(String[] args) {
		HighestNumber x = new HighestNumber();
		int[] sir2 = { 3, 5, 8, 90 };
		int[] sir3 = { 10, 11, 13, 19 };
		int[] sir4 = { 30, 11, 11, 32 };
		System.out.println(x.maxnumber(sir2));
		System.out.println(Arrays.toString(x.mergeandsort(sir2, sir3)));
		System.out.println(x.duplicates(sir4));
		System.out.println(x.duplicates(sir3));
	}

	public int maxnumber(int[] sir1) {
		int max = sir1[0];
		for (int i = 0; i < sir1.length; i++) {
			if (sir1[i] > max) {
				max = sir1[i];
			}
		}
		return max;

	}

	public int[] mergeandsort(int[] sir1, int[] sir2) {
		int[] merge = new int[sir1.length + sir2.length];
		int contors1 = 0;
		int contors2 = 0;
		int contorm = 0;
		while (contors1 < sir1.length && contors2 < sir2.length) {
			if (sir1[contors1] < sir2[contors2]) {
				merge[contorm] = sir1[contors1];
				contors1 = contors1 + 1;
				contorm = contorm + 1;
			} else {
				merge[contorm] = sir2[contors2];
				contors2 = contors2 + 1;
				contorm = contorm + 1;
			}
		}
		if (contors1 == sir1.length) {
			for (int i = contors2; i < sir2.length; i++) {
				merge[contorm] = sir2[i];
				contorm = contorm + 1;
			}
		}
		if (contors2 == sir2.length) {
			for (int i = contors1; i < sir1.length; i++) {
				merge[contorm] = sir1[i];
				contorm = contorm + 1;
			}
		}
		;
		return merge;
	}

	public boolean duplicates(int[] sir1) {
		for (int i = 0; i < sir1.length; i++) {
			for (int j = i + 1; j < sir1.length; j++) {
				if (sir1[i] == sir1[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
