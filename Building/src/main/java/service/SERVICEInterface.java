package service;

import java.util.List;

public interface SERVICEInterface<E,T> {
	
	public List<T> selectBy(E element);
}
