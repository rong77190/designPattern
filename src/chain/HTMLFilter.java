package chain;

/**
 * Created by Administrator on 2017/1/24/024.
 */
public class HTMLFilter implements MyFilter{
    @Override
    public String doFilter(String msg) {
        String r = msg.replace('<', '[')
                .replace('>', ']');
        return r;
    }
}
