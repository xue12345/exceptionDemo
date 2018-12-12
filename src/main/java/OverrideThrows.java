import java.io.FileInputStream;
import java.io.IOException;

public class OverrideThrows {
    /**
     * throws声明对于方法重写时有一条规则：
     *  1.子类方法声明抛出的异常类型应该是父类抛出类型的子类或者相同。
     *  2.也就是子类不允许比父类方法声明抛出的异常多。
     */
    public void text() throws IOException {
        System.out.println("调用父类方法");
        FileInputStream inputStream = new FileInputStream("a.text");
    }
}
class Sub extends OverrideThrows {

    @Override
    public void text() throws IOException {
        //抛出该异常只能是IOException以及他的子类，不能是Exception
        super.text();
        System.out.println("调用子类");
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        try {
            sub.text();
        } catch (IOException e) {
            System.out.println("抛出异常");
            e.printStackTrace();
        }
    }
}
