package Dog;

public class App {
    public static void main(String[] args) throws Exception {
 
        Labradoodle mixBreedDog = new Labradoodle();

        System.out.println();
        System.out.println("Breed: " + mixBreedDog.breed);

        System.out.println();
        System.out.println("Parents");
        System.out.println("Father Dog Breed: " + mixBreedDog.breedLab);
        System.out.println("Mother Dog Breed: " + mixBreedDog.breedPoodle);
        
        System.out.println();
        System.out.println("Apperance");
        System.out.println("Coat Color: " + mixBreedDog.coatColor);
        System.out.println("Type of Coat: " + mixBreedDog.typeOfCoat);
        System.out.println("Eye Color: " + mixBreedDog.eyeColor);
        System.out.println("Eye Shape: " + mixBreedDog.EyeShape);
        System.out.println("Height: " + mixBreedDog.Height);
        System.out.println("Weight: " + mixBreedDog.Weight);

        System.out.println();
        System.out.println("Characteristic");
        mixBreedDog.play();
        mixBreedDog.eat();
        mixBreedDog.train();
    }
}
