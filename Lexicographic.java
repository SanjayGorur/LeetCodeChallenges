class Solution 
{
    public int findKthNumber(int n, int k) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        
        int index = arr.indexOf(n);
        ArrayList<Integer> list = new ArrayList<>();
        for(int num = 0; num < index + 1; num++)
        {
            list.add(arr.get(num));
        }
        
        Collections.sort(list);
        
        return list.get(k - 1);
    }
}
