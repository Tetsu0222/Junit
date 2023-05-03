package entity;

public class EnemyCharacter extends BattleCharacter{
	
	
	private String name;
	private Integer hp;
	private Integer atk;
	private String type;
	private Integer Key;
	
	public EnemyCharacter( String name , Integer hp , Integer atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.type = "playable";
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAtk() {
		return atk;
	}

	public void setAtk(Integer atk) {
		this.atk = atk;
	}
	
	public String getType() {
		return type;
	}


	public Integer getKey() {
		return Key;
	}


	public void setKey(Integer key) {
		Key = key;
	}

}
