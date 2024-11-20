package p2_modern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StudentListener implements PropertyChangeListener {
	private Record record;
	
	public Record getRecord() {
		return record;
	}
	
	public void setRecord(Record record) {
		this.record = record;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println(evt.getPropertyName());
		this.setRecord((Record)evt.getNewValue());
	}

}
