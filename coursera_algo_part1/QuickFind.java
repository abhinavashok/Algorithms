class QuickFind{
    /**
    Two operations:
    1.union
    2.isConnected

    Index:		 1,2,3,4,5,6,7,8

    Value in array : 1,2,3,4,5,6,7,8

    Union(4,8),Union(3,7),Union(7,8),Union(1,2)

    Points state after above operation:
        1   2	3	4
		        |	|
        5	6	7___8

        
    isConnected(3,8) : True
    isConnected(1,8) : False
    
    Write a program to perform union and isconnected operations as can be seen
    in the above explanation
     */

    private int[] id;
    
    public QuickFind(int size){
        id = new int[size];
        initialize();
    }

    private void initialize(){
        for(int i=0;i<id.length;i++){
            id[i] = i;
        }
    }

    public void union(int node1,int node2){
        int previous = id[node1];
        int current = id[node2];

        if(previous == current){
            return;
        }

        for(int i=0;i<id.length;i++){
            if(id[i] == previous){
                id[i] = node2;
            }
        }


    }

    public boolean isConnected(int node1,int node2){
        return (id[node1] == id[node2]);
    }
    
    public static void main(String[] args) {
        QuickFind inst = new QuickFind(8);
        inst.union(4,7);
        inst.union(5,7);
        inst.printIds();
        inst.union(7,0);
        inst.printIds();
        System.out.println(inst.isConnected(0,7));
    }
}