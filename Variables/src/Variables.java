public class Variables {
    public static void main(String[] args) {
        //Variables
        int edad = 22;
        double precio = 300.40;
        boolean disponible = true;
        char genero;
        genero = 'H';

        //Acceder a las variables
        System.out.println("En el 2024 tengo " + edad + " años");
        //modificar valor edad
        edad = 23;
        System.out.println("Edad en el 2025 tendre " + edad + " años");
        System.out.println("Precio del sueter $" + precio);
        System.out.println("El suter esta disponible " + disponible);
        System.out.println("El sueter es para H-Hombre o M-Mujer: " + genero);
    }
}
