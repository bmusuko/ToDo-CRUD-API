package org.bmusuko.ToDo.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "toDo")
@XmlAccessorType(XmlAccessType.FIELD)


public class ToDo {
	private String toDoID;
	private String deadline;
	private boolean finished;
	private String description;
	
	public ToDo(){
		// do nothing
	}
	public ToDo(String id,String deadline,String description) {
		this.toDoID = id;
		this.deadline = deadline;
		this.finished = false;
		this.description = description;
	}
	
	public String getDeadline() {
		return deadline;
	}
	public String getToDoID() {
		return toDoID;
	}
	public void setID(String id) {
		this.toDoID = id;
	}
	public boolean getFinished() {
		return finished;
	}
	public String getDescription() {
		return description;
	}
	
	public void setToDoID(String id) {
		this.toDoID = id;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
