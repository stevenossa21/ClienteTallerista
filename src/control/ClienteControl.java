package control;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import interfaces.ITallerista;
import persistence.Tallerista;

public class ClienteControl {
	private Tallerista u=null;;
	private ITallerista ir=null;
	private List <Tallerista> lt;
	public ClienteControl() throws RemoteException, NotBoundException{
		Registry r = LocateRegistry.getRegistry(10000);
		ir= (ITallerista) r.lookup("Tallerista");
		
        }
	
	public Tallerista searchTallerista(int id){
		try{
			u=ir.searchTallerista(id);
		}
		catch(RemoteException e){
			e.printStackTrace();
			u=null;
		}
		return u;
	}
	
	public List <Tallerista> searchTallerista(){
		try{
			lt=ir.searchTallerista();
		}
		catch(RemoteException e){
			e.printStackTrace();
			lt=null;
		}
		return lt;
	}
	
	public boolean updateTallerista(int id,String name, String last_name,String email,int edad){
		boolean update=true;
		try{
			if(!ir.updateTallerista(id, name, last_name,email,edad))
				update=false;
		}
		catch(RemoteException e){
			e.printStackTrace();
			update=false;
		}
		return update;
	}
	public boolean delTallerista(int id){
		boolean del=true;
		try{
			if(!ir.delTallerista(id))
				del=false;
		}
		catch(RemoteException e){
			e.printStackTrace();
			del=false;
		}
		return del;
	}
	public boolean addTallerista(String name, String last_name,String email,int edad){
		boolean add=true;
		try{
			if(!ir.addTallerista(name,last_name,email,edad))
				add=false;
		}
		catch(RemoteException e){
			e.printStackTrace();
			add=false;
		}
		return add;
	}


}
