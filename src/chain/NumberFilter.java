package chain;

/**
 * Created by Administrator on 2017/1/24/024.
 */
public class NumberFilter implements MyFilter {
    @Override
    public String doFilter(String msg) {
//        String numberPattern="^[0-9]";
//        if(!PatternMatcher.isMatch(numberPattern,msg)){
//            return null;
//        }
//        String orgi = "15462348787";

//        orgi = orgi.replaceAll("(\\d{3})(\\d{5})(\\d{3})", "$1*****$3");
        return msg.replaceAll("(\\d)","*");

    }
}
