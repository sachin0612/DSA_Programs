public class Linear_Search{
    public static int search(int a[],int key){
        int k=-1;
        for(int i=0;i<a.length;i++){
            if(key==a[i])
            k=i;
        }
            return k;
    }
    public static void main(String[] args) {
        int a[]={5,4,1,6,8,2};
        int key=6;
        int res=Linear_Search.search(a,key);
        if(res==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index= "+res);
        }
        
    }
}