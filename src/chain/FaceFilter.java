package chain;

/**
 * Created by Administrator on 2017/1/24/024.
 */
public class FaceFilter implements MyFilter {
    public String doFilter(String msg) {
        return msg.replace(":)", "^V^");
    }
}
