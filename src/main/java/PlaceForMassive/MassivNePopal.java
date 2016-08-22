package PlaceForMassive;

public class MassivNePopal  {
    private static int[] massive;
    public static void setLengthMassive(int length){
        massive = new int[length];
    }
    public static void setNePopal(int i){
        massive[i]++;
    }
    public static int[] getMassive(){
        return massive;
    }

}
