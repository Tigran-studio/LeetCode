public class StudentAttendanceRecordI
{
    public static void main(String[] args)
    {
        System.out.println("The student is eligible equal:"+checkRecord("LLALL"));

    }
    public static boolean checkRecord(String s) {
        char absent = 'A';
        char late = 'L';
        int absentCounter = 0;
        int lateCounter = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)==absent)
                absentCounter++;
            if(s.charAt(i)==late)
                lateCounter++;
            else
                lateCounter=0;
        }
        return absentCounter <= 2 && lateCounter < 3;
    }
}