package JavaproTest.TestPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

class Test {
    public static void main(String[] args) throws Exception {
    }

    class method {
        public void SplitData(String path1, String path2) {

            int count = 0;
            int index = 0;
            BufferedReader br = null;
            BufferedWriter[] bws = new BufferedWriter[500];
            Map<String, Integer> map = new HashMap<String, Integer>();
            try {
                File f = new File(path1);
                String[] filename = f.list();
                for (int i = 0; i < filename.length; i++) {
                    br = new BufferedReader(new FileReader(path1 + filename[i]));
                    String line = null;
                    while ((line = br.readLine()) != null && !line.startsWith("id")) {
                        String id = line.split("\t")[0].trim();
                        index++;
                        if (index % 1000000 == 0) {
                            System.out.println("已处理的行数：" + index);
                        }
                        if (!map.containsKey(id)) {
                            count++;
                            int value = count / 20000;
                            map.put(id, value);
                        }
                        int num = map.get(id);
                        if (bws[num] == null) {
                            bws[num] = new BufferedWriter(new FileWriter(path2
                                    + num + ".txt"));
                        }
                        bws[num].write(line + "\n");
                        if (count % 10000 == 0) {
                            for (BufferedWriter bw : bws) {
                                if (bw != null)
                                    bw.flush();
                            }
                        }
                    }
                    System.out.println("文件" + filename[i] + "处理完成!");
                    System.out.println("处理的记录数：" + count);
                    br.close();
                }
                for (BufferedWriter bw : bws) {
                    if (bw != null) {
                        bw.flush();
                        bw.close();
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
