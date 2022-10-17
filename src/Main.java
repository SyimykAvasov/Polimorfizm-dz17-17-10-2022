public class Main {
    public static void main(String[] args) {
       Animal [] animals= {new Shark(),new Turtle(),new Eagle()};
       for (Animal animal1: animals){
           if (animal1 instanceof  Shark){
               ((Shark)animal1).attack();
           }else  if (animal1.getClass().getName().equals("Turtle")){
               ((Turtle)animal1).swim();

           }else if (animal1.getClass().getName().equals("Eagle")){
               ((Eagle)animal1).fly();
           }else {
               animal1.suzuu();
           }
           Shark shark1 = new Shark();
           Turtle turtle1 = new Turtle();
           Eagle eagle1 = new Eagle();

        Shark[] sharks = {shark1};
        Turtle[] turtle = {turtle1};
        Eagle[] eagles = {eagle1};

        Animal[][] animals1 = {sharks,turtle,eagles};

       }
    }
}