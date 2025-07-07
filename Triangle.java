
// GeometricObject (provided with this assignment and required for submission).
// Class Triangle has the following characteristics:
public class Triangle extends GeometricObject {
   // 1. Defines three private variables of type double: side1, side2, and side3. Each is initialized with the value of 1.0.
   private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
   // 2. Defines a default (non-argument) constructor method to create default triangle objects (with default sides).
   public Triangle(){
      this.side1 = 1.0;
      this.side2 = 1.0;
      this.side3 = 1.0;
   }
   // 3. Defines a second constructor to allow the user to create triangle objects with user-specific input values for all sides. The constructor rejects negative values (invalid) for a side.
   public Triangle(double side1, double side2, double side3){
      if(isPositive(side1) && isPositive(side2) && isPositive(side3)){
         this.side1 = side1;
         this.side2 = side2;
         this.side3 = side3; 
      } else {
         System.out.println("Negative input(s) rejected!");
         System.out.println("Default parameters will be printed!");
      }
   }
   private boolean isPositive(double side){
      return (side > 0.0) ? true : false;
   }
   // 4. Defines three access (get) methods, one for each variable, named as getSide1(), getSide2(), and getSide3(). Get methods reject negative values (invalid) for a side.
   public double getSide1(){
      return isPositive(this.side1) ? this.side1 : 1.0;
   }
   public double getSide2(){
      return isPositive(this.side2) ? this.side2 : 1.0;
   }
   public double getSide3(){
      return isPositive(this.side3) ? this.side3 : 1.0;
   }
   // 5. Defines three access (set) methods, one for each variable, named as setSide1(), setSide2(), and setSide3(). Set methods reject negative values (invalid) for a side.
   public void setSide1(double side1){
      if(isPositive(side1)){
         this.side1 = side1;
      } else {
         System.out.println("Negative input(s) rejected!");
         System.out.println("Default parameters will be printed!");
      }
   } 
   public void setSide2(double side2){
      if(isPositive(side2)){
         this.side2 = side2;
      } else {
         System.out.println("Negative input(s) rejected!");
         System.out.println("Default parameters will be printed!");
      }
   }
   public void setSide3(double side3){
      if(isPositive(side3)){
         this.side3 = side3;
      } else {
         System.out.println("Negative input(s) rejected!");
         System.out.println("Default parameters will be printed!");
      }
   }
   // 6. Defines method getArea() that computes and returns the area of a triangle object. Here is the math (Heron’s formula) for the area computation:
   public double getArea(){
      double s = (side1 + side2 + side3) / 2.0;
      double Area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
      return Area; 
   }
   // 7. Defines method getPerimeter() that computes and returns the perimeter of a triangle object. Here is the math for perimeter computation:
   public double getPerimeter(){
      double Perimeter = (side1 + side2 + side3);
      return Perimeter;
   }
   
   // 8. Defines method toString() that returns a meaningful description of a triangle object including its name, sides, area, and perimeter in the following format (the values below are just an example for illustration purposes).
   /*
   public String toString(String nameOfTriangle){
      return String.format("\n\nTriangle: \t%s \nSide 1: \t\t%.1f \nSide 2: \t\t%.1f \nSide 3: \t\t%.1f \nArea: \t\t%.6f \nPerimeter: \t%.1f \nColor: \t\t%s \nIs Filled: \t\t%b",nameOfTriangle,side1,side2,side3,getArea(),getPerimeter(),super.getColor(), super.isFilled());
   }
   */
   public String toString(){
      return String.format("\nSide 1: \t\t%.1f \nSide 2: \t\t%.1f \nSide 3: \t\t%.1f \nArea: \t\t%.6f \nPerimeter: \t%.1f \nColor: \t\t%s \nIs Filled: \t%b", side1, side2, side3, getArea(), getPerimeter(), super.getColor(), super.isFilled());
   }  
}
