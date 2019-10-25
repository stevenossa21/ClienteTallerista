package control;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import interfaces.IPregunta;
import persistence.Pregunta;

public class PreguntaControl {
	private Pregunta u=null;;
	private IPregunta ir=null;
	private List <Pregunta> lt;
	public PreguntaControl() throws RemoteException, NotBoundException{
		Registry r = LocateRegistry.getRegistry(10000);
		ir= (IPregunta) r.lookup("Pregunta");
     }
	
	public Pregunta searchPregunta(int id){
		try{
			u=ir.searchPregunta(id);
		}
		catch(RemoteException e){
			e.printStackTrace();
			u=null;
		}
		return u;
	}
	
	public List <Pregunta> searchPregunta(){
		try{
			lt=ir.searchPregunta();
		}
		catch(RemoteException e){
			e.printStackTrace();
			lt=null;
		}
		return lt;
	}
	
	public boolean updatePregunta(int id,String pregunta,int valor){
		boolean update=true;
		try{
			if(!ir.updatePregunta(id, pregunta, valor))
				update=false;
		}
		catch(RemoteException e){
			e.printStackTrace();
			update=false;
		}
		return update;
	}
	public boolean delPregunta(int id){
		boolean del=true;
		try{
			if(!ir.delPregunta(id))
				del=false;
		}
		catch(RemoteException e){
			e.printStackTrace();
			del=false;
		}
		return del;
	}
	public boolean addPregunta(String strpregunta, int valor){
		boolean add=true;
		try{
			if(!ir.addPregunta(strpregunta,valor))
				add=false;
		}
		catch(RemoteException e){
			e.printStackTrace();
			add=false;
		}
		return add;
	}

}
