//import.java.lang.math;
class Test
{
	public static void main(String[]args)
	{
		
	int sum=0;	
	 do
	 {
	  	
           int a= (int)(Math.random()*6)+1;
    	   //int dice = (int) Random;
     	  // System.out.println("The random Number is=" +a);
     	  
     	   if(sum==100)
     	   {
     	     break;
     	   }
     	   else if(sum==2)
     	   {
     	    sum=23;
     	   }
     	    else if(sum==7)
     	   {
     	     sum=29;
     	   }
     	     
     	   else if(sum==22)
     	   {
     	     sum=41;
     	   }
     	    else if(sum==28)
     	   {
     	     sum=77;
     	   }
     	     
     	     else if(sum==30)
     	   {
     	     sum=32;
     	   }
     	    else if(sum==44)
     	   {
     	     sum=58;
     	   }
     	      
            else if(sum==54)
     	   {
     	     sum=69;
     	   }
     	    else if(sum==70)
     	   {
     	     sum=90;
     	   }
     	    else if(sum==80)
     	   {
     	     sum=83;
     	   }
     	     else if(sum==87)
     	   {
     	     sum=93;
     	   }
     	     else if(sum==35)
     	   {
     	     sum=5;
     	   }
     	     else if(sum==39)
     	   {
     	     sum=3;
     	   }
     	    else if(sum==49)
     	   {
     	     sum=34;
     	   }
     	     else if(sum==89)
     	   {
     	     sum=68;
     	   }
     	     else if(sum==97)
     	   {
     	     sum=86;
     	   }
     	     else if(sum==99)
     	   {
     	     sum=26;
     	   }
     	    
     	    if(sum==95&&(a==1||a==2||a==3||a==4||a==5)) 
     	    {
     	    	sum+=a;
     	    }  
     	     else
     	     {
     	     	sum+=0;
     	     }
 
	sum = ((sum==98&&a==1||a==2)?sum+=a:(sum>=0&&sum<95?sum+=a:(sum+=0)));
      		System.out.println(a+"       "+sum);
      	}while(sum<=100);
      	
      	System.out.println("Congratulations You Win This Game 💸️ ");
     }
}
 
