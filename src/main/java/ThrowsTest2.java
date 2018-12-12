import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest2 {
    /**
     * 如果调用了一个带有throws声明的方法，该方法声明了checked异常。
     * 则表明该方法需要调用者来处理该异常。也就是说在调用该方法时，要么放在另一个带throws的方法中，要么用try块捕获异常
     *
     * */
    public static void main(String [] args) throws IOException {
        test();
    }
    private static void test() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("a.text");
    }
}
