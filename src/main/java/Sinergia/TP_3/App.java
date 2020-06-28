package Sinergia.TP_3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Carro carrito = new Carro(1);
    	Producto producto = new Producto("martillo", 2123, "el mas caro");
    	Producto producto2 = new Producto("Destornillador", 1321, "el mas barato");
    	Producto producto3 = new Producto("tornillo", 4321, "....");
    	Detalle detalle = new Detalle(producto, 2,4);
    	Detalle detalle2 = new Detalle(producto2, 3 ,8);
    	Detalle detalle3 = new Detalle(producto3, 3 ,6);
    	
    	carrito.addDetalle(detalle);
    	carrito.addDetalle(detalle2);
    	carrito.addDetalle(detalle3);
    	
    	
    	carrito.eliminarDetalle(8);
    	
    	for (Detalle e : carrito.getDetalles()) {
			System.out.println(e.getIdDetalle());
		}
    	
        System.out.println( "Hello World!" );
    }
}
