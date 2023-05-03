package entity;

public abstract class BattleCharacter {
	
	public abstract String getName();

	public abstract void setName(String name);

	public abstract Integer getHp();

	public abstract void setHp(Integer hp);

	public abstract Integer getAtk();

	public abstract void setAtk(Integer atk);
	
	public abstract String getType();
	
	public abstract void setKey( Integer turnNumber );
	
	public abstract Integer getKey();

}
