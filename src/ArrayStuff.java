import java.util.Random;
import java.util.Scanner;
public class ArrayStuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dataPoints[]=new int[100];
        Random rnd = new Random();
        int Integer=0;
        for(int i=0;i<100;i++) {
            dataPoints[i]=rnd.nextInt(100) + 1;;}
        System.out.println("DataPoints Array:");
        for(int i=0;i<100;i++) {
            System.out.print(dataPoints[i]+" | ");}
        double sum=0;
        for(int i=0;i<dataPoints.length;i++) {
            sum=dataPoints[i]+sum;}
        double avg=sum/dataPoints.length;
        System.out.println("\nSum of elements in the dataPoint array is "+sum);
        System.out.println("The average of the random array dataPoints is: "+avg);
        String pInteger1="Enter a number between 1 & 100";
        Integer = SafeInput.getRangedInt(in,pInteger1,1,100);
        int count=0;
        for(int i=0;i<dataPoints.length;i++) {
            if(Integer==dataPoints[i])
                count++;}
        System.out.println(Integer+" occurs in the array for "+count+" time(s)");
        String pInteger2="Enter a value between 1 and 100";
        Integer=SafeInput.getRangedInt(in,pInteger2,1,100);
        for(int i=0;i<dataPoints.length;i++) {
            if(Integer==dataPoints[i]) {
                int position=i+1;
                System.out.println(Integer+" was found at position "+position);
                break;}
            if(i==100)
                System.out.println(Integer+" not found in the array");}
        int min=dataPoints[0];
        int max=dataPoints[0];
        for(int i=0;i<dataPoints.length;i++) {
            if(min>dataPoints[i]) {
                min=dataPoints[i];}
            if(max<dataPoints[i]) {
                max=dataPoints[i];}
        }
        System.out.println("The maximum value of the dataArray is: "+max);
        System.out.println("The minimum value of the dataArray is: "+min);
        System.out.println("Average of the array dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        double sum=0;
        for(int i=0;i<values.length;i++)
            sum=values[i]+sum;
        return sum/values.length;
    }
}