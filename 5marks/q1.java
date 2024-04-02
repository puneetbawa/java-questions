import java.util.*; 
import java.io.*;
import java.util.Scanner; 
public class RainwaterTrapping {
public static int trap(int[] height) {
    int n = height.length;
    int leftMax = 0, rightMax = 0;
    int left = 0, right = n - 1;
    int trappedWater = 0;
    while (left < right) {
        if (height[left] < height[right]) {
            if (height[left] >= leftMax) {
                leftMax = height[left];
            } else {
                trappedWater += leftMax - height[left];
            }
            left++;
        } else {
            if (height[right] >= rightMax) {
                rightMax = height[right];
            } else {
                trappedWater += rightMax - height[right];
            }
            right--;
        }
    }
    return trappedWater;
}
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) { 
            height[i] = scanner.nextInt();
        }
        System.out.println(trap(height));
    }
}
