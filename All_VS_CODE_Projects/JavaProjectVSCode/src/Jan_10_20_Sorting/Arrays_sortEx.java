import java.util.Arrays;

public class Arrays_sortEx {
    public static void main(String[] args) {
        int a1[] = {5, 20, 12, 30, 8, 35, 2};
        int a2[] = {'B', 'B', 'A','C', 'A'};
        Arrays.sort(a1);
        System.out.println((Arrays.toString(a1)));
        Arrays.sort(a2);
        System.out.println((Arrays.toString(a2)));
    //  Subarray Sorting --> [start. end)
        Arrays.sort(a1, 1, 4);
        System.out.println(Arrays.toString(a1));

    }    
}
