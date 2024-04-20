import java.util.List;
import java.util.Scanner;
import static java.lang.Math.random;

public class Main  implements Electronicos  {
    private static List<electronicos> articulos;
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        electronicos telefono = new Telefonos();
        electronicos laptop = new Computadoras();
        while (opcion != 5){
            System.out.println("Bienvenido a ElectroMart");
            System.out.printf("1. Ingresar datos telefono\n2. Ingresar datos laptop\n3. Modificacion de datos\n3. Consultar articulos electronicos\n5. salir\nIndique la opcion:");
            opcion= sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la marca del telefono: ");
                    telefono.IngresarMarca(sc.nextLine());
                    System.out.println("Ingrese la modelo del telefono: ");
                    telefono.IngresarModelo(sc.nextLine());
                    System.out.println("Ingrese la sistema del telefono: ");
                    String sistema = sc.nextLine();
                    System.out.println("Ingrese la tipo de SIM del telefono: ");
                    String SIM = sc.nextLine();
                    telefono.datosArticulo(sistema, SIM);

                    articulos.add(telefono);
                    break;
                case 2:
                    System.out.println("Ingrese la marca de la compu: ");
                    laptop.IngresarMarca(sc.nextLine());
                    System.out.println("Ingrese la modelo del : ");
                    laptop.IngresarModelo(sc.nextLine());
                    System.out.println("Ingrese la sistema del telefono: ");
                    String cpu = sc.nextLine();
                    System.out.println("Ingrese la tipo de SIM del telefono: ");
                    String RAM = sc.nextLine();
                    laptop.datosArticulo(cpu, RAM);

                    articulos.add(laptop);
                    break;
                case 3:
                    System.out.println("indique la cuenta a la que puere acceder: ");
                    electronicos producto =buscarCuenta(sc.nextInt(), articulos);
                    if(producto!= null){
                        System.out.println("Indique la cantidad de articulos en stock: ");
                        producto.Productos(sc.nextInt());
                        System.out.println("Se ha Cambiado correctamente");
                    }
                    else{
                        System.out.println("No se encontro el producto");
                    }

                    break;
                case 4:
                    mostrarLista(articulos);
                    break;
                case 5:
                    System.out.println("Tenga un buen dia");
            }
        }
    }
    public static void mostrarLista(List<electronicos> cuentas){
        System.out.println("-------Lista------");
        for(electronicos cuenta : cuentas) {
            System.out.println("N° producto: " + cuenta.getId());
            System.out.println("Dispositivo: " + cuenta.getMarca());
            System.out.println("Modelo: " + cuenta.getModelo());
            cuenta.MostarDatosArticulos();
            System.out.println("N° producto: " + cuenta.getCantidad());
        }
    }
    public static electronicos buscarCuenta(long numeroProducto, List<electronicos> cuentas) {

        for (electronicos cuenta : cuentas) {
            if ( cuenta.getId() == numeroProducto) {
                return cuenta;
            }
        }
        return null;
    }

    @Override
    public double ObtenerPrecio() {
        double total=0, total2=0;
        total = random();
        if (random()!= 0){
            total2=(total*100)+0.99;
        }
        return total2;
    }
}