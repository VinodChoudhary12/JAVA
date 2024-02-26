import java.util.Scanner;

public class Main 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {  
        Scanner sc = new Scanner(System.in);
        try {
                int choice=1;
            do{
                    System.out.println("Press 1 for Check Armstrong Number of 3 Numbers");
                    System.out.println("Press 2 for Check Number Prime between Numbers");
                    System.out.println("Press 3 for Check Number Is palindrom or not");
                    System.out.println("Press 4 for Print Star");
                    System.out.println("Press 5 for Exit");
                    
                    choice = sc.nextInt();
                        switch (choice) 
                        {
                            case 1:
                                ArmstrongForThree.main(args);
                                break;
                            case 2:
                                PrimebetweenNumber.main(args); 
                                break;
                            case 3:
                                Palindrom.main(args);
                                break;
                            case 4:
                                Star.main(args);
                                break;
                            
                            default:
                                System.out.println("Please Enter Vaild Choice");
                                break;
                        }
                      
                }while(choice!=5);
                     
            } catch (Exception e) {
               System.out.println(e);
            }
       sc.close();     
    }    
}
