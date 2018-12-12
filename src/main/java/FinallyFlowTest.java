public class FinallyFlowTest {
    /**
     * 在finally中使用return、throw等导致方法终止的语句
     * 将会使try{}，catch{}中的return、throw语句失效
     */

    public static void main(String [] args) throws Exception{
        boolean a = test();
        //输出结果为 a = false;
        System.out.println("a = " + a);
    }
    public static boolean test(){
        //因为finally 使用return 使try中的代码块失效
        try {
            return true;
        }
        finally {
            //应避免这种写法
            return false;
        }
    }
}
