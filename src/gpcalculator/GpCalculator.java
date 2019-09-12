
package gpcalculator;

import java.util.*;
public class GpCalculator {
    //**********************//
       static   int storeA=0;
       static   int storeB=0;
       static   int storeC=0;
       static   int storeD=0;
    //**********************//
       static   int Cunit;
       static   String Cgrade;
   //**********************//
    
    public static void main(String[]args){
       Scanner input=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        System.out.println(".....Gp Calculator.......");
        
       System.out.println("Enter total units");
       
        int Tunits = input.nextInt();
              
                   int TCunit = 0;
                   int temp=0;
         for(int i=1; i<=Tunits;  i++){
             System.out.print("------ Course Code>>  ");
            String Ccode=in.nextLine();
            System.out.print("Course Unit>>  ");
            Cunit=input.nextInt();
                  
                  TCunit = TCunit+ Cunit; 
            if(TCunit<=Tunits && TCunit>0){
            System.out.print("Enter Grade>>  " );
            Cgrade = in.nextLine();
            
                      if(Cgrade.equalsIgnoreCase("A")){
                int calc=5*Cunit;
                storeA = storeA+ calc;
            }else if(Cgrade.equalsIgnoreCase("B")){
                int calc2=4*Cunit;
                storeB = storeB+ calc2;
            }else if(Cgrade.equalsIgnoreCase("C")){
                int calc3=3*Cunit;
                storeC = storeC+ calc3;
            }else if(Cgrade.equalsIgnoreCase("D")){
                int calc4=2*Cunit;
                storeD = storeD+ calc4;
            }else if(Cgrade.equalsIgnoreCase("F")){
                int calc5=0;
            }else{
                System.out.println("Wrong grade value, try again!! ");
            break; 
            }
            
            temp=temp + Cunit;
            i=temp;
                
            }else{System.out.println("Error!!!\nEither Course Unit is <= 0 or Total-Course-Unit exceeded Total-Unit");
                break; 
            }
        }
        
        
        if(TCunit<=Tunits && Cunit>0){
             if(Cgrade.equalsIgnoreCase("A") || Cgrade.equalsIgnoreCase("B") || Cgrade.equalsIgnoreCase("C") || Cgrade.equalsIgnoreCase("D") || Cgrade.equalsIgnoreCase("F")){ 
       double output = (storeA+storeB+storeC+storeD);
        output=(output)/(Tunits); 
            System.out.print("Total grade point is : ");
            System.out.println(output);
        
        if(output>=4.5 && output<=5.0){
            System.out.print("<<First Class grade>>");
        }else if (output>=3.5 && output<4.5){
            System.out.print("<<Second Class Upper>>");
        }else if (output>=2.5 && output<3.5){
            System.out.print("<<Second Class Lower>>");
        }else if (output<2.5){
            System.out.print("<<Pass>>");
        }else{
            System.out.print("Oops!! something went wrong, try again! ");
        }
    }
    
}
    }
}




            
        
    




