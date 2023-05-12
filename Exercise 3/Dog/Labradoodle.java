package Dog;

class Labradoodle extends Labrador implements Poodle {

    public void play() {
        System.out.println("My Labradoodle is very playful");
    }

    public void eat() {
        System.out.println("My Labradoodle loves to eat");
    }

    public void train() {
        System.out.println("My Labradoodle is obedient and smart!");
    }

    String breed = "Labradoodle";

   
}