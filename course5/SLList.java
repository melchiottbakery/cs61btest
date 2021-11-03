public class SLList {
    private IntNode first;
    private class IntNode {

        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }

    }


    public SLList(int x) {
        first = new IntNode( x , null);
    }


    public void addFirst(int x ) {
        first = new IntNode (x , first);
    }

    public int getFirst(){
        return first.item;
    }


    public static void  main (String[] args){
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        System.out.println(L.getFirst());

        }


}