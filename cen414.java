import java.math.*;
  public class cen414 {
  
  public static void main (String[] args){
    
  int m0= 4;
  int m1=6;
  int num=64;
  
    //math operations
    System.out.println("ADEYEMO ARAMIDE DAVID 19CJ025764");
    System.out.println("The square root of 64 is " + Math.sqrt(num));
    System.out.println("The absolute value of 6-4 is " + Math.abs(m1-m0));
    System.out.println("6 raised to the power of 4 is " + Math.pow(m1,m0));
    System.out.println("The exponential value of 6 is " + Math.exp(m1));
    System.out.println("The cube root of 64 is " + Math.cbrt(num));

  //If/else statements

  
  if (m1>m0) {
    System.out.println("6 is greater than 4");
  }
  
  else {
  System.out.println("6 is less than 4");
  }
  
  
  //Ternary Operators
 
  
  String same =  m1==m0 ? "m1 is same as m0" : "m1 is not same as m0";
   System.out.println(same + "\n");
   
  String smaller = m1<m0? "m1 is smaller than m0" : "m1 is not smaller than m0";
   System.out.println(smaller + "\n");
   
  String greater = m1<m0? "m1 is greater than m0" : "m1 is not greater than m0";
  System.out.println(greater + "\n");
  
  
  //switch
  int plus = m1 + m0;
  switch (plus) {
    case 8:
      System.out.println("The sum of the two numbers is 6");
      break;
    case 9:
      System.out.println("The sum of the two numbers is 9");
      break;
    case 10:
      System.out.println("The sum of the two numbers is 10");
      break;
  
  }
  
  //logic operators
  System.out.println(m1 > m0 && m1 < m0);
  System.out.println(m1 > m0 || m1 < m0);
  System.out.println (!(m1 > m0 && m1 < m0));
  
  //Iteration 
  for (int i = 0; i <= 99; i++) {
    if (i == m1*m0) {
      System.out.println(i);
    }
  }
  


  }
}
  
  
