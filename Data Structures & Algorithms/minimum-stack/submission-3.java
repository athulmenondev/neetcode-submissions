class MinStack {
    int min=Integer.MAX_VALUE;
    class node{
        int val;
        int cur_min;
        public node(int val){
            this.val=val;
            this.cur_min=min;
        }
    }
    Stack<node> s;
    public MinStack() {
        s= new Stack<>();
    }
    
    public void push(int val) {
        if(val<min){
            min=val;
        }
        s.push(new node(val));
    }
    
    public void pop() {
        node n=s.pop();
        if(s.isEmpty())
            min=Integer.MAX_VALUE;
        else
        min=s.peek().cur_min;
    }

    public int top() {
        node n=s.peek();
        return n.val;
    }
    
    public int getMin() {
        node n=s.peek();
        return n.cur_min;
    }
}
