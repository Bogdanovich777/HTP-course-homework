package by.htp.renteq;

public class Storage {

	
	private Equipment[] equipments = new Equipment[10];
	private int equipmentCount = 0;
	
	public RentedUnits[] units = new RentedUnits[10];
	
	public Storage(int number){
		this.equipments = new Equipment[number];
		
	}
	
	public void addEquipment(Equipment equipment) {
		equipments[this.equipmentCount] = equipment;
		equipmentCount++;
	}
	
	public int getRentId() {
		int id = 0;
		for (int i = 0; i<units.length; i++){
			if (units[i] == null) {
				id = i;
			}
			break;
		}
		return id;
	}
	
	public int getAvailableEquipmentCount() { 
		int count = 0;
		for (int i = 0; i < equipments.length; i++) {
			if (equipments[i].getStatus().equals(Statusofequip.AVAILABLE)) {
				count++;
			}
		}
		return count;
	}
	
	
}

