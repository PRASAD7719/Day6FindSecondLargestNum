package main1;

public class Days6FindSecondLargestNum {
	
	
	public static int getSecondLargeNo(int arr[],int total) {
		int temp;
		
		for(int i=0;i<total;i++) {
			
			for(int j=i+1;j<total;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		}
		
		
		return arr[total-2];
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60};
		System.out.println("Second largest num:: "+getSecondLargeNo(arr,arr.length));
				
	}

}
