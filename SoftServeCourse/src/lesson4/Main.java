class Scratch {
    public static void main(String[] args) {
        int i1 = 12;
        int i2 = 13;
        int i3 = 11;

        if (i1 > i2) {
            if (i1 > i3) {
                System.out.println(i1);
            } else {
                System.out.println(i3);
            }
        } else {
            if (i2 > i3) {
                System.out.println(i2);
            } else {
                System.out.println(i3);
            }
        }
        int max = 11;
        if (i2 > max) max = i2;
        if (i3 > max) max = i3;
        System.out.println(max);
    }
}