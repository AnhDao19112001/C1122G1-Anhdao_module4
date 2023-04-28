package com.example.bai_2.service;
import com.example.bai_2.model.Dictionary;

import java.util.*;

public class DictionaryService {

    private static Map<Integer, Dictionary> dictionaryServiceMap = new HashMap<>();
    static {
        dictionaryServiceMap.put(1, new Dictionary("Chicken","Con gà"));
        dictionaryServiceMap.put(2, new Dictionary("Industrial chickens","Con gà công nghiệp"));
        dictionaryServiceMap.put(3, new Dictionary("Apple","Qủa táo"));
        dictionaryServiceMap.put(4, new Dictionary("Monster","Quái vật"));
        dictionaryServiceMap.put(5, new Dictionary("Hi guys","Chào các bạn"));
    }
    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaryServiceMap.values());
    }
}
