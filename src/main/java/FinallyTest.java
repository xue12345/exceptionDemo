import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest {
    /**
     * finally回收资源（对于必须要显示回收的物理资源）
     * 异常处理机制提供了finally块，无论代码如何均会被执行
     *
     */
    public static void main(String []args){
        //创建一个输入流文件
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.text");
        }
        catch (IOException io){
            //输出异常
            System.out.println(io.getMessage());
            //直接返回
            //return;
            //退出虚拟机
            //System.exit(1);
        }
        //除非退出虚拟机，否则都会执行
        finally {
            //回收资源
            if(fis != null){
                try {
                    fis.close();
                }catch (IOException io){
                    io.printStackTrace();
                }
            }
            System.out.println("执行finally块的资源回收！");
        }

        /**
         * 注意：1.try 不能单独使用，可搭配catch{}，或者finally{}，也可同时使用
         *       2.catch{}必须位于try后，finally{}必须位于catch{}后。
         *       3.如果在异常中使用System.exit(1)方法退出虚拟机，则finally不会执行
         */
    }

}
