package lab8bZad3;

import java.util.*;

public class Teams {
    public static void main(String[] args) {
        TreeMap<String , String> teams = new TreeMap<>();
        teams.put("San Francisco" , "Forty-nines");
        teams.put("Chicago" , "Bears");
        teams.put("Denver" , "Broncos");
        teams.put("Seattle" , "Seanhawks");
        teams.put("Miami" , "Dolphins");
        teams.put("Detroit" , "Lions");

        // Output the size of the map and the name of the team in Chicago
        System.out.println("size: " + teams.size());
        System.out.println("Team from Chicago : " + teams.get("Chicago") );

        // Change the name of the San Francisco team to "Niners"
        teams.put("San Francisco " , "Niners");
        System.out.println(teams.toString());

        //Output whether San Diego has e team in the map.
        System.out.printf("San Diego %s a team\n" ,
                teams.containsKey("San Diego") ? " has " : "doesn't have a team");

        // Remove Denver from the map
        teams.remove("Denver");

        // Insert the Dallas Cowboys in the map
        teams.put("Dallas" , "Cowboys");

        List<String> citiesMZ = new ArrayList<>();
        for( Map.Entry<String , String> entry : teams.entrySet() ){
            if(entry.getKey().matches("^[M-Z].*$")){
                System.out.printf("%-15s %-15s\n" ,
                        entry.getKey() , entry.getValue());
                citiesMZ.add(entry.getKey());
            }
        }

        for(int i = 0 ; i < citiesMZ.size() ; i++){
            teams.remove(citiesMZ.get(i));
        }
        System.out.println(teams.toString());

        Map<String , String >teamsDescending = sortByValue(teams);
        System.out.println(teamsDescending);
    }

    public static <K , V extends Comparable<? super V >> Map<K , V>
            sortByValue(Map<K , V> map){
        List<Map.Entry<K , V>> list = new ArrayList<>(map.entrySet());
        // ascending order
        Collections.sort(list , Map.Entry.comparingByValue());

        // descending order
        Collections.reverse(list);
        Map<K , V> result = new LinkedHashMap<>();
        for(Map.Entry<K , V> entry : list){
            result.put(entry.getKey() , entry.getValue());
        }

        return result;
    }
}
