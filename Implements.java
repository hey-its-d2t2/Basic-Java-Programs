
interface Animal {
   public void eat();
   public void travel();
}
interface WaterLivingAnimal
{
	public void livingInGround();
} 
interface Birds extends Animal,WaterLivingAnimal
{
	public void fly();
}
class Parrot
{
	public void eat() 
   {
      System.out.println("Parrot eats");
   }

   public void travel() 
   {
      System.out.println("Parrot travels");
   } 
   public void fly()
   {
   	System.out.println("Parrot can fly");
   }
}
class Dog implements Animal
{

   public void eat() 
   {
      System.out.println("Dog eats");
   }

   public void travel() 
   {
      System.out.println("Dog travels");
   } 
   public void fly()
   {
   	System.out.println("Dog can not fly");
   }
   public static void main(String args[]) 
   {
      Dog d = new Dog();
      d.eat();
      d.travel();
      d.fly();
      Parrot p = new Parrot();
      p.eat();
      p.travel();
      p.fly();
   }
} 