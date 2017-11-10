package by.htp.runner;

import by.htp.renteq.*;

public class Main {

	public static void main(String[] args) {
		
		Kit bycicle = new Kit(Category.SUMMER, "���������", Statusofequip.AVAILABLE, 1500 );
		Kit rollerskates = new Kit(Category.SUMMER, "������", Statusofequip.UNAVAILABLE, 300 );
		Kit skiing = new Kit(Category.WINTER, "����", Statusofequip.AVAILABLE, 400 );
		Kit skates = new Kit(Category.WINTER, "������", Statusofequip.AVAILABLE, 300 );
		Kit running_sneakers = new Kit(Category.SUMMER, "������� ���������", Statusofequip.UNAVAILABLE, 200 );
		Kit snowboard = new Kit(Category.WINTER, "��������", Statusofequip.BROKEN, 600 );
		Kit skateboard = new Kit(Category.SUMMER, "�����", Statusofequip.UNAVAILABLE, 550 );
		Kit scooter = new Kit(Category.SUMMER, "�������", Statusofequip.AVAILABLE, 500 );
		Kit parachute = new Kit(Category.ALLSEASON, "�������", Statusofequip.AVAILABLE, 800 );
		Kit suit_wings = new Kit(Category.ALLSEASON, "������-�����", Statusofequip.AVAILABLE, 650 );

		
		
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
