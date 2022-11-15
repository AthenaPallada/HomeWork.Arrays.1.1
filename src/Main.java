public class Main {
    public static void main(String[] args) {
        //1 задача
        int[] weight = new int [3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] number = {1.57, 7.654, 9.986};
        byte[] age = {14, 18, 20, 45};
        //2 задача
        System.out.println("2 задача");
        for(int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if(i < weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if(i < number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0; i < age.length; i++) {
            System.out.print(age[i]);
            if (i < age.length - 1) {
                System.out.print(", ");
            }
        }
        //3 задача
        System.out.println("\n3 задача");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = age.length - 1; i >= 0; i--) {
            System.out.print(age[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }
        //4 задача
        System.out.println("\n4 задача");
        for(int i = 0; i < weight.length; i++) {
            if(i % 2 == 0) {
                weight[i] += 1;
            }
        System.out.print(weight[i] + " ");
        }
    }
}