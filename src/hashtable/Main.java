package hashtable;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        
        Hashtable<Integer, String> table = new Hashtable<>(10);
        
        
        table.put(2021200044, "Dusan Savic");
        table.put(2021203189, "Adam Tanaskovic");
        table.put(2021024381, "Uros Kupresan");
        table.put(2021004578, "Milos Savic");
        table.put(2021331245, "Andjela Jovanovic");
        table.put(2021113456, "Milan Brankovic");
        
        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        } 
    }
    
}