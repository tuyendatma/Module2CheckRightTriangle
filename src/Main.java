import java.util.Scanner;

public class Main {
    public static void checkTriangle(int a, int b, int c)
            throws NegativeEdgeException,EdgeTooLongException {
        if (!(a>0&& b>0 && c>0)) {
            throw new NegativeEdgeException("cạnh tam giác phải lớn hơn 0");
        }
        else if(((a+b <=c)||(a+c<=b)||(c+b<=c))){
            throw new EdgeTooLongException("1 cạnh không được lớn hơn tổng 2 cạnh còn lại");
        }
    }
    public static void checkRightTriangle (int a,int b, int c)throws RightTriangleException{
       if(!((a*a == b*b +c*c) || (b*b ==c*c +a*a) || (c*c == b*b+a*a) )){
           throw new RightTriangleException("không phải tam giác vuông");
       }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh tam giác:");
        int a= scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();
        try {
            checkTriangle(a,b,c);
            checkRightTriangle(a,b,c);
            System.out.println("day la tam giac vuong");
            if(a*a == b*b +c*c){
                System.out.println("dien tich:"+ b*c/2);
            }else if (b*b ==c*c +a*a){
                System.out.println("dien tich:"+ a*c/2);
            }else System.out.println("dien tich:"+ b*a/2);


        }catch (TriangleException | RightTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
