package model.disasters;

import exceptions.BuildingAlreadyCollapsedException;
import exceptions.DisasterException;
import simulation.Rescuable;
import simulation.Simulatable;

	public abstract class Disaster  implements Simulatable{
		
	//variables
	private int startCycle;
	private boolean active = false;
	private Rescuable target;
	
	//constructors
	public Disaster(int startCycle, Rescuable target) {
		this.startCycle=startCycle;
		this.target=target;
	}
	public Disaster() {}
	
	//getters and setters
	public  int getStartCycle() {
		return startCycle;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Rescuable getTarget() {
		return target;
	}
	
	//methods

	public void strike() throws DisasterException { active=true; }
	
	abstract public void cycleStep() throws DisasterException;
}
