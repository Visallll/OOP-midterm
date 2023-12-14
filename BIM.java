package BIMCalculate;
import java.util.Scanner;
public class BIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.print("Enter your weight(kg): ");
        float weight = sc.nextFloat();
        System.out.print("Enter your height(m): ");
        float height = sc.nextFloat();

        float BMI = weight/(height*height);

        if(BMI<18.5){
            System.out.println(BMI + " Underweight");
        }else if(BMI>18.5 && BMI<24.9){
            System.out.println(BMI+ " Normal weight");
        }else{
            System.out.println(BMI + " Overweight");
        }
        sc.close();
    }

}
}