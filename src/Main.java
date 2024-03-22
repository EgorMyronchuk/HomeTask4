import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public class Pet {
       private String species;
       private String nickname;
       private int age;
       private int trickLevel;
       private String[] habits;

       public void eat () {
           System.out.println("Я ї'м!");
       }
       public void respond () {
           System.out.printf("Привіт, хазяїн. Я - %s. Я скучив!\n" , nickname);
       }
        public void foul () {
            System.out.println("Потрібно добре замести сліди...");
        }
        public String toString(Pet pet) {
            return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}"
                                , species, nickname, age, trickLevel, Arrays.toString(habits));
            //dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}
        }
    }
    public class Human {
        private String name ;
        private String surname ;
        private int year ;
        private int iq ;
        private Pet pet ;
        private Human mother ;
        private Human father ;
        private String[][] schedule ;
        public void greetPet (){
            System.out.printf("Привіт, %s \n" , pet.nickname);
        }
        public void describePet (){
            if (pet.trickLevel > 50) {
                System.out.printf("У мене є %s, їй %d років, він дуже хитрий", pet.species, pet.age);
            } else {
                System.out.printf("У мене є %s, їй %d років, він майже не хитрий", pet.species, pet.age);
            }
        }
        public String toString(Human human) {
            return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, mother=%s %s, father=%s %s,}"
                                             , name ,  surname   ,  year  ,   iq  , mother.name , mother.surname ,  father.name , father.surname   );
            //Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone,
        }


    }

}