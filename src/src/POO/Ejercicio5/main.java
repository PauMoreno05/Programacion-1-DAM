package POO.Ejercicio5;

public class main {
    public static void main(String[] args) {

        Banco banco = new Banco(1);


        Sucursal sucursal1 = new Sucursal(101, banco);
        banco.addSucursal(sucursal1);

        CuentaCorriente cuenta1 = new CuentaCorriente(1001, sucursal1);
        CuentaCorriente cuenta2 = new CuentaCorriente(1002, sucursal1);
        sucursal1.addCuentas(cuenta1);
        sucursal1.addCuentas(cuenta2);


        Domicilacion domiciliacion1 = new Domicilacion(2001, cuenta1);
        Domicilacion domiciliacion2 = new Domicilacion(2002, cuenta2);
        cuenta1.addDomiciliacion(domiciliacion1);
        cuenta2.addDomiciliacion(domiciliacion2);

        Prestamo prestamo1 = new Prestamo(3001);
        Prestamo prestamo2 = new Prestamo(3002);
        sucursal1.addPrestamo(prestamo1);
        sucursal1.addPrestamo(prestamo2);


        Cliente cliente1 = new Cliente("12345678A");
        Cliente cliente2 = new Cliente("87654321B");

        ClienteMasCuentacorrienteTodoJunto asociacion1 = new ClienteMasCuentacorrienteTodoJunto("Asociación1", cuenta1, cliente1);
        ClienteMasCuentacorrienteTodoJunto asociacion2 = new ClienteMasCuentacorrienteTodoJunto("Asociación2", cuenta2, cliente2);

        cliente1.addExtras(asociacion1);
        cliente2.addExtras(asociacion2);
        cuenta1.addExtras(asociacion1);
        cuenta2.addExtras(asociacion2);


    }
}
