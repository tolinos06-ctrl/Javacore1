package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {
    public static void main(String[] args){
        boolean isHouseEmpty = true;
        boolean isOwnerAsleep = true;
        boolean areAllDoorsAndWindowsClosed = true;
        boolean isAlarmActivated = false;
        boolean isSafeModeActivated ;
        if ((isHouseEmpty || isOwnerAsleep) && areAllDoorsAndWindowsClosed && isAlarmActivated){
            isSafeModeActivated = true;
        }
        else{
            isSafeModeActivated = false;
        }
        System.out.println(isSafeModeActivated);
    }
}
