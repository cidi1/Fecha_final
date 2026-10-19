import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== REGISTRO DE FECHA ===");

    // Lectura de los tres valores enteros por consola
    System.out.print("Ingrese el mes (1-12): ");
    int mes = scanner.nextInt();

    System.out.print("Ingrese el día (1-31): ");
    int dia = scanner.nextInt();

    System.out.print("Ingrese el año: ");
    int anio = scanner.nextInt();

    // Creación del objeto Fecha con los valores ingresados
    Fecha fecha1 = new Fecha(mes, dia, anio);

    // Demostración del método mostrarFecha
    System.out.println("\n----------------------------");
    System.out.print("La fecha ingresada es: ");
    fecha1.mostrarFecha();

    // Demostración de modificación usando métodos set
    System.out.println("\n--- Modificando la fecha con métodos set ---");
    System.out.print("Ingrese un nuevo año: ");
    int nuevoAnio = scanner.nextInt();
    fecha1.setAnio(nuevoAnio);

    System.out.print("La nueva fecha actualizada es: ");
    fecha1.mostrarFecha();

    scanner.close();
}