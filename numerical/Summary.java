import java.util.*;
import java.lang.Math;



public class Summary {

  public static double mean(double[] arr){
    // Does not check whether the array is empty
    int n = arr.length;
    double output = arr[0];

    for (int i = 1; i < n; i++){
      output = (i * output + arr[i])/(i+1);
    }
    return output;
  }

  public static double sd(double[] arr){
    // arr must have length at least 2

    int n = arr.length;
    double m = arr[0];
    double sd2 = 0;

    for (int i = 1; i < n; i++){
      double ii = (double)i;
      m = (ii * m + arr[i])/(ii+1);
      sd2 = (ii/(ii+1)) * sd2 + (1/ii) * (arr[i] - m) * (arr[i] - m);
    }

    return Math.sqrt(sd2);

  }

  public static void main (String[] args){
    double[] data = {1.1, 3.0, 4.5, 6.3, 9.1, 10.2, 2.4};
    // double[] data = {};

    System.out.println("The mean is: " + mean(data));
    System.out.println("The SD is: " + sd(data));
    System.out.println("The sample size is: " + data.length);

  }
}
