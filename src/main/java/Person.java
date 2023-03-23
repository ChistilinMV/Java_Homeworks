import java.util.Objects;

public class Person {
        static {
                idCount = 1;
        }
        private static int idCount;
        int idPers;
        String name;
        String surname;
        int age;
        char gender;
        String occupation;
        {
                idPers = idCount;
                idCount++;
        }

        public Person(String name, String surname, int age, char gender, String occupation) {
                this.name = name;
                this.surname = surname;
                this.age = age;
                this.gender = gender;
                this.occupation = occupation;
        }
        public int getId() {
                return idPers;
        }
        public String getName() {
                return name;
        }
        public String getSurname() {
                return surname;
        }
        public int getAge() {
                return age;
        }
        public char getGender() {
                return gender;
        }

        public String getOccupation() {
                return occupation;
        }
        @Override
        public String toString() {
                return "Person{" +
                        "id = '" + idPers + '\'' +
                        ", name = '" + name + '\'' +
                        ", surname = '" + surname + '\'' +
                        ", age = " + age +
                        ", gender = " + gender +
                        ", occupation = '" + occupation + '\'' +
                        '}';
        }
        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return idPers == person.idPers &&
                        age == person.age &&
                        gender == person.gender &&
                        Objects.equals(name, person.name) &&
                        Objects.equals(surname, person.surname) &&
                        Objects.equals(occupation, person.occupation);
        }
        @Override
        public int hashCode() {
                return Objects.hash(idPers, name, surname, age, gender, occupation);
        }

}
