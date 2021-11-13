public class List {
    element head;
    public class element{
        private int myValue;
        private element myConnection;
        public element(int v){
            myValue = v;
        }
        public element getConnection(){
            return myConnection;
        }
        public void setConnection(element e){
            myConnection = e;
        }
        public int getValue(){
            return myValue;
        }
        public void setValue(int i){
            myValue = i;
        }

    }

    public List(){}

    public int length(){
        element element = head;
        int len = 1;
        while(element.getConnection() != null){
            len++;
            element = element.getConnection();
        }
        return len;
    }
    public void add(int i){
        element e = new element(i);
        if(head == null){
            head = e;
        }
        else{
           e.setConnection(head);
           head = e;
        }
    }
    public void formcycle(){
        element first = head;
        for(int x = 0; x<3; x++)
        {
            first = first.getConnection();
        }
        element second = first;
        for(int x = 0; x<3; x++)
        {
            second = first.getConnection();
        }
        second.setConnection(first);
    }
    public void add(int i, int n){
        if(n>this.length()) {
            throw new IndexOutOfBoundsException();
        }
        element newel = new element(i);
        element head  = this.head;
        for(int a = 1; a<n; a++){
            head = head.getConnection();
        }
        newel.setConnection(head.getConnection());
        head.setConnection(newel);
    }
    public void remove(int n){
        if(n>=this.length()) {
            throw new IndexOutOfBoundsException();
        }
        if(n == 0){
            head = head.getConnection();
        }
        else{
            element head  = this.head;
            for(int a = 1; a<n; a++){
                head = head.getConnection();
            }
            head.setConnection(head.getConnection().getConnection());
        }
    }
    public int getVal(){
        return head.getValue();
    }
    public int getVal(int n){
        if(n>=this.length()) {
            throw new IndexOutOfBoundsException();
        }
        element current = head;
        for(int i = 0; i<n; i++){
            current = current.getConnection();
        }
        return current.getValue();
    }
    public void print(){
        element head = this.head;
        for(int i=0; i<this.length(); i++){
            System.out.println(head.getValue());
            head = head.getConnection();
        }
    }
    public boolean checkcycles(){
        element c = this.head;
        while(true){
            if(c.getConnection() == null){
                return false;
            }
            element n = c.getConnection();
            while(true) {
                if (n.getConnection() == null) {
                    break;
                }
                if (n == c.getConnection()) {
                    return true;
                }
                n = n.getConnection();
            }
            c = c.getConnection();
        }
    }
}
