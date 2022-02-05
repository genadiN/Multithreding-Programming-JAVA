package lab8aZad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ArrayListTest {
    public static <E extends Comparable<E>> E max(E[][] list){
        if(list  == null || list.length == 0 || list[0].length == 0){
            return null;
        }
        E max = list [0][0];
        for(int i = 0 ; i < list.length ; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (max.compareTo(list[i][j]) < 0) {
                    max = list[i][j];
                }
            }
        }
       // Arrays.asList -> Collections

        return max;
    }

    public static <E> void shuffle(ArrayList<E> list){
        if(list == null){
            return ;
        }
        Collections.shuffle(list);
    }

    public static < E extends Comparable<E>> E max(ArrayList<E> list){
        if ( list == null) return null;
        return Collections.max(list);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        if(list == null){
            return null;
        }
        ArrayList<E> noDuplicates = new ArrayList<E>();
        for(int i = 0 ; i < list.size() ; i++){
            if(Collections.frequency(list , list.get(i)) == 1){
                noDuplicates.add(list.get(i));
            }
        }
        return noDuplicates;
    }

    // Set - no duplicates
    public static <E> ArrayList<E> onlyOnce(ArrayList<E> list){
        if(list == null){
            return null;
        }
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        Double[][] numbers = {
                {1.3 , 4.0 , 1.8} ,
                {0.4 , -1.2},
                {5.7 , 9.3 , 12.8 , 4.6}
        };
        System.out.printf("Max: %.1f\n" , max(numbers));

        ArrayList<Integer> toShuffle = new ArrayList<>();
        for(int i = 0 ; i < 31 ; i++){
            toShuffle.add(i);
        }
        shuffle(toShuffle);
        System.out.println("SHuffled list: " + toShuffle);

        //c
        System.out.println("Max in list: " + max(toShuffle));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add( new Car("model1" , 2000));
        cars.add( new Car("model1" , 1992));
        cars.add( new Car("model1" , 1997));
        cars.add( new Car("model1" , 2017));
        System.out.println("Max in cars: " + max(cars).toString());

        //d
        ArrayList<String> duplicates = new ArrayList<>();
        duplicates.add("str1");
        duplicates.add("str3");
        duplicates.add("str3");
        duplicates.add("str1");
        duplicates.add("str2");
        duplicates.add("str4");

        System.out.println("Removed duplicates: " + removeDuplicates(duplicates));
        System.out.println("Removed duplicates byOnce: " + onlyOnce(duplicates));
    }


}
