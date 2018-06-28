/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public class NewClass {
   import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ld1151rdb480 {

	public static void firstMethod(int[] A){
		int i, j, newValue;
	      for (i = 1; i < A.length; i++) {
	            newValue = A[i];
	            j = i;
	            while (j > 0 && A[j - 1] > newValue) {
	                  A[j] = A[j - 1];
	                  j--;
	            }
	            A[j] = newValue;
	      }
	}

	public static void secondMethod(int[] list) {
        if (list.length <= 1) {
            return;
        }
        
        // Split the array in half
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        
        // Sort each half
        secondMethod(first);
        secondMethod(second);
        
        // Merge the halves together, overwriting the original array
        merge(first, second, list);
        return;
    }
    
    private static void merge(int[] first, int[] second, int [] result) {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
                } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }

	public static void main(String[] args) {
		String st;
		int k, n, i, l;
		System.out.println("Olesja Sandiba 5.grupa 151RDB480");
		System.out.print("method:");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			st = br.readLine();
			k = Integer.parseInt(st);
		} catch (Exception e) {
			System.out.println("input-output error");
			return;
		}
		if (k != 1 && k != 2){
			System.out.println("input-output error");
			return;
		}
		System.out.print("count:");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			st = br.readLine();
			n = Integer.parseInt(st);
		} catch (Exception e) {
			System.out.println("input-output error");
			return;
		}
		System.out.println("items:");
		int A[] = new int[n];
		for (i = 0; i < n; i++) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				st = br.readLine();
				l = Integer.parseInt(st);
			} catch (Exception e) {
				System.out.println("input-output error");
				return;
			}
			A[i] = l;
		}
		if (k == 1) {
			firstMethod(A);

		}
		if (k == 2) {
			secondMethod(A);
		}
		System.out.println("sorted:");
		for (i = 0; i < n; i++)
			System.out.print(A[i] + " ");
	}
}
 
}
