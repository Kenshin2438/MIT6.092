import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader("assn7/" + pathName));

        List<List<Integer>> grid = new ArrayList<List<Integer>>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\t");
            List<Integer> row = new ArrayList<>();
            for (String part : parts) {
                row.add(Integer.parseInt(part));
            }
            grid.add(row);
        }
        reader.close();

        int n = grid.size();
        int m = grid.get(0).size();
        if (n != m) {
            return false;
        }
        for (List<Integer> row : grid) {
            if (row.size() != m) {
                return false;
            }
        }

        int lastSum = -1;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += grid.get(i).get(j);
            }
            if (lastSum == -1) {
                lastSum = sum;
            } else if (lastSum != sum) {
                return false;
            }
        }
        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += grid.get(i).get(j);
            }
            if (lastSum == -1) {
                lastSum = sum;
            } else if (lastSum != sum) {
                return false;
            }
        }
        {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += grid.get(i).get(i);
            }
            if (lastSum == -1) {
                lastSum = sum;
            } else if (lastSum != sum) {
                return false;
            }
        }
        {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += grid.get(i).get(m - 1 - i);
            }
            if (lastSum == -1) {
                lastSum = sum;
            } else if (lastSum != sum) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}
