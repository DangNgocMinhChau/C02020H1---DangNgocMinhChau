package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceImpl {
    private static Map<Integer,Dictionary> dictionaries = new HashMap<>();

    static {
        dictionaries.put(1, new Dictionary("hello", "xin chào"));
        dictionaries.put(2, new Dictionary("dog", "con chó"));
        dictionaries.put(3, new Dictionary("cat", "con mèo"));
        dictionaries.put(4, new Dictionary("key", "khóa"));
        dictionaries.put(5, new Dictionary("goodbye", "tam biệt"));
        dictionaries.put(6, new Dictionary("mouse", "con chuot"));
        dictionaries.put(7, new Dictionary("character", "tinh cach"));
        dictionaries.put(8, new Dictionary("spring", "mùa xuân"));
        dictionaries.put(9, new Dictionary("you", "bạn"));
    }

    public List<Dictionary> findAll(){
        return new ArrayList<>(dictionaries.values());
    }
}
