package Abstract.AbstractPerson.entities;

public abstract class Person {
        private String name;
        private double anualRent;

        public Person() {
        }

        public Person(String name, double anualRent) {
            this.name = name;
            this.anualRent = anualRent;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAnualRent() {
            return anualRent;
        }

        public void setAnualRent(double anualRent) {
            this.anualRent = anualRent;
        }

        public abstract double tax(); 
}
