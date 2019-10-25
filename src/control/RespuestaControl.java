package control;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import interfaces.IRespuesta;
import persistence.PreguntaRespuesta;
import persistence.Respuesta;

public class RespuestaControl {
	private Respuesta u=null;;
	private IRespuesta ir=null;
	private List <PreguntaRespuesta> lt;
	public RespuestaControl() throws RemoteException, NotBoundException{
		Registry r = LocateRegistry.getRegistry(10000);
		ir= (IRespuesta) r.lookup("Respuesta");
     }
	
	public Respuesta searchRespuesta(int id){
		try{
			u=ir.searchRespuesta(id);
		}
		catch(RemoteException e){
			e.printStackTrace();
			u=null;
		}
		return u;
	}
	
	public List <PreguntaRespuesta> searchRespuesta(){
		try{
			lt=ir.searchRespuesta();
		}
		catch(RemoteException e){
			e.printStackTrace();
			lt=null;
		}
		return lt;
	}
	
	public boolean updateRespuesta(int id, int id_pregunta, String respuesta, int correct){
		boolean update=true;
		try{
			if(!ir.updateRespuesta(id, id_pregunta, respuesta, correct))
				update=false;
		}
		catch(RemoteException e){
			e.printStackTrace();
			update=false;
		}
		return update;
	}
	public boolean delRespuesta(int id){
		boolean del=true;
		try{
			if(!ir.delRespuesta(id))
				del=false;
		}
		catch(RemoteException e){
			e.printStackTrace();
			del=false;
		}
		return del;
	}
	public boolean addRespuesta(int id_pregunta, String respuesta, int correct){
		boolean add=true;
		try{
			if(!ir.addRespuesta(id_pregunta,respuesta,correct))
				add=false;
		}
		catch(RemoteException e){
			e.printStackTrace();
			add=false;
		}
		return add;
	}
}
