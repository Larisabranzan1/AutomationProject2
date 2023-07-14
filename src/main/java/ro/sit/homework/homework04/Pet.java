package ro.sit.homework.homework04;

public class Pet {

    private int petAge;
    private String petBreed;
    private String petSex;
    private String petName;

    public Pet(int petAge, String breed, String sex, String petName) {
            this.petAge = petAge;
            this.petBreed = breed;
            this.petSex = sex;
            this.petName = petName;
        }

        public String getPetName() {
            return petName;
        }

        public String getPetBreed() {
            return petBreed;
        }

        public String getPetSex() {
            return petSex;
        }

        public int getPetAge() {
            return petAge;
        }

        @Override
        public String toString() {
            return petSex + " pet with name '" + petName + '\'' +
                    " with breed '" + petBreed + '\'' +
                    " that is " + petAge + " year(s) old.";
        }
    }
