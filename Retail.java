import java.util.Scanner;

public class Retail implements RetailOperation {
     float DisCount=2;
     float CosmeticTax=5;
     float PerfumeTax=7;
     float clotheTax=1;
     float TotalWithTax;
     
     float CosmeticCost; 
     float PerfumeCost;
     float ClotheCost;
    public Retail(float cosmeticCost, float perfumeCost, float clotheCost) {
        CosmeticCost = cosmeticCost;
        PerfumeCost = perfumeCost;
        ClotheCost = clotheCost;
    }
    

    public void GetTotalCost() {
        System.out.println("Total cost of Retail Purchased : "+(CosmeticCost+PerfumeCost+ClotheCost));
       
    }

    public void TotalExtentedCost() {
        
        float T1= CosmeticCost+((CosmeticCost*CosmeticTax)/100);
        float T2= PerfumeCost+((PerfumeCost*PerfumeTax)/100);
        float T3= ClotheCost+((ClotheCost*clotheTax)/100);
         TotalWithTax = T1+T2+T3;
        System.out.println("Total cost of item With tax  :"+(T1+T2+T3));
        
    }

    public void GetTotalDiscount()
    {
         System.out.println("Cost after Giving Overall Discount : " +(TotalWithTax-(TotalWithTax*DisCount)/100));
    }

    public void DisCountPercent()
    {
        System.out.println("Overall Discount % Given  : "+DisCount);
    }


    public static void main(String[]args)
    {  
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your all cosmetic cost" );
        float cosmeticCost= sc.nextFloat();
        System.out.println("Enter your All Perfume Cost ");
        float perfumeCost= sc.nextFloat();
        System.out.println("Enter all Clothes Cost");
        float ClotheCost= sc.nextFloat();

       Retail R1 = new Retail(cosmeticCost, perfumeCost, ClotheCost);
       System.out.println("Total Cost Detail With Discount On the Reatail is");
       System.out.println(".............................................."); 
              R1.GetTotalCost();
              R1.TotalExtentedCost();
              R1.GetTotalDiscount();
              R1.DisCountPercent();
    }


}
