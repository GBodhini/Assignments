class LinearSearch_Sorted{
	public static int LinearSearch(int[] arr,int target){
		int n=arr.length;
		for(int i=0;i<n;i++){
			if(arr[i]==target){
				return i;
			}
		else if(arr[i]>target){
			break;
		}
	}
		return -1;
}
public static void main(String[] args){
	int[] arr={3,4,5,6,7,8,9};
	int target=5;
	int index=LinearSearch(arr,target);
	if(index!=-1){
		System.out.println("element is at:"+ index);
	}
	else{
		System.out.println("Element not Found");
	}
	}
}