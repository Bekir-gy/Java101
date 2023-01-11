public class DiziTekrarEdenCift {
    static boolean isTry(int[] arr, int val) {
        for (int i : arr) {
            if (i == val)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list = {15, 13, 1, 7, 88, 16, 4, 5,62};

        int[] duplicate = new int[list.length];
        int sayac = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                if (!(isTry(duplicate, list[i])))
                    duplicate[sayac++] = list[i];

               // break;

            }
        }

            for (int read : duplicate) {
               if (read != 0)
                    System.out.print(read+" ");
            }



    }
}

