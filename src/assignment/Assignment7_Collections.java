package assignment;

    import java.util.*;

	public class Assignment7_Collections {
		
	    public static void main(String[] args) {
	    	
	       //Countries
	        List<String> Countries = new ArrayList<String>();
	        Countries.add("India");
	        Countries.add("China");
	        Countries.add("United States");
	        Countries.add("Indonesia");
	        Countries.add("Canada");
	        System.out.println("2nd Most Populated Country: " + Countries.get(1));

	        //touristAttractions
	        
	        Set<String> touristAttractions = new HashSet<String>();
	        touristAttractions.add("Eiffel Tower");
	        touristAttractions.add("Great Wall of China");
	        touristAttractions.add("Statue of Liberty");
	        touristAttractions.add("Machu Picchu");
	        touristAttractions.add("Colosseum");
	        touristAttractions.add("Taj Mahal");
	        touristAttractions.add("Disneyland");
	        touristAttractions.add("Grand Canyon");
	        touristAttractions.add("Niagara Falls");
	        touristAttractions.add("Burj Khalifa");
	  System.out.println("Number of Tourist Attractions: " + touristAttractions.size());

	  // 5 largest cities in the United States and their populations
	    
	        Map<String, Integer> largestCities = new HashMap<>();
	        largestCities.put("New York", 8419600);
	        largestCities.put("Los Angeles", 3980400);
	        largestCities.put("Chicago", 2716000);
	        largestCities.put("Houston", 2328000);
	        largestCities.put("Phoenix", 1690000);

	        System.out.println("Largest Cities in the US and Their Populations:");
	        Set<String> cities = largestCities.keySet();
	        for (String city : cities) {
	            System.out.println(city+ ": " + largestCities.get(city));
	        }

	     //10random integers and printing 2nd n 5th value
	        int[] randomIntegers = {10,35,34,23,11,34,55,21,5,7};
	        int sum = randomIntegers[2] + randomIntegers[4];
	        System.out.println("Sum of 3rd and 5th Values: " + sum);

	        // 5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie
	        List<String> highestGrossingMovies = new ArrayList<>();
	        highestGrossingMovies.add("Avatar");
	        highestGrossingMovies.add("Avengers: Endgame");
	        highestGrossingMovies.add("Titanic");
	        highestGrossingMovies.add("Star Wars: The Force Awakens");
	        highestGrossingMovies.add("Avengers: Infinity War");
	        System.out.println("3rd Highest-Grossing Movie: " + highestGrossingMovies.get(2));
	    }
	}


