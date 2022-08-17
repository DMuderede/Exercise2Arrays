package Exercise2;

public class Question5 {

    public static void main(String args[]) {

        double[] arr = {19, 12, 16, 200, 13, 14, 57, 78, 45, 67};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.println("The average is"+ average);

    }
}