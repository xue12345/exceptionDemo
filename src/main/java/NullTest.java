import java.util.Date;

/**
 * Demo
 *
 * @author wangxue
 * @date 2018/12/1
 */
public class NullTest {
    /**
     * 空指针异常
     *
     */
    public static void main(String [] args){
        //创建空对象 d
        Date d = null;
        try {
            //空.方法(发生空指针异常)
            d.after(new Date());
        }
        catch (NullPointerException n){
            System.out.println("空指针异常");
        }
        catch (Exception e){
            //捕获未知异常
            System.out.println("未知异常");
        }
        //捕获异常时：先捕获小异常，在捕获大异常
    }
}
