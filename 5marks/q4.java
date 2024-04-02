import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CommonElementsInSortedLists {
    public static List<Integer> findCommonElements(List<List<Integer>> lists) {
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (List<Integer> list : lists) {
            for (int num : list) {
                elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> commonElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() == lists.size()) {
                commonElements.add(entry.getKey());
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lists (k):");
        int k = scanner.nextInt();

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            System.out.println("Enter the number of elements in list " + (i + 1) + ":");
            int n = scanner.nextInt();

            List<Integer> list = new ArrayList<>();
            System.out.println("Enter the elements of list " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            lists.add(list);
        }

        System.out.println("Common elements in all lists: " + findCommonElements(lists));

        scanner.close();
    }
}
