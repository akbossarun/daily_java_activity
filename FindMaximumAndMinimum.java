public class FindMaximumAndMinimum {

  //method for find the max value
  public static int findMaximumValue(int x[]) {
    int max = x[0];//taking first value from the array
    for(int num : x){//using enhanced for loop
      if(max<num)
        max = num;//storing the value
    }
    return max;
  }

  //method for find the mini value
  public static int findMinimumValue(int x[]) {
    int min = x[0];
    for(int i=0;i<x.length;i++){// using for loop
      if(min>x[i])
        min = x[i];//storing the value
    }
    return min;
  }

  public static void main(String[] args) {
    
    //array values
    int[] numbers = {34,25,23,11,45,6,43,93,59,29,32};

    System.out.print("Array Values are : ["); // printing the array values
    for(int num : numbers){
      System.out.print(" "+num);
    }
    System.out.println(" ]\nThe maximum value is : "+findMaximumValue(numbers));//max value
    System.out.println("The minimum value is : "+findMinimumValue(numbers));//min value
    
  }
}