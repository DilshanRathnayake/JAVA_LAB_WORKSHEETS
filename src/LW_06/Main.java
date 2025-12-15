package LW_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    private static final Scanner scanner = new Scanner(System.in);


    private static final List<Pet> petList = new ArrayList<>();
    private static final List<Dog> dogList = new ArrayList<>();
    private static final List<Cat> catList = new ArrayList<>();


    public static void main(String[] args) {

        System.out.println("Initial Input");
        inputPetsUntilStop();

        System.out.println("Requirement 2 and 4: All pets output");
        outputAllPetsList(petList);

        System.out.println("Requirement 3: Grouped output(Cats and Dogs)");
        outputGroupPets();

        System.out.println("Requirement 5: Dog statistics");
        calculaeDogStats(dogList);

        System.out.println("Requirement 6: Interactive pet manager");
        showMenu();


    }


    private static void inputPetsUntilStop() {
        String name;

        while (true) {
            System.out.println("Enter pet name: ('STOP' to finish)");
            name = scanner.nextLine().trim();

            if(name.equalsIgnoreCase("STOP")){
                break;
            }

            System.out.println("Enter the pet type ('c' for Cat, 'd' for Dog)");
            String petType = scanner.nextLine().trim().toLowerCase();


            if(petType.equals("c")){
                addCat(name, true);
            }else if(petType.equals("d")){
                addDog(name, true);
            }else{
                System.out.println("Invalid type entered.");
            }
        }
    }

    private static void addCat(String name, boolean initialInput){
        Cat cat = new Cat();
        cat.setName(name);

        System.out.println("Enter " + name + "'s coat color: ");
        cat.setCostColor(scanner.nextLine().trim());

        petList.add(cat);
        catList.add(cat);

        if(!initialInput) {
            System.out.println("Cat added : " + cat.getName());
        }

    }


    private static void addDog(String name, boolean initialInput){
        Dog dog = new Dog();
        dog.setName(name);

        double weight = -1;

        while(weight < 0){
            try{
                System.out.println("Enter " + name + "'s weight : ");
                weight = Double.parseDouble(scanner.nextLine().trim());

                if(weight < 0){
                    System.out.println("Weight must be non negative.");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid weight format.");
                weight= -1;
            }
        }



        dog.setWeight(weight);

        petList.add(dog);
        dogList.add(dog);

        if(!initialInput){
            System.out.println("Do added : " + dog.getName());
        }


    }

    private static void outputAllPetsList(List<Pet> pets){
        if(pets.isEmpty()){
            System.out.println("The pet list is empty.");
            return;
        }

        for(Pet pet : pets){
            if(pet instanceof Cat cat){
                System.out.println("Cat name : " + cat.getName() + ", Cost color name is " + cat.getCostColor());
            }else if(pet instanceof Dog dog){
                System.out.println("Dog name : " + dog.getName() + ", Weight is " + dog.getWeight() + " kg");
            }
        }
    }


    private static void outputGroupPets(){
        System.out.println("Cat");

        if(catList.isEmpty()){
            System.out.println("No cats in the list.");
        }else {
            for(Cat cat : catList){
                System.out.println("Name: " + cat.getName() + ", Cost Color is " + cat.getCostColor());
            }
        }

        System.out.println("Dogs");

        if(dogList.isEmpty()){
            System.out.println("No dogs in the List.");
        }else{
            for (Dog dog : dogList){
                System.out.println("Name is " + dog.getName() + "Weight is" + dog.getWeight() + " kg" );
            }
        }

    }


    private static void calculaeDogStats(List<Dog> dogs){
        if(dogs.isEmpty()) {
            System.out.println("Dos are not in the list");
            return;
        }

        double totalWeight = 0;
        double minWeight = Double.MAX_VALUE;
        double maxWeight = Double.MIN_VALUE;

        for (Dog dog : dogs){
            double weight = dog.getWeight();
            totalWeight += weight;

            if(weight < minWeight) {
                minWeight = weight;
            }

            if (weight > maxWeight) {
                maxWeight = weight;
            }

            double averageWeight = totalWeight / dogs.size();


            System.out.println("Total number of dogs :" + dogs.size());
            System.out.println("Average dogs weight : " + averageWeight);
            System.out.println("Minimum dogs weight : " + minWeight);
            System.out.println("Maxinum dogs weight : " + maxWeight);

        }

    }


    private static void showMenu() {
        int choice;

        do {
            System.out.println("-------Pet manager menu--------");
            System.out.println("1. Add cat");
            System.out.println("2. Add dog");
            System.out.println("3. Remove Cat using name");
            System.out.println("4. Remove dog using name");
            System.out.println("5. Displaying dog statistics");
            System.out.println("0. Quit");
            System.out.println("Enter your choice : ");


            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter  new cat's name :");
                    String catName = scanner.nextLine().trim();
                    addCat(catName, false);
                    break;
                case 2:
                    System.out.println("Enter new dog's name : ");
                    String dogName = scanner.nextLine().trim();
                    addDog(dogName, false);
                    break;
                case 3:
                    System.out.println("Enter name of cat to remove : ");
                    removePet(scanner.nextLine().trim(), Cat.class);
                    break;
                case 4:
                    System.out.println("Enter the name of dog to remove : ");
                    removePet(scanner.nextLine().trim(), Dog.class);
                    break;
                case 5:
                    outputGroupPets();
                    break;
                case 6:
                    calculaeDogStats(dogList);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");

            }


        } while (choice != 0);


    }
        private static void removePet(String name, Class<?> petType ){
            boolean removed = petList.removeIf(pet -> pet.getName().equals(name) && petType.isInstance(pet));


            if(petType == Cat.class){
                catList.removeIf(cat -> cat.getName().equalsIgnoreCase(name));

                if(removed){
                    System.out.println("Cat '" + name + "' removed");
                }else{
                    System.out.println("Cat '" + name + "' not found");
                }

            }else if(petType == Dog.class){
                dogList.removeIf(dog -> dog.getName().equalsIgnoreCase(name));
                if(removed){
                    System.out.println("Dog ;" + name + "' removed");
                }else{
                    System.out.println("Dog '" + name + "' not found");
                }
            }
        }





}
