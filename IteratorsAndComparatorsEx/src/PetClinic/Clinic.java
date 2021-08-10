package PetClinic;

import java.util.Iterator;

public class Clinic implements Iterable<Pet> {
    private String name;
    private Pet[] pets;

    /*public Clinic(String name, int rooms) {
        this.name = name;
        this.rooms = rooms;
        this.pets = new Pet[rooms];
    }*/
    public Clinic(int numberOfRooms){
        this.setPets(numberOfRooms);

    }

    private void setPets(int numberOfRooms){
        if (numberOfRooms % 2 ==0){
            throw new IllegalArgumentException("Rooms must be odd!");
        }
        this.pets = new Pet[numberOfRooms];
    }

    public Pet[] getPets() {
        return pets;
    }

    public boolean hasEmptyRooms() {
        for (Pet pet : this.pets) {
            if (pet == null) {
                return true;
            }
        }
        return false;

    }


    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    public void print(int room) {
        if (pets[room - 1] == null) {
            System.out.println("Room empty");
        } else {
            System.out.println(pets[room -1].getName() + " " + pets[room -1].getAge() + " " + pets[room -1].getKind());
        }
    }

    public void print() {
        for (Pet pet : pets) {
            if (pet == null) {
                System.out.println("Room empty");
            } else {
                System.out.println(pet.getName() + " " + pet.getAge() + " " + pet.getKind());
            }
        }

    }

    public boolean add(Pet pet) {
        int centre = this.pets.length / 2;
        int leftIndex = centre - 1;
        int rightIndex = centre + 1;

        if (pets[centre] == null) {
            pets[centre] = pet;
            return true;
        } else {
            while (true) {
                if (leftIndex <0 && rightIndex == pets.length){
                    return false;
                }
                if (pets[leftIndex--] == null) {
                    pets[leftIndex+1] = pet;
                    return true;
                } else if (pets[rightIndex++] == null) {
                    pets[rightIndex-1] = pet;
                    return true;
                }
            }
        }
    }
    public boolean release(){
        int centre = pets.length / 2;

        if (pets[centre] != null){
            pets[centre] = null;
            return true;
        } else {
            int index = centre;
            while (index < pets.length){
                if (pets[index++] != null){
                    pets[index-1] = null;

                    return true;
                }
            }
            index = 0;
            while (index < centre){
                if (pets[index++] != null){
                    pets[index - 1] = null;

                    return true;
                }
            }

            return false;
        }
    }
}
