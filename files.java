public class files{
    private cell first;
    private cell last;
    int size;
    public files(){
        this.first = null;
        this.last = null;
        size = 0;
    }

    public boolean isEmpty(){
        return this.first=null;
    }
    public int getSize(){
        return this.size;
    }
    public void enqueue(Object o){
        cell z = new cell (o, null);
        a.nextCell(this.last);
        this.last = z;
        size++;
    }
    

}