class Triangle {

    private double a;
    private double b;
    private double c;

    Triangle(double first, double second, double third) {
        a = first;
        b = second;
        c = third;
    }

    String triangle() {
        if(a <= 0 || b <= 0 || c <= 0) {
            return "Error";         // 边长小于0，错误
        }
        else if (a + b <= c || b + c <= a || c + a <= b) {
            return "Fake";          // 非三角形
        }
        else if(a == b && b == c) {
            return "Equilateral";   // 等边三角形
        }
        else if(a == b || b == c) {
            return "Isosceles";     // 等腰三角形
        }
        else {
            return "Scalene";       // 一般三角形
        }
    }

}
