public class AscendingAndDecending {

  //method for generat ascending order
  public static int[] AscendingOrder(int[] x) {
    int temp = 0;//dummy varibale
    for(int i=0;i<x.length;i++) {
      for(int j=i+1;j<x.length;j++) {
        if(x[i]>x[j]) {// comparing one by one
          temp = x[i];
          x[i] = x[j];
          x[j] = temp;
        }  
      }
    }
    return x; //returning ascending array
  }

  //method for generat decending order
  public static int[] DecendingOrder(int[] x) {
    int temp = 0;//dummy variable
    for(int i=0;i<x.length;i++) {
      for(int j=i+1;j<x.length;j++) {
        if(x[i]<x[j]) {//comparing one by one
          temp = x[i];
          x[i] = x[j];
          x[j] = temp;
        }  
      }
    }
    return x;//returning decending array
  }

  public static void main(String[] args) {
    
    int[] numbers = {23,45,32,17,25,39,47,35,22,65,91,16};
    System.out.println("Array values are :");//printing array values
    for(int num:numbers) {
      System.out.print(" "+num);
    }

    int[] ascendingArray = AscendingOrder(numbers);//storing ascending array
    System.out.println("\n\nAscending array values are :");//printing array values
    for(int num:numbers) {
      System.out.print(" "+num);
    }

    int[] decendingArray = DecendingOrder(numbers);//storing decending array
    System.out.println("\n\nDecending array values are :");//printing array values
    for(int num:numbers) {
      System.out.print(" "+num);
    }

  }
}