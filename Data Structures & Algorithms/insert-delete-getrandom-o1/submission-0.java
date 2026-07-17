class RandomizedSet {
    Map<Integer,Integer> set;
    private int size;
    public RandomizedSet() {
        set=new HashMap<>();
        size=0;
    }
    
    public boolean insert(int val) {
        if(set.containsKey(val)){
            return false;
        }
        set.put(val,0);
        size++;
        return true;
    }
    
    public boolean remove(int val) {
        if(set.containsKey(val)){
            set.remove(val);
            size--;
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int idx = new Random().nextInt(size);
        Iterator<Integer> it = set.keySet().iterator();
        while (idx-- > 0) {
            it.next();
        }
        return it.next();
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */