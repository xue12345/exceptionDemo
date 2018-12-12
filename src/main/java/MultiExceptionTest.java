public class MultiExceptionTest {
    /**
     * 多异常的捕获
     * 1.从Java7开始，每个catch可捕获多个异常
     * 2.多种异常时，用竖线隔开（|）
     * 3.异常变量有隐式final修饰，所以不能重新赋值
     */
    public static void main(String [] args){
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("您输入的两个数相除的结果是:"+ c);
        }
        catch (IndexOutOfBoundsException| NumberFormatException|ArithmeticException ie){
            System.out.println("程序发生了数组越界、数字格式异常、算数异常之一");
            //因为ie 有默认的final修饰，所以下列代码有错(编译不通过)
            //ie = new ArithmeticException("test");
        }
        catch (Exception e){
            System.out.println("程序发生了未知异常");
            //捕获一种异常时，没有final修饰，所以下列代码是正确的
            e = new RuntimeException("test");
        }



    }
}
