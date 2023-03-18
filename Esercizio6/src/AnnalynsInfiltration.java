class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake == true){
            return false;
        }else return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake || archerIsAwake || prisonerIsAwake == true){
            return true;
        }else return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(archerIsAwake == true && prisonerIsAwake == true){
            return false;
        }else if (archerIsAwake == true && prisonerIsAwake == false){
            return false;
        }else if (archerIsAwake == false && prisonerIsAwake == false){
            return false;
        }
        return true;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent == true && archerIsAwake == false){
            return true;
        } else if(petDogIsPresent == false && prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false){
            return true;
        } else if (petDogIsPresent == false && prisonerIsAwake == false){
            return false;
        } else return false;
    }
}
