class DynamicArray {
    private int[] arrayList;
    private int len;
    private int capacity;
    public DynamicArray(int capacity) {
        this.capacity=capacity;
        this.len=0;
        this.arrayList=new int[this.capacity];
    }

    public int get(int i) {
    
        return arrayList[i];
    }

    public void set(int i, int n) {
        arrayList[i]=n;
    }

    public void pushback(int n) {
        if (len==capacity){
            resize();
        }
        arrayList[len]=n;
        len++;
    }

    public int popback() {
        if(len>0){
            len--;
        }
        return arrayList[len];

    }

    private void resize() {
        capacity*=2;
        int []newArr=new int[capacity];
        for(int i=0;i<len;i++){
            newArr[i]=arrayList[i];
        }
        arrayList=newArr;
    }

    public int getSize() {
        return len;
    }

    public int getCapacity() {
        return capacity;
    }
}
