package testPackage;

public class SwapBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		//swapBits(num);
		int n = 20;
		int[] ar = {4,5,5,5,6,6,4,1,4,4,3,6,6,3,6,1,4,5,5,5};
		int[] cnt = new int[100];	//100 came from M-m+1 ie 100-1+1
        for(int i =0; i < cnt.length; i++) {
            cnt[i] = 0; 
        }
        for(int i = 0; i < n; i++) {
            cnt[ar[i]-1]++;
        }
        for(int j = 0; j < cnt.length; j++) {
        	System.out.print(cnt[j]+" ");
        }
        System.out.println();
        int count = 0;
        for(int j = 0; j < cnt.length; j++) {
        	if(cnt[j] >= 2) {
        		count += cnt[j]/2;
        	}
        }
        
        System.out.println(count);
	}

	private static void swapBits(int num) {
		int odd = num & 0x55;
		int even = num & 0xAA;
		even = even >> 1;
		odd = odd << 1;
		System.out.println(even|odd);
	}

}
