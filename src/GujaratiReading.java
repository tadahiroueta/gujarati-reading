// import java.io.*;
// import java.util.*;

// public class GujaratiReading {
// //            {"અ", "આ", "ઇ", "ઈ", "ઉ", "ઊ"}
// //            {"ə", "ɑ̈", "i", "i", "u", "u"}
//     private static ArrayList<ArrayList<String>> gujaratiSets = new ArrayList<ArrayList<String>>();
//     private static ArrayList<ArrayList<String>> readingSets = new ArrayList<ArrayList<String>>();

//     public static void main(String[] args) throws IOException {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Which configuration?\t");
//         int configuration = Integer.parseInt(scan.nextLine());
//         if (configuration >= gujaratiCharacters.length) {
//             String[] empty = {};
//             main(empty);
//             return;
//         }
//         String[] gujaratiSample = gujaratiCharacters[configuration];
//         String[] readingSample = readings[configuration];
//         int total = 0;
//         int correct = 0;
//         int randomI;
//         Random randomObject = new Random();
//         while (true) {
//             randomI = randomObject.nextInt(gujaratiSample.length);
//             System.out.print(gujaratiSample[randomI] + "\t");
//             String input = scan.nextLine();
//             if (input.equals("stop")) {
//                 System.out.println(correct + " / " + total);
//                 break;
//             }
//             else if (input.equals(readingSample[randomI])) {
//                 System.out.println("correct\n");
//                 correct++;
//             } else {
//                 System.out.println("incorrect; " + readingSample[randomI] + "\n");
//             }
//             total++;
//         }
//     }
// }
