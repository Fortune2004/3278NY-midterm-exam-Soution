package datastructure;


import java.util.*;

public class UseMap {

	public static void main(String[] args) {


		List<String>IndiaCity=new ArrayList<String>();
		IndiaCity.add("Calcutta");
		IndiaCity.add("Delhi");
		IndiaCity.add("Mumbai");
		IndiaCity.add("Gujrat");



		List<String>CanadaCity=new ArrayList<String>();
		CanadaCity.add("Toronto");
		CanadaCity.add("Calgari");
		CanadaCity.add("Ottawa");
		CanadaCity.add("Vancouver");


		List<String>JapanCity=new ArrayList<>();
		JapanCity.add("Tokyo");
		JapanCity.add("Osaka");
		JapanCity.add("Kyoto");
		JapanCity.add("Yokohama");


		Map<String,List<String>> listOfCities= new HashMap<String, List<String>>();
		listOfCities.put("Cities of India",IndiaCity);
		listOfCities.put("Cities of Canada",CanadaCity);
		listOfCities.put("Cities of Japan",JapanCity);


		Iterator it = listOfCities.entrySet().iterator();


		while (it.hasNext()){
			System.out.println(it.next());
		}


		for(Map.Entry<String,List<String>> infoListCity: listOfCities.entrySet()){
			System.out.println("Different cities of 3 countries :"+infoListCity.getKey()+": "+infoListCity.getValue());
		}

	}





		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

	}


