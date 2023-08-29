import java.util.*;
import java.io.File;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import java.io.IOException;


public class App {

    static ArrayList<String> countLines(String fileName) {
        ArrayList<String> list = new ArrayList<>();

        try {
            File f = new File(fileName);
            Scanner reader = new Scanner(f);

            while (reader.hasNextLine()) {
                list.add(reader.nextLine());                   //read words/urls from file and put in a list
            }
            reader.close();
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return list;                            //return the list with counted lines
    }


    static LinkedHashMap<String, Integer> sortMap(HashMap<String, Integer> map) {

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());           //make list of keys of hashmap
    
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, 
                        Map.Entry<String, Integer> o2) {                                //sort the list of keys
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
    
        LinkedHashMap<String, Integer> newMap = new LinkedHashMap<>();        //linkedhashmap is ordered by index unlike normal hashmap
        for (Map.Entry<String, Integer> ele : list) {
            newMap.put(ele.getKey(), ele.getValue());                      //create new hashmap sorted by the keys
        }       
        return newMap;
    }


    static int countWords(String content, String word) {
        String[] words = content.split(" ");                 //count each word in the page content
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        ArrayList<String> words = countLines("words.txt");
        ArrayList<String> urls = countLines("urls.txt");

        try {
            for (String url : urls) {                       //count occurence of each word for each url
                System.out.println(url);

                HashMap<String, Integer> occurences = new HashMap<>();

                Connection conn = Jsoup.connect(url);
                Document doc = conn.get();
                String content = doc.text();                    //parse the web page and convert its content to string using jsoup

                for (String word : words) {
                    int count = countWords(content, word);
                    occurences.put(word, count);                    //count occurence of each word and put in hashmap
                }

                LinkedHashMap<String, Integer> newOccurences = sortMap(occurences);             //sort the hashmap by values
                List<String> keyList = new ArrayList<>(newOccurences.keySet());

                for (int i = words.size()-1; i > 0; i--) {
                    String key = keyList.get(i);
                    System.out.println(key + ": " + newOccurences.get(key));                   //print occurrence in descending order
                }

                System.out.println();
            }
        } catch (IOException exc) {
            System.out.println("an error occurred while connecting to the page");
        }    
    }
}
