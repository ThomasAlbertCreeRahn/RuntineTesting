import java.io.*;
import java.lang.Runtime;

public class Main{
    public static void main(String[] args) throws IOException, InterruptedException {

        Process program;
        ProcessBuilder pb;
        pb = new ProcessBuilder("open", "src/RecordCamera.app");
        pb.redirectErrorStream(true);
        program = pb.start();
        BufferedReader input = new BufferedReader(new InputStreamReader(program.getInputStream()));
        String line = input.readLine();
        while (line != null) {
            System.out.println(line);
            line = input.readLine();
        }
        program.waitFor();
    }
}
