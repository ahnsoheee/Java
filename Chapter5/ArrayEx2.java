package Chapter5;

import java.util.*;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        // int [] iArr3 = new int[]{100, 90, 80, 70, 60};
        int[] iArr3 = { 100, 90, 80, 70, 60 };
        char[] chArr = { 'a', 'b', 'c', 'd' };

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }
        ;

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1;
        }
        ;

        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ",");
        }
        ;

        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3); // [I@3fb4f649: [I - 1차원 int배열, 3fb4f649 - 주소 (실제 주소가 아닌 내부 주소)
        System.out.println(chArr);
    }
}

// 1,2,3,4,5,6,7,8,9,10,
// [9, 4, 4, 5, 3, 6, 6, 5, 1, 10] // 매번 달라짐
// [100, 90, 80, 70, 60]
// [a, b, c, d]
// [I@3fb4f649
// abcd