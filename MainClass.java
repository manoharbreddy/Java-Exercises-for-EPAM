public class Animal {
public Animal() {
System.out.println("A new animal has been created!");
}   
public void sleep() {
System.out.println("An animal sleeps...");
}
public void eats() {
System.out.println("An animal eats...");
}
}
public class Bird  extends Animal {
public Bird() {
super();
System.out.println("A new bird has been created!");
}
public void sleep() {
System.out.println("A bird sleeps...");
}
public void eats() {
System.out.println("A bird eats...");
}
}
public class MainClass {

public static void main(String[] args) {
Animal a = new Animal();
Bird b = new Bird();
a.sleep();
a.eats();
b.sleep();
b.eats();
}
}