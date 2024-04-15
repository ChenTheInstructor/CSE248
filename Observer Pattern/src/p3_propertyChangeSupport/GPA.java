package p3_propertyChangeSupport;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class GPA implements Serializable {
	private double gpa;
	private PropertyChangeSupport support;

	public GPA(double gpa) {
		this.gpa = gpa;
		support = new PropertyChangeSupport(this);
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		double oldGpa = this.gpa;
		this.gpa = gpa;
		support.firePropertyChange("GPA Changed!", oldGpa, this.gpa);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}
	
	public void removePropertyListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}
}
