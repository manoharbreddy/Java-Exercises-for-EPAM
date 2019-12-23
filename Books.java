class Author
{
public static String name,email;
public static char gender;
Author(String n,String e,char g){
name=n;
email=e;
gender=g;
}
}
class Book{
String name1,author;
double price;
int qty;
Book(String n1){
name1=n1;
}
void setQty(){
qty=10;
}
void setP[rice(){
price=100.0;
}
double getPrice(){
return price;
}
int getqty(){
return qty;
}
String getName(){
return name;
}
void getAuthor(){
System.out.println("Author is:"+Author.name);
System.out.println("mail id"+Author.email);
System.out.println("gender"+Author.gender);
}
}
public class Books{
public static void main(String args[]){
Booh b=new Book("Java");
Author a=new Author("manohar","m@gmail.com","f");
b.setPrice();
b.setqty();
System.out.println("Book Name:"+b.getName());
System.out.println("stock is:"+b.getqty());
b.getAuthor();
}
}