public class MarkSheet {
    public static void main(String[]args){
        int english = 89;
        int science = 90;
        int maths = 98;
        int sanskrit =90;
        int hindi = 98;
        int total_marks = english+ science+ maths+sanskrit+hindi;
        double percentage = (double) total_marks/5;
        System.out.println("=========================================================================");
        System.out.println("|                   Maharashtra State Board of                          |");
        System.out.println("|           Secondary School Examination Certificate                    |");
        System.out.println("=========================================================================");
        System.out.println("| Division Board|Seat No.| Centre no.| School No.|Sr. No. of Certificate|");
        System.out.println("| Mumbai        |B085882 | 0111      | 33.087    | 128271               |");
        System.out.println("=========================================================================");
        System.out.println("| Main Subjects | Max. Marks    | Marks Obtained                        |");
        System.out.println("| English       | 100           |"+ english +  "                                     |");
        System.out.println("| Science       | 100           |"+ science +  "                                     |");
        System.out.println("| Maths         | 100           |"+ maths   +  "                                     |");
        System.out.println("| Sanskrit      | 100           |"+ sanskrit +  "                                     |");
        System.out.println("| Hindi         | 100           |"+ hindi    +  "                                     |");
        System.out.println("=========================================================================");
        System.out.println("| Total Marks   | "+total_marks+"                                                   |");
        System.out.println("| Percentage    |  "+percentage+"                                                 |");
        System.out.println("=========================================================================");











    }
}
