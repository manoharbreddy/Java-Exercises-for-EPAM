import java.util.*;
import java.lang.*;
import java.io.*;

class Patient{
String name;
double height,weight;
Patient(double w,double h)
{
weight=w;
height=h;
}
double BMI()
{       
       return ((weight/(height*height))*703);
}
}
class MainPatient
{
  public static void main (String[] args)
 {
  Patient p=new Patient(70,150);
  System.out.println("The BMI:"+p.BMI());
}
}
