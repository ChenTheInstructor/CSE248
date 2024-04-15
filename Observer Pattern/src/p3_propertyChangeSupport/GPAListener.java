package p3_propertyChangeSupport;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;

public class GPAListener implements PropertyChangeListener, Serializable {
	private double studentGpa;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println(evt.getPropertyName());
		setStudentGpa((double)evt.getNewValue());
		System.out.println(studentGpa);
	}

	private void setStudentGpa(double gpa) {
		this.studentGpa = gpa;
	}
	
	public double getGpa() {
		return this.studentGpa;
	}
	
	
}
