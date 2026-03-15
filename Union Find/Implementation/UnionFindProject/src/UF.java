public class UF {
    private int[] id; //array to store component ID of each object
    private int count; //to track how many connected components exist

    public UF(int N){//N is the number of objects
        count=N;
        id=new int[N];//initially N groups, total objects=total components
        for(int i=0;i<N;i++){
            id[i]=i;//sets each object to itself. Object's 0's id is 0
        }
    }
    public int count(){
        return count;//current number of components
    }
    public int find(int p){ return id[p];}
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    public void union(int p, int q){
        int pID = find(p);
        int qID = find(q);

        if (pID == qID) return;

        for(int i=0;i< id.length; i++){
            if (id[i]==pID){
                id[i]=qID;
            }
        }
        count--;
    }
}
