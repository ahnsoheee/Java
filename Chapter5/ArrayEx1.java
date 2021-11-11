package Chapter5;

class ArrayEx1 {
    public static void main(String[] args) {

        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70; // score[2] = 70
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k + 2] + score[4];

        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d]: %d%n", i, score[i]);
        }

        System.out.printf("tmp: %d%n", tmp);
        System.out.printf("score[%d]: %d%n", 7, score[7]); // index의 범위를 벗어난 값
    }
}

// score[0]: 50
// score[1]: 60
// score[3]: 80
// score[4]: 90
// tmp: 170
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7
// out of bounds for length 5
// at Chapter5.ArrayEx1.main(ArrayEx1.java:22)