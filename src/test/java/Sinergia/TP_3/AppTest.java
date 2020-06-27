package Sinergia.TP_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.*;

public class AppTest {
	
	Carro carrito = new Carro(1);
	Producto producto = new Producto("martillo", 2123, "el mas caro");
	Detalle detalle = new Detalle(producto, 2);
	
	@Test
	public void carritoConMasDe1ProductoAsociado() {
		assertNotNull(carrito.getDetalles());
	}
	
	@Test
	public void cantidadDelProductoIndicada(){
		assertNotNull(detalle.getCantidad());
	}
	
	@Test
	
	
}
    
