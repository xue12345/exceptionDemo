public class ThrowTest {
    /**
     * 方法可根据业务需求自行抛出异常
     * 1.如果该异常为checked异常，则必须方法try{}catch{}进行显示捕获，或者放在声明throws 的方法中
     * 2.如果发生的是runtime异常，则可放到try{}catch{}进行捕获，或者不处理，把异常交给调用者处理
     */
    public static void main(String [] args){
        try {
            throwChecked(-3);
            throwRunTime(3);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void throwChecked(int a)throws Exception{
        //疑问一：exception 属于哪种异常？
        if(a > 0){
            throw new Exception("a的值大于0,不符合要求");
        }
    }
    public static void throwRunTime(int a){
        if(a > 0){
            throw new RuntimeException("a的值大于0,不符合要");
        }
    }


}
