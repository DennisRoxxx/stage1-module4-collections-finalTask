package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
       List<String> list = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                list.add(entry.getKey());
            }
        }
        list.sort((
            (o1, o2) -> {
            int length_1 = o1.length();
            int lenhth_2 = o2.length();
            if (length_1 == lenhth_2) {
                return o2.compareTo(o1);
            }
            return length_1 < lenhth_2 ? 1 : -1;
        }
        ));

        return list;
    }
}
