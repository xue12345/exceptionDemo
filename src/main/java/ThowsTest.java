import java.io.FileInputStream;
import java.io.IOException;

public class ThowsTest {
    /**
     * 声明抛出异常：说明当前方法不知道如何处理该异常，请求调用方法者进行处理。
     *      1.可声明抛出多个异常，用逗号隔开
     *      2.一旦声明抛出异常，程序则无需使用try{}catch{}进行捕获
     *      3.说明该方法不处理异常，交给jvm进行处理，一旦发生异常，jvm会打印该异常的跟踪栈信息，并结束程序。
     */
    public static void main(String []args) throws IOException {

        FileInputStream file = new FileInputStream("a.text");
    }

}