package com.dsa.LeetCode;
import java.util.LinkedHashMap;
import java.util.Map;

class LRU_Cache_Amazon
{
    Map<Integer, Integer> map = null;
    int capacity = 0;

    LRU_Cache_Amazon(int capacity)
    {
        map = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true)
        {
            protected boolean removeEldestEntry(Map.Entry eldest)
            {
                return size() > capacity;
            }
        };
    }

    int get(int key)
    {
        return map.getOrDefault(key, -1);
    }

    void put(int key, int value)
    {
        map.put(key, value);
    }

    void printMap()
    {
        System.out.println(map);
    }

    public static void main(String[] args)
    {
        LRU_Cache_Amazon lru = new LRU_Cache_Amazon(2);
        lru.put(1, 10);
        lru.put(2, 20);
        System.out.println(lru.get(2));
        lru.printMap();
        lru.put(3, 30);
        lru.printMap();
    }
}
