package fr.formation.inti.dao;

import java.util.List;

import java.io.Serializable;;

public interface IGenericDao<T, I extends Serializable> {

	
	public List<T> getAll();
	
	public void persist(T e);
	
	public I save(T e);
	
	public void update(T e);
	
	public void delete(T e);
	
	public void deleteByID(I id);
	
	public T findById(I id);
	
	public void close();
}
