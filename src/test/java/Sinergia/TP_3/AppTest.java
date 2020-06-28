package Sinergia.TP_3;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.*;

public class AppTest {
	
	//Carro carrito = new Carro(1);
	//Producto producto = new Producto("martillo", 2123, "el mas duro");
	//Detalle detalle = new Detalle(producto, 2,1);
	
	@Test
	public void carritoConMasDe1ProductoAsociado() {
		//Arrange
		Producto producto = new Producto("martillo", 2123, "el mas duro");
		Detalle detalle = new Detalle(producto, 2,1);
		
		//Act
		Carro carrito = new Carro(1, detalle);
		
		//Assert
		assertNotNull(carrito.getDetalles());
	}
	
	@Test
	public void cantidadDelProductoIndicada(){
		//Arrange
		Producto producto = new Producto("martillo", 2123, "el mas duro");
		Detalle detalle = new Detalle(producto, 2,1);
		
		//Act
		int cantidad = detalle.getCantidad();
		//Assert
		assertNotNull(cantidad);
	}
	
	@Test
	public void cantidadProductosMenorQueStock() {
		//Arrange
		Producto producto = new Producto("martillo", 2123, "el mas duro");
		Detalle detalle = new Detalle(producto, 2,1);
		Carro carrito = new Carro(1, detalle);
		
		producto.setStock(10);
		int expected = producto.getStock() - detalle.getCantidad();
		//Act
		carrito.realizarCompra();
		//Assert
		assertEquals(expected, producto.getStock() - detalle.getCantidad());
		
	}
	
	@Test
	public void eliminarDetalleDelCarroSinEliminarElProducto() {
		//Arrange
		Producto producto = new Producto("martillo", 2123, "el mas duro");
		Detalle detalle = new Detalle(producto, 2,1);
		Carro carrito = new Carro(1, detalle);
		//Act
		carrito.eliminarDetalle(detalle.getIdDetalle());
		//Assert
		assertAll("detalle",
				()->assertEquals(0, carrito.getDetalles().size()),
				()->assertNotNull(producto)
		);
		
	}
	
}
    
