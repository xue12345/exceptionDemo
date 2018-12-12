public class AuctionException extends Exception {
    /**
     * 自定义异常
     * 1.继承exception类
     * 2.提供一个无参构造方法
     * 3.一个带字符串的有参构造方法
     */
    public AuctionException(){

    }
    public AuctionException(String msg){
        super(msg);
    }
}
