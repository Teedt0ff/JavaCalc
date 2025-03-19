public class Calculator{
//Instance Variables
  private int num1;
  private int num2;
  private char operator;
  private boolean cont;

//Constructor
  public Calculator(int num1, int num2, char operator){
    this.num1 = num1;
    this.num2 = num2;
    this.operator = operator;
  }
/*
Having constructors like this should ideally be good.
This is because it allows to create objects either with or without parameters which should in theory limit the error checking.
  */

  public Calculator(){
    this.num1 = null;
    this.num2 = null;
    this.operator = null;
  }

//Getters
  public int getNum1(){
    return this.num1;
  }
  public int getNum2(){
    return this.num2;
  }
  public char getOperator(){
    return this.operator;
  }
  public boolean getCont(){
    return this.cont;
  }

//Setters
  public void setNum1(int num1){
    this.num1 = num1;
  }
  public void setNum2(int num2){
    this.num2 = num2;
  }
  public void setOperator(char operator){
    this.operator = operator;
  }
  public void setCont(boolean cont){
    this.cont = cont;
  }

//Special Purpose Methods
  public int add(){
    return this.num1 + this.num2;
  }
  public int subtract(){
    return this.num1 - this.num2;
  }
  public int multiply(){
    return this.num1 * this.num2;
  }
  public int divide(){
    return this.num1 / this.num2;
  }
  public int modulo(){
    return this.num1 % this.num2;
  }
  
//toString
  public String toString(){
    return "The first number in this instance is " + this.num1 + ", the second number is " + this.num2 + "/n" + ", the desired operation to be completed is" + this.operator + ", and the result of this operation is " + this.result;
  }
  
}