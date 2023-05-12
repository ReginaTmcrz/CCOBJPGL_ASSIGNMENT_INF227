package Cat;

public class App {
    public static void main(String[] args) throws Exception {
    
        Pet Cat = new Pet();

        System.out.println();
        System.out.println("Breed: " + Cat.breedHimalayan);

        System.out.println();
        System.out.println("Parents");
        System.out.println("Father Cat Breed: " + Cat.persianBreed);
        System.out.println("Mother Cat Breed: " + Cat.siameseBreed);

        System.out.println();
        System.out.println("Appearance");
        System.out.println("Eye Color: " + Cat.eyeColor);
        System.out.println("Eye Shape: " + Cat.eyeShape);
        System.out.println("Coat Color: " + Cat.coatColor);
        System.out.println("Coat type: " + Cat.coatType);
        System.out.println("Height: " + Cat.height);
        System.out.println("Weight: " + Cat.weight);

        System.out.println();
        System.out.println("Characteristics");
        Cat.eat();
        Cat.sleep();
        Cat.shed();
        Cat.play();
    
    }
}
