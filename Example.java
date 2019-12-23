class Fruit
{    
protected char name, taste, size  ;
scanner sc = new scanner ( system. in );
public void eat ( ) 
{
scanner sc = new scanner ( system. in );
System. out. println ( "Fruit Name" ) ;
name = nextChar ( ) ;
System. out. println ( " Fruit taste " ) ;
taste = nextChar ( ) ;
System. out. println ("Name of the fruit is: " + name ) ;
System. out. println ("Taste of the fruit is: " + taste ) ;  
}}
class Apple extends Fruit{
void eat ( ) 
{
System.out.println ( " Name of the fruit is Apple " ) ;
System. out. println ( " Taste of the fruit is sweet " ) ;
}  
}
class orange extends fruit
{
public void eat ( ) 
{
System. out. println ( " Name of the fruit is Orange " ) ;
System. out. println ( " Taste of the fruit is sour " ) ;
}
} 
class Example
{
public static void main ( string args )
{
Apple A = new Apple ( ) ;
A .eat ( ) ;
Orange O = new Orange ( ) ;
O.eat ( ) ;
}
}
