package chain;

/**
 * Created by Administrator on 2017/1/25/025.
 */
public class Test {

    public static void main(String[] args) {
        String msg = "<script>今天天气晴朗。:)。123））司法发生想2312312312";

        FilterChain filterChain = new FilterChain();
        filterChain.addMyFilter(new HTMLFilter())
                   .addMyFilter(new NumberFilter())
                   .addMyFilter(new FaceFilter());
        String result  = filterChain.doFilter(msg);
        System.out.println(result);


    }
}
