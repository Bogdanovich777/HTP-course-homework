package by.htp.runner;

import by.htp.renteq.*;

public class Main {

	public static void main(String[] args) {
		
		Kit bycicle = new Kit(Category.SUMMER, "Велосипед", Statusofequip.AVAILABLE, 1500 );
		Kit rollerskates = new Kit(Category.SUMMER, "Ролики", Statusofequip.UNAVAILABLE, 300 );
		Kit skiing = new Kit(Category.WINTER, "Лыжи", Statusofequip.AVAILABLE, 400 );
		Kit skates = new Kit(Category.WINTER, "Коньки", Statusofequip.AVAILABLE, 300 );
		Kit running_sneakers = new Kit(Category.SUMMER, "Беговые кроссовки", Statusofequip.UNAVAILABLE, 200 );
		Kit snowboard = new Kit(Category.WINTER, "Сноуборд", Statusofequip.BROKEN, 600 );
		Kit skateboard = new Kit(Category.SUMMER, "Скейт", Statusofequip.UNAVAILABLE, 550 );
		Kit scooter = new Kit(Category.SUMMER, "Самокат", Statusofequip.AVAILABLE, 500 );
		Kit parachute = new Kit(Category.ALLSEASON, "Парашют", Statusofequip.AVAILABLE, 800 );
		Kit suit_wings = new Kit(Category.ALLSEASON, "Костюм-крыло", Statusofequip.AVAILABLE, 650 );

		
		
		Storage storage = new Storage(10);
		storage.addEquipment(bycicle);
		storage.addEquipment(rollerskates);
		storage.addEquipment(skiing);
		storage.addEquipment(running_sneakers);
		storage.addEquipment(skates);
		storage.addEquipment(snowboard);
		storage.addEquipment(skateboard);
		storage.addEquipment(scooter);
		storage.addEquipment(parachute);
		storage.addEquipment(suit_wings);
		
		
		
		System.out.println(storage.getAvailableEquipmentCount());
		System.out.println();
	}

}
