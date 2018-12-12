public class DivTest {

    /**
     *
     *java 异常处理
     * 数组越界、数字格式异常、算数异常
     **/
    public static void main(String []args){
        try{

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("您输入的两个数相除的结果是："+ c);

        }catch (IndexOutOfBoundsException i){
            System.out.println("数组越界：程序运行时输入的参数不够");
        }catch (NumberFormatException n){
            System.out.println("数字格式异常：程序只能接收整数参数");
        }catch (ArithmeticException a){
            System.out.println("算数异常");
        }catch (Exception e){
            System.out.println("未知错误");
        }
    }
}
