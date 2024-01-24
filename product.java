class shop
{ 
  public static void main(String args[])
  {
     String name="Saikiran",coup="CODINGHUB",payment="creditcard";
     int code=7461,price=999,quantity=15,carry_bag=50;
     double total,discount,total2,cgst,sgst,discount2,charges=0;
     total=price*quantity;
     System.out.println("WELCOME TO SAIKI SHOPPING MALL:");
     System.out.println("Total price is "+total);
     if(total>10000)
     { 
       discount=17/100.0*total;
     }
     else
     {
       discount=3/100.0*total;
     }
     total2=total-discount;
     System.out.println("Discount is "+(int)discount);
     System.out.println("Total After Discount is "+total2);
     cgst=9/100.0*total2;
     sgst=9/100.0*total2;
     total2=total2+cgst+sgst;
     System.out.println("Total After taxses is "+(int)total2);
     System.out.println("If you have a coupon please enter here: ");
     if(coup=="CODINGHUB")
     { 
       discount2=20/100.0*total2;
     }
     else
     {
       discount2=discount;
     }
     total2=total2-discount2;
     System.out.println("Couponcode Discount is "+(int)discount2);
     System.out.println("Total After couponcode Discount is "+(int)total2);
     if(payment=="creditcard")
     { 
       charges=2.5/100.0*total2;
     }
     total2=total2-charges+carry_bag;
     System.out.println("Grand Total is "+(int)total2);
     System.out.println("THANK YOU VISIT AGAIN,saiki");
  }
}

     
     