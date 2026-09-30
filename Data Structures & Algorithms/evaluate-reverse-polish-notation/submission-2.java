class Solution {
    boolean isop(String s){
        if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
            return true;
        else 
             return false;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String c:tokens){
            if(isop(c)){
                int a=s.pop();
                int b=s.pop();
                if(c.equals("+")){
                    s.push(a+b);
                }else if(c.equals("-")){
                    s.push(b-a);
                }else if(c.equals("*")){
                    s.push(a*b);
                }else
                    s.push(b/a);
            }else{
                int n=Integer.parseInt(c);
                s.push(n);
            }
        }
        return s.pop();
    }
}
