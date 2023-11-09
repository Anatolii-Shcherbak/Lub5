public class AdditionalTask {
    public static void main(String[] args) {
        int Arr1[] = (new int[]{3, 2, -2, 5, -3});

        loop(Arr1);
        Arr1 = (new int[]{1, 1, 2, -1, 2, -1});
        loop(Arr1);
        Arr1 = (new int[]{1, 2, 3, -4});
        loop(Arr1);
        Arr1 = (new int[]{1, 1});
        loop(Arr1);
    }
    public static void loop( int Arr1[]) {
        int CheckPair, big=0, small=0;

        for (int i = 0; i < Arr1.length; i++) {
            for (int j = 0; j < Arr1.length; j++) {
                CheckPair = Arr1[i] + Arr1[j];
                if (CheckPair == 0) {
                    if (Arr1[i] < 0 && small > Arr1[i]) {
                        small = Arr1[i];
                        big = Arr1[j];
                    } else if (Arr1[i] > 0 && big > Arr1[i]) {
                        small = Arr1[j];
                        big = Arr1[i];
                    }
                }
            }
        }
        if(small == 0)System.out.println("the lack of pair");
        else System.out.println("the highest pair of absolute numbers "+ "|" +small +"|" + " " + big );
    }


}