package objectConcept;
import java.util.Scanner;

public class Coupon {
	int i,sum=0,num,r;
	public int generateCode(int code)
	{
		num=code;
		while(num!=0)
		{
			r=num%10;
			num=num/10;
		if(r%2==0)
		{
			sum=sum*10+r;
		}
		}
		System.out.println(sum);
		return (sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=0,r;
		
		System.out.println("Enter the coupon code....");
		int code=sc.nextInt();
		if(code>32767)
		{
			System.out.println("Number is too large...");
			System.exit(0);
		}
		else if(code<0)
		{
			System.out.println("Number is too small...");
			System.exit(0);
		}
		Coupon c=new Coupon();
		
	int s=	c.generateCode(code);
	
			while(s>0)
			{
				r=s%10;
			   num=num*10+r;
			 s=s/10;
				
			}
	System.out.println("Coupon code only with even number..."+num);

	}

}
