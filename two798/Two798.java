package two798;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Two798 {
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		//ī���� ���� �Է¹ޱ�
		int card = sc.nextInt();
		
		//ī�� ������ ���� m
		int m = sc.nextInt();
		
		//ī�� �迭 �����
		int[] arr = new int[card];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = 0;
		
		//3�߹� Ȱ�� 
		for(int i=0; i<card-2; i++) {
			for(int j=i+1; j<card-1; j++) {
				for(int k=j+1; k<card; k++) {
					if(arr[i]+arr[j]+arr[k] <= m && m-(arr[i]+arr[j]+arr[k])< m - result) {
						result = arr[i] + arr[j] + arr[k];
						System.out.println("result ="+arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
		System.out.println(result);
	}
}