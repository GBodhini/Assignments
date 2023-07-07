class LinearSearch_Unsorted{
	public static int LinearSearch(int[] arr,int target){	
		for(int i=0;i<=arr.length;i++){
			if(arr[i]==target){
				return i;
			}
	}
 	return -1;
}
public static void main(String[] args){
	int[] arr={9,4,2,6,5,8,3,1,7};
	int target=6;
	int index=LinearSearch(arr,target);
	if(index!=-1){
		System.out.println("Element is at:"+index);
	}
	else{
		System.out.println("Element not found");
	}
}
}