package Sinergia.TP_3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Producto producto = new Producto("martillo", 2123, "el mas duro");
		Detalle detalle = new Detalle(producto, 2,1);
		Carro carrito = new Carro(1, detalle);
		
		producto.setStock(10);
		
		
		
		int expected = producto.getStock() - detalle.getCantidad();
		
		System.out.println(producto.getStock());
		System.out.println(detalle.getCantidad());
		System.out.println(expected);
		System.out.println();
		
		carrito.realizarCompra();
		
		System.out.println(producto.getStock());
    	
        System.out.println( "Hello World!" );
    }
}
