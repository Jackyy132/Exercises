import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.ArrayList;
public class Menu {
	static Scanner input = new Scanner(System.in);
	
	
	public static void MyMenu() {
		String UserChoice;
		String CreateHero = "C";
		String ViewHero = "V";
		String Exit = "E";
		
		do {
			System.out.println("Please select an option:");
			System.out.println(CreateHero + ") Create a hero");
			System.out.println(ViewHero   + ") View a hero");
			System.out.println(Exit       + ") Exit program");
			UserChoice = input.next().toUpperCase();
			
			if (UserChoice.equals("C")) {
				CreateHero();
			}
			
			
			
			}while(!UserChoice.equals("E"));	
		
		
		
		}
	
	public static void CreateHero() {
		ArrayList<Heroes> Heroes = new ArrayList<>();
		String Name;
		String HeroType;
		boolean LoopMore = true;
		boolean UniqueName = false;
		

		
		do {
			System.out.println("Please enter a name for your hero:");
			Name = input.next();
			for (int i = 1; i < Heroes.size(); i++) {
			if (!Name.toLowerCase().equals(Heroes.get(i).Name.toLowerCase())) {
				UniqueName = true;
			}
			else {
				System.out.println("Hey! '" + Name + "' has already been taken! Please choose another name...");
				UniqueName = false;
			}
		}
		}while(UniqueName == false);
		
		
		System.out.println("What kind of hero is '" + Name + "'?");
		System.out.println("Hero Types:");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Tank");
		//System.out.println("Fighter");
		//System.out.println("Healer");
		//System.out.println("Mage");
		System.out.println("----------------------------------------------------------------------");
		HeroType = input.next();
		while(LoopMore == true) {
			switch(HeroType.toLowerCase()) {
			case "tank":
				int RandomAttackDamage = RandomStat(HeroType);
				int RandomDefense = RandomStat(HeroType);
				int RandomHitChance = RandomStat(HeroType);
				Tank tank = new Tank(Name, RandomAttackDamage, RandomDefense, RandomHitChance);
				System.out.println("Creating your hero... Please wait...");
				Sleep();
				System.out.println("Your hero has been created successfully! \n" + tank);
				Heroes.add(tank);
				LoopMore = false;
				break;
			default: 
				System.out.println("Hey! I do not recognise '" + HeroType + "'? Please try again!");
				HeroType = input.next();
				break;
				}
			}
		}
	
	public static int RandomStat(String HeroType) {
		Random random = new Random();
		if (HeroType.equals("tank")) {
			return(random.nextInt(30)+20);	
		}
		
		
		return 0;
	}
	
	public static void Sleep() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			System.out.println("Nani?");
			e.printStackTrace();
		}
	}
	
	
	}
