import java.util.*;  
class Main 
{   
     
    public static void main(String args[])   
    {     
        int units,CRM,PRM,connection,commercial,industrial;  
        double bill = 0;  
        Scanner sc = new Scanner(System.in);  
  
        System.out.println("Enter CRM");  
        CRM = sc.nextInt();  
        System.out.println("Enter PRM");  
        PRM = sc.nextInt();
        units = CRM-PRM;
        
        System.out.println("Enter connection");  
        connection = sc.nextInt();
        
        switch (connection) {
        case 1: 
        if(units<=100)  
        {  
            bill=units*1;  
        }  
        else if( units <= 200){  
            bill = 100*1+(units-100)*2;  
        }  
        else if(units>200)  
        {  
            bill = 100*1+200*2+(units-200)*3;  
        }  
        System.out.println("The electricity bill for domestic "+units+" is : "+bill);
        
        case 2:
            if(units<=100)  
        {  
            bill = units*2;  
        }  
        else if( units <= 200){  
            bill = 100*2+(units-100)*4;  
        }  
        else if(units > 200)  
        {  
            bill = 100*2+200*4+(units-200)*6;  
        }  
        System.out.println("The electricity bill for commercial "+units+" is : "+bill);
        
        case 3:
            if(units<=100)  
        {  
            bill=units*3;  
        }  
        else if(units<=200){  
            bill = 100*3 +(units-100)*6;  
        }  
        else if(units>200)  
        {  
            bill = 100*3 +200*6 +(units-200)*9;  
        }  
        System.out.println("The electricity bill for industrial "+units+" is : "+bill);
        
         
            
        
        }
    }   
}
