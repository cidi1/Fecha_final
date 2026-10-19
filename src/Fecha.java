public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    // Constructor que inicializa las tres variables de instancia
    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    // Métodos Getters y Setters
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método para mostrar la fecha separada por barras diagonales (/)
    public void mostrarFecha() {
        System.out.println(getMes() + "/" + getDia() + "/" + getAnio());
    }
}

