public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int value){
        return expectedMinutesInOven() - value;
    }
    public int preparationTimeInMinutes(int layer){
        return layer * 2;
    }
    public int totalTimeInMinutes(int layer, int remainingTime){
        return preparationTimeInMinutes(layer) + remainingTime;
    }
}
