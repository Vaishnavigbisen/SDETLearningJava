package Java_Collection;
import java.sql.Array;
import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        //Create an ArrayList
        ArrayList<String> cars = new ArrayList<String>();

        //Add Elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //insert at specific position
        cars.add(2, "Audi");

        //Access an Element
        //System.out.println(cars.get(1));

        //Change an Element
        cars.set(0,"Opel");

        //Remove an Element
        //cars.remove(0);
        //System.out.println(cars);

        //To remove all the elements, we use clear() method.
        //cars.clear();

        //To find out how many elements an ArrayList have, use the size method.
        //System.out.println(cars.size());

        //Loop through an ArrayList
        for (int i=0; i<cars.size();i++){
            System.out.println(cars.get(i));
        }

        //Using for-each
//        for(String i: cars){
//            System.out.println(i);
//        }

        //The var Keyword
        //From Java 10, you can use the var keyword to declare an ArrayList variable without
        //writing the type twice.The compiler figures out the type from the value you assign
        //This makes code shorter, but many developers still use the full type for clarity. Since
        //var is valid Java, you may see it in other code, so its' good to know that it exists;

        //Without var
        //ArrayList<String> cars = new ArrayList<String>();

        //With var
        //var cars = new ArrayList<String>();



    }
}
