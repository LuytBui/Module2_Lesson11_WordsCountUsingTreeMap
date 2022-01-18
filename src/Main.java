import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        String sentence = "Module Advanced Programming with Java giúp học viên nắm vững " +
                "các khái niệm và kỹ thuật cốt lõi trong lập trình, nâng cao tư duy và " +
                "kỹ năng lập trình. Kết thúc module này, học viên thành thạo việc phát " +
                "triển các ứng dụng dựa trên ngôn ngữ Java, mô hình lập trình Hướng đối tượng " +
                "và Cấu trúc dữ liệu và giải thuật.";

        Map<String, Integer> treemap = new TreeMap<>();
        String[] arr = sentence.toLowerCase().split(" ");


        for (String s : arr) {
            if (treemap.containsKey(s)) {      // nếu trong map đã có key s thì tăng value lên 1
                int count = treemap.get(s);
                treemap.replace(s, count + 1);
            } else {                            // nếu chưa có thì đặt entry (s, 1) vào trong map
                treemap.put(s, 1);
            }
        }


        // in ra map
        treemap.entrySet().forEach(entry -> {
            System.out.println("Từ \"" + entry.getKey() + "\" xuất hiện " + entry.getValue() +  " lần");
        });

    }
}
