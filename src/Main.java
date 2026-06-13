public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema del Departamento de Obras Públicas ---");
        
        Ciudadano ciudadano = new Ciudadano("Juan Perez", "juan@mail.com", 1234);
        System.out.println("Ciudadano registrado: " + ciudadano.getMail());
        
        Bache bache = new Bache(1, 2.5, "San Martin", "Belgrano", 100, "Centro", 5);
        System.out.println("Bache reportado. Estado actual: " + bache.getEstado());
        
        DepartamentoObrasPublicas depto = new DepartamentoObrasPublicas();
        
        System.out.println("Sistema base cargado en memoria correctamente.");
        System.out.println("Para probar la lógica, ejecuta los archivos 'CiudadanoTest' y 'ParameterCIUTest'.");
    }
}