package ro.sit.homework.homework04;

import java.util.HashMap;

public class PetHotel {
    private HashMap<String, Pet> dogHashMap = new HashMap<>();
    public static void main(String[] args) {
        PetHotel petHotel = new PetHotel();
        Pet pet1 = new Pet(1, "Shihtsu", "Male", "Carlos");
        Pet pet2 = new Pet(6, "Golden", "male", "Bruno");
        Pet pet3 = new Pet(3, "Maidanez", "male", "Dombita");
        Pet pet4 = new Pet(10, "Dalmatian", "female", "Lulu");

        System.out.println("Adding pets to hotel:");
        System.out.println("");

            petHotel.addDogToRoom("WhiteRoom", pet1);
            petHotel.addDogToRoom("BlueRoom", pet2);
            petHotel.addDogToRoom("VipRoom", pet3);
            System.out.println("");
            System.out.println("Initial list of dogs: ");
            petHotel.dogsList();
            System.out.println("");
            System.out.println("Adding dog to an occupied room: ");
            petHotel.addDogToRoom("VipRoom", pet4);
            System.out.println("");
            System.out.println("Remove a dog from a given room: ");
            petHotel.removeDogFromRoom("BlueRoom");
            System.out.println("");
            System.out.println("Current ist of dogs: ");
            petHotel.dogsList();
            System.out.println("");
            System.out.println("Remove a dog from an unexisting room: ");
            petHotel.removeDogFromRoom("SilverRoom");
            System.out.println("");
            System.out.println("List of dogs: ");
            petHotel.dogsList();
            System.out.println("");
            System.out.println("Add a new room: ");
            petHotel.addDogToRoom("GoldRoom", pet4);
            System.out.println("");
            System.out.println("Trying to add the same dog to a different room: ");
            petHotel.addDogToRoom("StandardRoom", pet4);
            System.out.println("");
            System.out.println("Current list of dogs: ");
            petHotel.dogsList();
        }
        public void addDogToRoom(String room, Pet dog) {
            if (dogHashMap.containsValue(dog)) {
                System.out.println(dog.toString() + " is already into another room number ");
                return;
            }
            if (dogHashMap.containsKey(room)) {
                System.out.println("Room no. " + room + " is already occupied by dog " + dogHashMap.get(room));
                return;
            }
            dogHashMap.put(room, dog);
            System.out.println(dog.toString() + " was included to room no. " + room);
        }
        public void removeDogFromRoom(String room) {
            if (dogHashMap.containsKey(room)) {
                Pet dog = dogHashMap.get(room);
                dogHashMap.remove(room);
                System.out.println(dog.toString() + " left the room no. " + room);
                return;
            } else {
                System.out.println("Room no. " + room + " was not occupied by a dog or room does not exist");
            }
        }
        public void dogsList() {
            for (String room : dogHashMap.keySet()) {
                System.out.println("Room " + room + ": " + dogHashMap.get(room));
            }
        }
}
