package dataStructure.graph;

import dataStructure.List.Iterator;
import dataStructure.List.LinkList.LinkedList;
import dataStructure.List.LinkList.LinkedListDLNode;
import dataStructure.Node;

/**
 * Created by Administrator on 2017/3/23/023.
 */
public class DirectGraph extends AbstractGraph {
    public int getType() {
        return 0;
    }

    public int getVexNum() {
        return 0;
    }

    public int getEdgeNum() {
        return 0;
    }

    public Iterator getVertex() {
        return null;
    }

    public Iterator getEdge() {
        return null;
    }

    public void remove(Vertex v) {

    }

    public void remove(Edge e) {

    }

    public Node insert(Vertex v) {
        return null;
    }

    public Node insert(Edge e) {
        return null;
    }

    public boolean areAdjacent(Vertex u, Vertex v) {
        return false;
    }

    public Edge edgeFromTo(Vertex u, Vertex v) {
        return null;
    }

    public Iterator adjVertexs(Vertex u) {
        return null;
    }

    public Iterator DFSTraverse(Vertex v) {
        LinkedList l = new LinkedListDLNode();//遍历结果
//        resetVexStatus();
        return null;
    }

    public Iterator BFSTraverse(Vertex v) {
        return null;
    }

    public Iterator shortestPath(Vertex v) {
        return null;
    }

    public void generateMST() throws UnsupportedOperation {

    }

    public Iterator toplogicalSort() throws UnsupportedOperation {
        return null;
    }

    public void criticalPath() throws UnsupportedOperation {

    }
}
