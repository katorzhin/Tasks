package TaskJSON;

import java.util.List;

public interface UserDao<T extends User> {
    List<T> getAll();

    T getById(long id);

    void add(T user);

    void delete(long id);
}
