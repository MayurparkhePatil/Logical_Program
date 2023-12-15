package pallendrom_example;

public class IntPallendrom {

	public static void main(String[] args) {
		
		int no=141;
		int no1=no;
		int temp=0;
		int no2=0;
		while(no!=0) {
			temp=no%10;
			no2=(no2*10)+temp;
			no=no/10;
		}
		if(no1==no2)
		{
			System.out.println("no is pallendrom");
		}
		else
		{
			System.out.println("no is not pallendrom");
		}
	}
}
