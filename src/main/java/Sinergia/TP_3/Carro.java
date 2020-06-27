package Sinergia.TP_3;

import java.util.ArrayList;

public class Carro {
	private ArrayList<Detalle> detalles = new ArrayList();
	private int idCarro;
	
	public Carro(int id) {
		idCarro = id;
	}
	public Carro(int id, ArrayList detallitos) {
		idCarro = id;
		detalles = detallitos;
	}
	
	public void addDetalle (Detalle detalle) {
		detalles.add(detalle);
	}

	public ArrayList<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(ArrayList<Detalle> detalles) {
		this.detalles = detalles;
	}

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}
	
	public static boolean cantMinCarro(Carro carrito) {
		return carrito.getDetalles().size() < 1 ? false : true;
	}
	
}
