package adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class Client {
    public static void main(String[] args) {

        People p = new People();
        Map<Object,Object> map = new HashMap<Object, Object>();
        map = p.getOrgName();
        for (int i = 0; i < map.size();i ++){
            System.out.println(map.get(i+1));
        }
    }


}
