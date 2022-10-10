public class Variables {
    public static void main(String[] args) {
        int pizzas = 6;
        int personas = 3;
        int PizzasXPersona = pizzas / personas;

        System.out.printf("si hay %d pizzas y %d personas, a cada una le tocan %d pizzas\n",
                pizzas, personas, PizzasXPersona);

        String auto = "Ferrari";
        double velocidad = 90.5;
        System.out.printf("El auto %s se desplaza a %f km/h\n", auto, velocidad);


        int PrecioLeche = 80;
        double PrecioYogurt = 90.5;
        int PrecioPan = 100;


        double PrecioTotal = PrecioLeche + PrecioYogurt + PrecioPan;
        System.out.printf("el precio total es %f", PrecioTotal);
    }
}
