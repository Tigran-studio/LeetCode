public class StudentAttendanceRecordI
{
    public static boolean checkRecord(String s)
    {
        char absent = 'A';
        char late = 'L';
        int absentCounter = 0;
        int lateCounter = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i)==absent)
                absentCounter++;
            if(s.charAt(i)==late)
            {
                lateCounter++;
                if(lateCounter==3)
                    return false;
            }
            else
                lateCounter=0;
        }
        return absentCounter < 2 && lateCounter < 3;
    }
}