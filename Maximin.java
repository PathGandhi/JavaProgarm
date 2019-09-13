//Using CommandLine Argument Find a MaxMin Value
class Maxmin {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i;
        for (i = 0; i < args.length; i++) {
            a[i] = Integer.valueOf(args[i]);
        }
        System.out.println("Inserted Arry:");
        for (i = 0; i < args.length; i++) {
            System.out.println(a[i]);
        }
        int max = 0, min = a[0];
        for (i = 0; i <= args.length - 1; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
            // System.out.println("Max:" + max);
            // System.out.println("Min:" + min);
        }
        System.out.println("Max number is:" + max);
        System.out.println("Min number is:" + min);
    }
}
