abstract class Instrument
{
String InstrumentName="";
abstract void play();
}
class Piano extends Instrument
{
void play()
{
System.out.println("Piano plays very well:");
}
}
class Flute extends Instrument
{
void play()
{
System.out.println("Flute playing is very pleasant");
}
}
class Guitar extends Instrument
{
void play()
{
System.out.println("Guitar is playing tin tin tin ");
}
public static void main(String ar[])
{
Instrument[] Instru=new Instrument[10];
Instru[0].InstrumentName="Piano";
Instru[1].InstrumentName="Flute";
}
}