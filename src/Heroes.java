
public abstract class Heroes {
	String Name;
	String HeroType;
	int Exp;
	int Level;
	int AttackDamage;
	int Defense;
	int Health;
	int MagicDamage;
	int HitChance;
	abstract String UniqueAbility();
	
	public Heroes(String Name, String HeroType, int AttackDamage, int Defense, int MagicDamage, int HitChance) {
		this.Name = Name;
		this.HeroType = HeroType;
		this.Exp = 0;
		this.Level = 1;
		this.AttackDamage = AttackDamage;
		this.Defense = Defense;
		this.Health = 100;
		this.MagicDamage = MagicDamage;
		this.HitChance = HitChance;
	}
	
	public void LevelUp() {
		this.Level++;
	}
	
	
}
