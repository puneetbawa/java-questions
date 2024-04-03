

import java.util.*; 
import java.io.*;
import java.util.Scanner; 

public class Main {
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
int n = scanner.nextInt();
int m = scanner.nextInt(); 
int[] a = new int[n];
for (int i = 0; i < n; i++) { 
a[i] = scanner.nextInt();
}
int[] b = new int[m];
for (int i = 0; i < m; i++) { 
b[i] = scanner.nextInt();
}
int result = doUnion(a, n, b, m); 
System.out.println(result); 
scanner.close();
}
public static int doUnion(int a[], int n, int b[], int m) { 
HashSet<Integer> s = new HashSet<>();
for (int i = 0; i < n; i++) s.add(a[i]);
for (int i = 0; i < m; i++) s.add(b[i]);
return s.size();
}
}
