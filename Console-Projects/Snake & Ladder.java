import.java.util.Scanner; 
class Sanp
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Dice  Place");
		while(sum<=100)
		{
			int a =(int) (Math.random()*6)+1;
			sum = (sum==99?sum=26:(sum==96?sum=86:(sum==90?sum=68:(sum+=0))));
			sum = (sum==50?sum=34:(sum==35?sum=5:(sum==39?sum=3:(sum+=0))));
			sum = (sum==28?sum=77:(sum==2?sum=23:(sum==7?sum=29:(sum+=0))));
			sum = (sum==30?sum=32:(sum==22?sum=41:(sum==44?sum=58:(sum+=0))));
			sum = (sum==54?sum=69:(sum==70?sum=90:(sum==80?sum=83:(sum+=0))));
			sum = (sum==87?sum=93:(sum+=0));
			if (sum==100)
			{
				break;
			}
			sum = ((sum==95&&(a==1||a==2||a==3||a==4||a==5))?sum+=a:(sum+=0));
			sum = ((sum==98&&a==1||a==2)?sum+=a:(sum>=0&&sum<95?sum+=a:(sum+=0)));
			
			System.out.println(a+"       "+sum);
		}
		System.out.print("Congratulation you Win !");
	}
}

