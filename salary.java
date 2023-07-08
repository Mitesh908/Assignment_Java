import java.util.*;  
class Main 
{   
     
    public static void main(String args[])   
    {     
        int salary,net,tax=0;  
        double bill = 0;  
        Scanner sc = new Scanner(System.in);  
  
        System.out.println("Enter salary");  
        salary = sc.nextInt();  
        net = salary*12;
        if(net<=250000)  
        {  
            tax=0+net;  
        }  
        else if( net <= 500000){  
            tax = ((net-250000)/10);  
        }  
        else if(net<=1000000)  
        {  
            tax = ((net-250000)/10) +((net-250000)/5);  
        }
        System.out.println("The net tax on your salary is "+salary+" is : "+tax);
        
         
    }   
}
