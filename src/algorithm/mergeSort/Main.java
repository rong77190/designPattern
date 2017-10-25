package algorithm.mergeSort;



import java.util.*;

/**
 *
 */
public class Main {
    public static List<UnilateralLine> findSame( List<UnilateralLine> lineList,UnilateralLine unilateralLine,int exceptIndex){
        List<UnilateralLine> resultList = new ArrayList<UnilateralLine>();
        if (exceptIndex == lineList.size()-1){
            return null;
        }
        for(int i = exceptIndex+1; i < lineList.size();i++){
            if (i != exceptIndex){
                if (lineList.get(i).getECen().equals(unilateralLine.getECen()) ||
                        lineList.get(i).getECen().equals(unilateralLine.getSCen()) ||
                        lineList.get(i).getSCen().equals(unilateralLine.getECen()) ||
                        lineList.get(i).getSCen().equals(unilateralLine.getSCen())
                        ){
                    resultList.add(lineList.get(i));
                }
            }
        }
        return resultList;
    }

    public static boolean matchRoleTwo(UnilateralLine a,UnilateralLine b,UnilateralLine c){
        if (a.getECen().equals(b.getSCen()) && b.getECen().equals(c.getSCen()) && c.getECen().equals(a.getSCen())){
            return true;
        }else {
            return false;
        }
    }

    public static boolean matchRoleThird(UnilateralLine a,UnilateralLine b){
        if (a.getECen().equals(b.getSCen())){
            if (a.getSPro().equals(b.getSPro())){
                return true;
            }
        }
        if (b.getECen().equals(a.getSCen())){
            if (b.getSPro().equals(a.getEPro())){
                return true;
            }

        }
        return false;

    }

    public static boolean matchRuleOne(UnilateralLine p,UnilateralLine q){
        if (p.getECen().equals(q.getSCen()) && p.getSCen().equals(q.getECen())){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
        while (scanner.hasNextLine()) {
            String[] options = scanner.nextLine().split(";");
            if (options.length < 5) {
                break;
            }
            lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
        }
        scanner.close();


        // wirte your code here
        List<String> result = calculateUnilateral(lineList);

        for (String str : result) {
            System.out.println(str);
        }
    }
    public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
        List<String> result = new ArrayList<String>();
        for (int i = 0 ; i < lineList.size(); i++){
            List<UnilateralLine> resultList = findSame(lineList,lineList.get(i),i);
            if(resultList != null && resultList.size() > 0){
                    for (int j= 0; j < resultList.size();j++){
                    //规则一
                    if(matchRuleOne(resultList.get(j),lineList.get(i))){
                        String str = "rule1:"+lineList.get(i).getId()+"+"+resultList.get(j).getId();
                        result.add(str);
                    }
                    //规则2
                    List<UnilateralLine> result2List = findSame(resultList,resultList.get(j),j);
                    if (result2List != null && result2List.size() > 0){
                        for (int k = 0; k < result2List.size();k++){
                            if (matchRoleTwo(lineList.get(i),resultList.get(j),result2List.get(k))){
                                String str = "rule2:"+lineList.get(i).getId()+"+"+resultList.get(j).getId()+"+"+result2List.get(k).getId();
                                result.add(str);
                            }
                        }
                    }
                        //规则三
                    if(matchRoleThird(resultList.get(j),lineList.get(i))){
                        String str = "rule3:"+lineList.get(i).getId()+"+"+resultList.get(j).getId();
                        result.add(str);
                    }
                }
            }
        }






        return result;
    }
public static class UnilateralLine {
private String id;
private String sCen;//出发分拨
private String sPro;//出发省
private String eCen;//到达分拨
private String ePro;//到达省
//9.6m/17.5m
private String tType;//车型
public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro,String tType) {
            this.id = id;this.sCen = sCen;this.sPro = sPro;this.eCen = eCen;this.ePro = ePro;this.tType = tType;}
public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getSCen() {return sCen;}
public void setSCen(String ePro) {this.ePro = ePro;}
public String getSPro() {return sPro;}
public void setSPro(String sPro) {this.sPro = sPro;}
public String getECen() {return eCen;}
public void setECen(String eCen) {this.eCen = eCen;}
public String getEPro() {return ePro;}
public void setEPro(String ePro) {this.ePro = ePro;}
public String getTType() {return tType;}
public void setTType(String tType) {this.tType = tType;}
}
}