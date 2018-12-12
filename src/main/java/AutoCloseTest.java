import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class AutoCloseTest {
    /**
     *Java 9 增强的自动关闭资源的try语句
     */
    public static void main(String [] args){
//        try(
//            //声明、初始化两个可关闭的资源
//            //try 语句会自动关闭这两个资源
//            BufferedReader br = new BufferedReader(new FileReader("AutoCloseTest.java"));
//            PrintStream ps = new PrintStream(new FileOutputStream("a.text"));
//            )
//        {
//            //使用这两个资源
//            System.out.println("br.readLine() = " + br.readLine());
//            ps.println("庄生晓梦迷蝴蝶");
//        }

        //由于BufferedReader、PrintStream均实现了Closeable接口，并且他们放在try语句进行声明、初始化，
        //所以try语句会自动关闭他们，因此上面的程序是安全的
        //try自动关闭语句，包含了隐式的finally，所以该try{}语句可以既没有catch{}，也没有finally{}。
    }

}
