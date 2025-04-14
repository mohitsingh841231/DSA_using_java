public class leetCode349 {
    
        public int[] intersection(int[] nums1, int[] nums2) {
            int x = 0;
            int[] temp = new int[Math.min(nums1.length, nums2.length)];
    
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j]) {
                        boolean exists = false;
                        for (int k = 0; k < x; k++) {
                            if (temp[k] == nums1[i]) {
                                exists = true;
                                break;
                            }
                        }
                        if (!exists) {
                            temp[x++] = nums1[i];
                        }
                        break; 
                    }
                }
            }
    
            
            int[] result = new int[x];
            for (int i = 0; i < x; i++) {
                result[i] = temp[i];
            }
    
            return result;
        }
    
    
}
