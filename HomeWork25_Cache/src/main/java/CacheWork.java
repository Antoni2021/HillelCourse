import java.util.HashMap;
import java.util.Map;

/**
 * Class created as custom realization of cache.
 *
 * @author Anton Bondarenko
 * @version 1.0
 */
public class CacheWork implements Cache{

    /**
     * the cacheMap - the main object we work in program
     */
    private Map<String, Map<String, Object>> cacheMap;

    /**
     * constructor for initialization cacheMap
     */
    public CacheWork() {
        this.cacheMap = new HashMap<>();
    }

    /**
     * put some information to the cache.
     * @param cache - name of cache;
     * @param key - the key for object we cache;
     * @param o - the object we want to add to the cache
     */
    @Override
    public boolean put(String cache, String key, Object o) {
        Map<String, Object> timeMap;
        if (!cacheMap.containsKey(cache)){
            timeMap = new HashMap<>();
            timeMap.put(key, o);
            cacheMap.put(cache, timeMap);
            Log.loggerInfo.info("Create cash with name " + cache);
        } else if (cacheMap.containsKey(cache) && cacheMap.get(cache).containsKey(key)){
            if (cacheMap.get(cache).get(key).equals(o)){
                Log.loggerInfo.info("This object has already in that cache");
                return false;
            }
            timeMap = cacheMap.get(cache);
            timeMap.put(key, o);
            cacheMap.put(cache, timeMap);
            Log.loggerInfo.warn("There is already such a cache, rewrite the cash with that key");
        } else {
            timeMap = cacheMap.get(cache);
            timeMap.put(key, o);
            cacheMap.put(cache, timeMap);
            Log.loggerInfo.info("There is already such a cache, add new key");
        }
        Log.loggerInfo.info("Object " + o + " put to cache");
        return cacheMap.containsKey(cache) && cacheMap.get(cache).equals(timeMap);
    }


    /**
     * get information from the chosen cache with chosen key
     * */
    @Override
    public Object get(String cache, String key) {
        if (cacheMap.containsKey(cache) && cacheMap.get(cache) != null) {
            Map<String, Object> tempMap;
            tempMap = cacheMap.get(cache);
            if (tempMap.containsKey(key)){
                Log.loggerInfo.info("return to User the object, from " + cache + " , with key " + key);
                return tempMap.get(key);
            } else {
                Log.loggerInfo.warn("there is no that key in this cash");
            }
        } else {
            Log.loggerInfo.info("there is no that cash");
        }
        return null;
    }

    /**
     * full cleaning of cache
     */
    @Override
    public void clear() {
        if (cacheMap.size() == 0) {
            Log.loggerInfo.warn("The cache has already cleared");
            Log.loggerWarn.warn("Call clear method with cleared cache");
        } else {
            cacheMap = new HashMap<>();
            Log.loggerInfo.info("The cache cleared");
        }
    }

    /**
     * clear chosen cache
     * @param cache - the name of cache for cleaning
     * */
    @Override
    public void clear(String cache) {
        if (cacheMap.size() == 0){
            Log.loggerInfo.info("There is nothing to clear, the cache is empty");
        } else if (cacheMap.containsKey(cache)){
            Log.loggerInfo.info("Remove cache with name " + cache);
            cacheMap.remove(cache);
        } else {
            Log.loggerWarn.warn("There is no cache named " + cache);
        }
    }

    /**
     * return the number of elements in cache
     * */
    public int getSize(){
        int size = cacheMap.size();
        Log.loggerInfo.info("The size of cache is " + size);
        return size;
    }
}
