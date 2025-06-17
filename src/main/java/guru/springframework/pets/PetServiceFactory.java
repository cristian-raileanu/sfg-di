package guru.springframework.pets;


public class PetServiceFactory {
    public static PetService getPetService(String petType) {
        switch (petType) {
            case "Dog":
                return new DogPetService();
            case "Cat": return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
