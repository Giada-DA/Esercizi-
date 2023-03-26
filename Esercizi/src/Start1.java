public class Start1 {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        System.out.println("Tempo di cottura totale della lasagna:");
        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println("");

        System.out.println("Tempo di cottura rimanente:");
        System.out.println(lasagna.remainingMinutesInOven(10));
        System.out.println("");

        System.out.println("Tempo di preparazione degli strati (numero degli strati per tempo ciascuno): ");
        System.out.println(lasagna.preparationTimeInMinutes(3));
        System.out.println("");

        System.out.println("Tempo di lavoro totale:");
        System.out.println(lasagna.totalTimeInMinutes(3,20));
    }
}
