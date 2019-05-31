
public class Tank extends Heroes{
	
	public Tank(String Name, int AttackDamage, int Defense, int HitChance) {
		super(Name,"Tank",AttackDamage,Defense,0, HitChance);
	}
	
	
	public String UniqueAbility() {
		this.Defense = Defense+20;
		
		
		return "I am hardening... My defense is now " + this.Defense;
	}

	
	
	public String toString() {
		return "Name: " + this.Name + "\nHero Type: " + this.HeroType + "\nExp: " + this.Exp + "\nLevel: " + this.Level + "\nAttackDamage: " + this.AttackDamage + "\nDefense: " + this.Defense + "\nHealth: " + this.Health + "\nMagic Damage: " + this.MagicDamage + "\nHit Chance: " + this.HitChance;
	}
}
