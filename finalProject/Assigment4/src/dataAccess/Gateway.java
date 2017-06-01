package dataAccess;

import java.util.List;

import model.Entity;

public abstract class Gateway <TEntity extends Entity> {
	
	public abstract void add(TEntity entity);
	
	public abstract void update(TEntity entity);
	
	public abstract void delete(int id);
	
	public abstract List view();

}
