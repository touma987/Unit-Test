package Sinergia.TP_3;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.*;

public class AppTest {
	
	Carro carrito = new Carro(1);
	Producto producto = new Producto("martillo", 2123, "el mas duro");
	Detalle detalle = new Detalle(producto, 2,1);
	
	@Test
	public void carritoConMasDe1ProductoAsociado() {
		carrito.addDetalle(detalle);
		assertNotNull(carrito.getDetalles());
	}
	
	@Test
	public void cantidadDelProductoIndicada(){
		assertNotNull(detalle.getCantidad());
	}
	
	@Test
	public void cantidadProductosMenorQueStock() {
		producto.setStock(10);
		int expected = producto.getStock() - detalle.getCantidad();
		
		carrito.realizarCompra();
		
		assertEquals(expected, producto.getStock() - detalle.getCantidad());
		
	}
	
	@Test
	public void eliminarDetalleDelCarroSinEliminarElProducto() {
		carrito.addDetalle(detalle);
		
		carrito.eliminarDetalle(detalle.getIdDetalle());

		assertAll("detalle",
				()->assertEquals(0, carrito.getDetalles().size()),
				()->assertNotNull(producto)
		);
		
	}
	
}
    
