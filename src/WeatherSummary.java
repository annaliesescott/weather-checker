import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        Scanner scan = new Scanner(System.in);
        List<Double> prints = new ArrayList<>();

        while(scan.hasNextDouble()){
            prints.add(scan.nextDouble());
        }

        double max = prints.get(0);
        double min = prints.get(0);

        for(int i=0; i<prints.size(); i++){
            if(prints.get(i)>max){
                max = prints.get(i);
            }
            else if(prints.get(i)<min){
                min = prints.get(i);
            }
        }

         System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
