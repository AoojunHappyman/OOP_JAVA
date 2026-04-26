abstract class SeaAnimal {
    String name;

    SeaAnimal(String name){
        this.name = name;
    }

    public abstract void move();
}

class Fish extends SeaAnimal{
    
    Fish(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Fish swims by moving its tail.");
    }
}

class Octopus extends SeaAnimal{
    
    Octopus(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Octopus moves using jet propulsion.");
    }
}

class SeaTurtle extends SeaAnimal{
    
    SeaTurtle(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Sea turtle glides gracefully through water.");
    }
}

public class Test{
   public static void main(String[] args) {
        SeaAnimal[] animals = new SeaAnimal[3];
        animals[0] = new Fish("Aoo");
        animals[1] = new Octopus("best");
        animals[2] = new SeaTurtle("Joe");

        for(int i = 0;i<animals.length;i++){
            animals[i].move();
        }
   } 
}
