package chain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/25/025.
 */
public class FilterChain implements MyFilter {

    List<MyFilter> filterList = new ArrayList<MyFilter>();

    public FilterChain addMyFilter(MyFilter myFilter){
        this.filterList.add(myFilter);
        return  this;
    }
    @Override
    public String doFilter(String msg) {

        String str = msg;
        for (MyFilter myFilter:filterList){
            str = myFilter.doFilter(str);
        }
        return str;
    }
}
