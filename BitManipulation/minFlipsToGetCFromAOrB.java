class Codechef {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = 5;
        int flipCount = 0;
        while (a != 0 || b != 0 || c != 0) {
            if ((c & 1) == 1) {
                if (((a & 1) == 0) && ((b & 1) == 0)) {
                    flipCount++;

                }

            }

            else if ((c & 1) == 0) {

                if (((a & 1) == 0 && (b & 1) == 1) || ((a & 1) == 1 && (b & 1) == 0)) {
                    flipCount++;

                }

                else if ((a & 1) == 1 && (b & 1) == 1) {
                    flipCount = flipCount + 2;
                }
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        System.out.println(flipCount);

    }
}