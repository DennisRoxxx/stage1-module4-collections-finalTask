package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String string : sourceMap.keySet()) {
            if (!map.containsKey(string.length())){
                Set<String> tempString = new HashSet<>();
                tempString.add(string);
                map.put(string.length(),tempString);
            }else {
                map.get(string.length()).add(string);
                map.put(string.length(), map.get(string.length()));
            }
        }

        return map;
    }
}
