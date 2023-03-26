
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int size = birdsPerDay.length;
        int ultimo = size-1;
        if (size != 0){
            return birdsPerDay[ultimo];
        }else return 0;
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] = birdsPerDay[6]+1;
        System.out.println("Quanti pennuti hanno fatto visita oggi +1: " + birdsPerDay[6]);
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < 6; i++){
            if (birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int n = numberOfDays;
        int a = 0;
        if (n > 7){
            n = 7;
        }
        for (int i = 0; i<n; i++){
            a = a +birdsPerDay[i];
        }
        return a;
    }

    public int getBusyDays() {
        int giorni = 0;
        for (int i = 0; i < 6; i++){
            if (birdsPerDay[i] >= 5){
                giorni++;
            }
        }
        return giorni;
    }
}
