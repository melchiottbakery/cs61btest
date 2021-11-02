

public class LIST {

    public int first;
    public LIST rest;
    public LIST ( int f, LIST r){
        first = f;
        rest =r;

    }

    public int get(int i){
       if (i==0) {
           return first;
        }
        return rest.get(i-1);
    }



    public  static void main(String[] args) {

        LIST L = new LIST(15, null);
        L = new LIST(10, L);
        L = new LIST(5 ,L );

        System.out.println(L.get(2));
        //L.first =5 ;
       // L.rest = null;
       // L.rest = new LIST();
       // L.rest.first=10;

       // LIST L = new LIST(5, null);
       // L.rest = new LIST(10, null);
       // L.rest.rest = new LIST(15, null);
    }


}

