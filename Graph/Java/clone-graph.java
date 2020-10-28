/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return node;
        Queue<Node> q=new LinkedList<>();
        q.offer(node);
        HashMap<Node,Node> hm=new HashMap<>();
        hm.put(node,new Node(node.val));
        while(!q.isEmpty()){
            Node tempNode=q.poll();
            for(Node neighbour: tempNode.neighbors ){
                if(!hm.containsKey(neighbour)){
                    Node copy=new Node(neighbour.val);
                    q.offer(neighbour);
                    hm.put(neighbour,copy);
                }
                hm.get(tempNode).neighbors.add(hm.get(neighbour));
            }
        }
        return hm.get(node);
    }
}