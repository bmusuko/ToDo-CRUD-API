package org.bmusuko.ToDo.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import org.bmusuko.ToDo.model.ToDo;
import org.bmusuko.ToDo.dao.ToDoDAO;

@Path("/ToDos")
public class ToDoService {
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<ToDo> getToDo_JSON(){
		List<ToDo> listOfToDo = ToDoDAO.getAllToDos();
		return listOfToDo;
	}
	
	@GET
	@Path("/{toDoID}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public ToDo getToDo(@PathParam("toDoID") String toDoID) {
        return ToDoDAO.getToDo(toDoID);
    }
	
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public ToDo addToDo(ToDo T) {
        return ToDoDAO.addToDo(T);
    }
    
    @PUT
    @Path("/{toDoID}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public ToDo updateToDo(@PathParam("toDoID") String toDoID,ToDo T) {
        return ToDoDAO.updateToDo(toDoID,T);
    }
    
    @DELETE
    @Path("/{toDoID}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteToDo(@PathParam("toDoID") String toDoID) {
        ToDoDAO.deleteToDo(toDoID);
    }
}
