
import java.util.Scanner;

public class testTriangle {
   // methode the prints traingle information
   private static void printTriangle(Triangle tri, String nameOfTriangle){
     System.out.println("\n");
     System.out.print(String.format("Triangle: \t%s", nameOfTriangle) + tri); 
     System.out.println("\n");
   }
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String sentVal = "yes";

      while(sentVal.equalsIgnoreCase("yes") || sentVal.equalsIgnoreCase("y")){
         Triangle myTriangle = new Triangle();
         //default values
         double side1_d = 1.0, side2_d = 1.0, side3_d = 1.0;
         myTriangle.setSide1(side1_d);
         myTriangle.setSide2(side2_d);
         myTriangle.setSide3(side3_d);
         //print triangle information
         printTriangle(myTriangle, "myTriangle");
         
         // herTriangle object
         System.out.println("ENTER THE DIMENTIONS OF HER TRIANGLE");
         System.out.print("side1: ");
         double side1_her = scan.nextDouble();
         System.out.print("side2: ");
         double side2_her = scan.nextDouble();
         System.out.print("side3: ");
         double side3_her = scan.nextDouble();

         System.out.print("color: ");
         scan.nextLine();
         String color_her = scan.nextLine();
         System.out.print("Filled? (true or false): ");
         boolean filled_her = scan.nextBoolean();
         
         Triangle herTriangle = new Triangle(side1_her, side2_her, side3_her);
         herTriangle.setFilled(filled_her);
         herTriangle.setColor(color_her);
         printTriangle(herTriangle, "herTriangle");
         //scan.nextLine();
         
         System.out.println("ENTER THE DIMENTIONS OF HIS TRIANGLE");
         System.out.print("side1: ");
         double side1_his = scan.nextDouble();
         System.out.print("side2: ");
         double side2_his = scan.nextDouble();
         System.out.print("side3: ");
         double side3_his = scan.nextDouble();
         
         System.out.print("color: ");
         scan.nextLine();
         String color_his = scan.nextLine();
         System.out.print("Filled? (true or false): ");
         boolean filled_his = scan.nextBoolean();
         
         Triangle hisTriangle = new Triangle();
         hisTriangle.setSide1(side1_his);
         hisTriangle.setSide2(side2_his);
         hisTriangle.setSide3(side3_his);
         hisTriangle.setFilled(filled_his);
         hisTriangle.setColor(color_his);
         printTriangle(hisTriangle, "hisTriangle");
         scan.nextLine();
         
         System.out.print("Would you like to continue? (y/n): ");
         sentVal = scan.nextLine();
      }
      scan.close();
   }
}
