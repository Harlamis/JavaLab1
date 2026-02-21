public class JavaLab1 {
    public static int Area(int a, int b) {
        return a*b;
    }
    public static double Area(double a, double b) {
        return a*b;
    }
    public static String CheckRights(int age) {
        return age >=18? "You may elect!": "You can't elect!";
    }
    public static String Month(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Error: month number out of bounds!";
        }
    }
    public static int Sum() {
        int i = 1;
        int num = 0;
        while (i <= 50) {
            num += i;
            i++;
        }
        return num;
    }

    public static void Transpose() {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {

            System.out.println();
            for (int col = 0; col < matrix[row].length; col++) {
                result[col][row] = matrix[row][col];
                System.out.print(matrix[row][col] + " ");
            }
        }

        for (int row = 0; row < result.length; row++) {

            System.out.println();
            for (int col = 0; col < result[row].length; col++) {
                System.out.print(result[row][col] + " ");
            }
        }
    }
    public static void  main(String[] args) {
        System.out.println(Area(4, 5));
        System.out.println(Area(4.5, 5.5));
        System.out.println(CheckRights(18));
        System.out.println(Month(11));
        System.out.println(Sum());
        Transpose();
    }
}
