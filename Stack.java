public class Stack{
    private cell top;
    private int size;

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        if (this.top == null && this.size == 0){
            return true;
        }
      return false;  
    }

    public int getSize(){
        return this.size;
    }

    public void push(Object o){
        cell a = new cell(o,this.top);
        this.top = a;
        this.size++;
    }
        
    public Object pop(){
        cell anc = this.top;
        this.top = anc.getNextCell();
        this.size--;
        return anc;

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (String s : args) {
            if (s.equals("+")) {
                int a = (int)stack.pop();
                int b = (int)stack.pop();
                stack.push(a+b);
            } else if (s.equals("x")) {
                // Note : si on veut indiquer la multiplication avec *, 
                // il faut l'Ã©chapper sur la ligne de commande.
                int a = (int)stack.pop();
                int b = (int)stack.pop();
                stack.push(a*b);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        System.out.println((int)stack.pop());
    }
}

    
