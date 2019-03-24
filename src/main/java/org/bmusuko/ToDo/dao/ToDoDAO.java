package org.bmusuko.ToDo.dao;


import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.bmusuko.ToDo.model.ToDo;

public class ToDoDAO {

	private static Map<String,ToDo> ToDoMap = new HashMap<String,ToDo>();
	
	private static void init() { // memasukkan data ke dalam hashmap
		ToDo T1 = new ToDo("01","23/03/2019","Mengerjakan Take Home Test");
		ToDo T2 = new ToDo("02","24/03/2019","Mengerjakan Tugas Besar Basis Data");
		ToDo T3 = new ToDo("03","25/03/2019","Mengerjakan Tugas Besar Pemrograman Berbasis Object");
		ToDo T4 = new ToDo("04","26/03/2019","Mengerjakan Tugas Besar Sistem Operasi");
		
		ToDoMap.put(T1.getToDoID(),T1);
		ToDoMap.put(T2.getToDoID(),T2);
		ToDoMap.put(T3.getToDoID(),T3);
		ToDoMap.put(T4.getToDoID(),T4);
	}
	static {
		init();
	}
	
	
	public static ToDo getToDo(String toDoID) {
		return ToDoMap.get(toDoID);
	}
	
	public static ToDo addToDo(ToDo T) {
		ToDoMap.put(T.getToDoID(),T);
		return T;
	}
	public static ToDo updateToDo(String toDoID,ToDo T) {
		ToDoMap.remove(toDoID);
		ToDoMap.put(T.getToDoID(),T);
		return T;
	}
    public static void deleteToDo(String toDoID) {
        ToDoMap.remove(toDoID);
    }	
    public static List<ToDo> getAllToDos() {
        Collection<ToDo> collection = ToDoMap.values();
        List<ToDo> list = new ArrayList<ToDo>();
        list.addAll(collection);
        return list;
    }
}
	
