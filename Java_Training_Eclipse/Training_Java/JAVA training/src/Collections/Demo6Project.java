package Collections;
import java.util.*;
import java.io.*;
 
interface IAnimal {
    void setId(int id);
    int getId();
    void setSpecies(String species);
    String getSpecies();
    void setName(String name);
    String getName();
    void setAge(int age);
    int getAge();
}
 
interface IZoo {
    void addAnimal(IAnimal animal);
    void removeAnimal(int id);
    int countAnimals();
    List<IAnimal> getAnimalsBySpecies(String species);
    List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge();
}
 
class Animal implements IAnimal {
    private int id;
    private String species;
    private String name;
    private int age;
 
    public void setId(int id) {
        this.id = id;
    }
 
    public int getId() {
        return id;
    }
 
    public void setSpecies(String species) {
        this.species = species;
    }
 
    public String getSpecies() {
        return species;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
}
 
class Zoo implements IZoo {
    private List<IAnimal> animals;
 
    public Zoo() {
        animals = new ArrayList<>();
    }
 
    public void addAnimal(IAnimal animal) {
        animals.add(animal);
        System.out.println("Added animal: " + animal.getName() + " (" + animal.getSpecies() + ")");
    }
 
    public void removeAnimal(int id) {
        boolean removed = animals.removeIf(animal -> animal.getId() == id);
        if (removed) {
            System.out.println("Removed animal with ID: " + id);
        } else {
            System.out.println("No animal found with ID: " + id);
        }
    }
 
    public int countAnimals() {
        return animals.size();
    }
 
    public List<IAnimal> getAnimalsBySpecies(String species) {
        List<IAnimal> result = new ArrayList<>();
        for (IAnimal animal : animals) {
            if (animal.getSpecies().equalsIgnoreCase(species)) {
                result.add(animal);
            }
        }
        System.out.println("Found " + result.size() + " animals of species: " + species);
        return result;
    }
 
    public List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge() {
        Map<Integer, List<IAnimal>> ageMap = new HashMap<>();
        for (IAnimal animal : animals) {
            int age = animal.getAge();
            ageMap.putIfAbsent(age, new ArrayList<>());
            ageMap.get(age).add(animal);
        }
        List<Map.Entry<Integer, List<IAnimal>>> sortedEntries = new ArrayList<>(ageMap.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey()));
        return sortedEntries;
    }
}
 
public class Demo6Project{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
 
        IZoo zoo = new Zoo();
        System.out.print("Enter the number of animals to add: ");
        int aCount = Integer.parseInt(br.readLine().trim());
        // Adding animals
        for (int i = 1; i <= aCount; i++) {
            System.out.println("Enter details for animal " + i + ":");
            System.out.print("ID (Integer): ");
            int id = Integer.parseInt(br.readLine().trim());
            System.out.print("Species (String): ");
            String species = br.readLine().trim();
            System.out.print("Name (String): ");
            String name = br.readLine().trim();
            System.out.print("Age (Integer): ");
            int age = Integer.parseInt(br.readLine().trim());
            IAnimal animal = new Animal();
            animal.setId(id);
            animal.setSpecies(species);
            animal.setName(name);
            animal.setAge(age);
            zoo.addAnimal(animal);
        }
        // Display total count of animals
        System.out.println("\nThere are " + zoo.countAnimals() + " animals in the zoo.");
 
        // Get animals by species
        System.out.print("Enter species to search for: ");
        String speciesToSearch = br.readLine().trim();
        List<IAnimal> specAnimals = zoo.getAnimalsBySpecies(speciesToSearch);
        // Display animals by species
        System.out.println(speciesToSearch + ":");
        for (IAnimal animal : specAnimals) {
            out.println(animal.getName() + " (" + animal.getAge() + " years old)");
        }
 
        // Display animals by age
        System.out.println("\nAnimals by age:");
        List<Map.Entry<Integer, List<IAnimal>>> animalsByAge = zoo.getAnimalsByAge();
        for (Map.Entry<Integer, List<IAnimal>> groups : animalsByAge) {
            out.println(groups.getKey() + " year(s) old:");
            for (IAnimal animal : groups.getValue()) {
                out.println("- " + animal.getName() + " (" + animal.getSpecies() + ")");
            }
        }
 
        // Removing an animal by ID
        System.out.print("\nEnter the ID of the animal to remove: ");
        int idToRemove = Integer.parseInt(br.readLine().trim());
        zoo.removeAnimal(idToRemove);
 
        // Display updated count of animals
        System.out.println("There are now " + zoo.countAnimals() + " animals in the zoo.");
        out.flush();
        out.close();
    }
}