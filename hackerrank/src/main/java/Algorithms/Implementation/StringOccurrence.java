import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringOccurrence {
    public static int getOccurrenceCount(String toSearch, InputStream stream) throws Exception {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
//        String result = new BufferedReader(new InputStreamReader(stream))
//                .lines().collect(Collectors.joining("\n"));

        InputStreamReader isReader = new InputStreamReader(stream);
        //Creating a BufferedReader object
        BufferedReader reader = new BufferedReader(isReader);
        StringBuffer sb = new StringBuffer();
        String str;
        while ((str = reader.readLine()) != null) {
            sb.append(str);
        }

        String result = sb.toString();

//        result = new String(stream.readAllBytes());
        result = result.replace(".", "").replace("?", "").replace("!", "").replace(",", "");
        String[] data = result.split(" ");

        int count = 0;
        for (String s : data) {
            if (toSearch.equals(s)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        String msg = "Hey! How are you?\nI am good, how about you?\nI am good too.";

        try (InputStream stream = new ByteArrayInputStream(msg.getBytes())) {
            System.out.println(StringOccurrence.getOccurrenceCount("good", stream));
        }
    }
}