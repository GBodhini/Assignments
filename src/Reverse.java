class Reverse{
	public static void main(String[] args){
		String s[]="Java welcomes you".split(" ");
		String ans=" ";
		for(int i=s.length-1;i>=0;i--){
			ans+=s[i]+" ";
		}
		System.out.println("Reversed String:"+ ans);
	}
}         