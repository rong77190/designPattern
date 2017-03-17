package dataStructure.binTree;


import dataStructure.List.List;
import dataStructure.List.ListArray;

/**
 * Created by Administrator on 2017/3/16/016.
 */
public class Huffman extends BinTreeNode {
    private  int weight;//权值
    private String coding = "";

    public Huffman(int weight){
        this(weight,null);
    }
    public Huffman(int weight,Object e){
        super(e);
        this.weight = weight;

    }
    public Huffman getParent(){
        return (Huffman) super.getParent();
    }
    public Huffman getLChild(){
        return (Huffman) super.getLChild();
    }
    public Huffman getRChild(){
        return (Huffman) super.getRChild();
    }
    public int getWeight(){
        return weight;
    }
    public String getCoding(){
        return coding;
    }
    public void setCoding(String coding){
        this.coding = coding;
    }
    //通过节点数生成huffman树
    public static Huffman buildHuffmanTree(Huffman[] nodes){
        int n = nodes.length;
        if (n < 2)return nodes[0];
        List l = new ListArray();
        for (int i = 0;i < n;i++){
            insertToList(l,nodes[i]);
        }
        for (int i = 0; i < n; i++){
            Huffman min1 = (Huffman)l.remove(l.getSize()-1);
//            Huffman min2 = (Huffman)l.remove(l)
        }
        return null;
    }
    public static void insertToList(dataStructure.List.List l, Huffman huffman){
       for (int j = 0; j < l.getSize(); j++){
           if (huffman.getWeight() > ((Huffman)l.get(j)).getWeight()){
               l.insert(j,huffman);
               return;
           }
       }
        l.insert(l.getSize(),huffman);
    }

}
