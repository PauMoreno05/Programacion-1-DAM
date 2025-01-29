package POO.Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        // Crear un banco
        Banco banco = new Banco(1);

        // Crear una sucursal y asociarla al banco
        Sucursal sucursal = new Sucursal(101, banco);
        banco.addSucursal(sucursal);

        // Crear una cuenta corriente y asociarla a la sucursal
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1001, sucursal);
        sucursal.addCuentas(cuentaCorriente);

        // Crear un préstamo y asociarlo a la sucursal
        Prestamo prestamo = new Prestamo(2001);
        sucursal.addPrestamo(prestamo);

        // Crear un cliente
        Cliente cliente = new Cliente("12345678A");

        // Asociar el préstamo al cliente
        cliente.addPretamos(prestamo);

        // Crear una relación ClienteMasCuentacorrienteTodoJunto
        ClienteMasCuentacorrienteTodoJunto relacion = new ClienteMasCuentacorrienteTodoJunto("Relación1", cuentaCorriente, cliente);

        // Asociar la relación a la cuenta corriente y al cliente
        cuentaCorriente.addExtras(relacion);
        cliente.addExtras(relacion);

        // Mostrar la información del banco, sucursal, cuenta corriente, préstamo y cliente
        System.out.println("Banco: " + banco);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Cuenta Corriente: " + cuentaCorriente);
        System.out.println("Préstamo: " + prestamo);
        System.out.println("Cliente: " + cliente.getDni());
        System.out.println("Relación Cliente-Cuenta Corriente: " + relacion.getSet());
    }
}