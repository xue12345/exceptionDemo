import java.io.FileInputStream;
import java.io.IOException;

public class AccessExceptionMsg {
    /**
     * 输出异常信息
     * 常用方法：1.getMessage(),返回该异常的详细描述字符串
     *           2.printStackTrace(),将该异常的跟踪栈信息输出到标准错误输出
     *           3.printStackTrace(String s)，将该异常的跟踪栈信息输出到指定的输出流
     *           4.getStackTrace(),返回该异常的跟踪栈信息
     */
    public static void main(String [] args){
        try {
            //创建一个文件输入流，并捕获io异常
            FileInputStream fileInputStream = new FileInputStream("a.text");
        }
        catch (IOException io){
            System.out.println("异常描述："+io.getMessage());
            io.printStackTrace();
        }

    }
}
