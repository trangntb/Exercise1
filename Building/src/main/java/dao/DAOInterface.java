package dao;

import java.util.List;

public interface DAOInterface<T> {
	public List<T> selectBy(T o);
}
