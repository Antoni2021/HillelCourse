/**
 * interface describes cache behavior
 *
 * @author Anton Bondarenko
 * @version 1.0
 */

public interface Cache {

    boolean put(String cache, String key, Object o);
    Object get (String cache, String key);
    void clear();
    void clear(String cache);
}

