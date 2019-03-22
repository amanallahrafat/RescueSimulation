package model.units;

import model.disasters.GasLeak;
import model.infrastructure.ResidentialBuilding;
import simulation.Address;

public class GasControlUnit extends FireUnit{

//variables.	
//setters/getters.
					
//constructor(s):
	
	public GasControlUnit(String id, Address location, int stepsPerCycle){
		super(id, location, stepsPerCycle);
	}
	
	public void treat() {
		ResidentialBuilding X=(ResidentialBuilding)(this.getTarget());
		
		if(X.getDisaster() instanceof GasLeak)
			X.getDisaster().setActive(false);
		
		X.setGasLevel(X.getGasLevel()-10);
		
		if(X.getGasLevel() <= 0) {
			this.setLocation(new Address(0, 0));
			this.setState(UnitState.IDLE);
		}
		
		jobsDone();
	}
	
	public void jobsDone() {
		ResidentialBuilding X = (ResidentialBuilding) this.getTarget();
		
		if((X.getGasLevel() <= 0) || X.getStructuralIntegrity() <= 0) {
			this.setState(UnitState.IDLE);
		}
		
		
	}

}
