public class Start {
    public static void main(String[] args) {
        AnnalynsInfiltration anna = new AnnalynsInfiltration();

        System.out.println("Annalyn può eseguire un attacco veloce? " + anna.canFastAttack(true));
        //si se il cavaliere dorme, no se è sveglio

        System.out.println("Annalyn può spiare il gruppo? " + anna.canSpy(true, true, false));
        //si se almeno uno è sveglio, se no è inutile

        System.out.println("Il prigioniero può essere segnalato? " + anna.canSignalPrisoner(false, false));
        //si se il prigioniero è sveglio e larciere dorme, se l'arciere invece è sveglio non si può segnalare il prigioniero

        System.out.println("Si può liberare il prigioniero? " + anna.canFreePrisoner(false, false, true, true));
        /*
        Liberare il prigioniero, due modi:
        1) se c'è il cane, il prigioniero è sveglio e cavaliere e arciere dormono -> è libero
        2) se non c'è il cane, il prigioniero è sveglio mentre l'arciere e il cavaliere dormono -> è libero

        Fail: se il cane non c'è e il prigioniero dorme
         */
    }
}
