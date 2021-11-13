public class Stack {

    private class Data{
        int value;
        Data next;

        public Data(int d){
            value = d;
        }
        public int getValue(){
            return value;
        }
        public Data getNext(){
            return next;
        }
        public void setNext(Data d){
            next = d;
        }


    }

    Data myData;
    public Stack(){}

    public void push(int i){
        Data d = new Data(i);
        d.setNext(myData);
        myData = d;
    }
    public void push(int[] i){
        for(int a = 0; a<i.length;a++){
            push(i[a]);
        }
    }
    public void empty(){
        myData = null;
    }
    public boolean isempty(){
        if(myData == null){
            return true;
        }
        return false;
    }
    public int peek(){
        return myData.getValue();
    }
    public void pop(){
        if(!isempty()){
            myData = myData.getNext();
        }
    }
    public void pop(int n){
        for(int i = 0; i<n; i++)
        {
            if(isempty()){
                break;
            }
            pop();
        }
    }
}
