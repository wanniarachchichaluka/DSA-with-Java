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
    public int find()
}
