
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeekCount = { 0, 2, 5, 3, 7, 8, 4};
        return lastWeekCount;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
      birdsPerDay[6] += 1;
    }


    public boolean hasDayWithoutBirds() {
      for(int count : birdsPerDay) {
          if(count == 0) {
              return true;
          }
      }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
    int runningTotal = 0;
    for (int i = 0; i < birdsPerDay.length && i < numberOfDays; i++ ) {
        runningTotal += birdsPerDay[i];
    }
       return runningTotal;
    }

    public int getBusyDays() {
        int busyDaysSum = 0;
       for (int count : birdsPerDay) {
           if (count >= 5) {
               busyDaysSum += 1;
           }
       }
           return busyDaysSum;
       }
    }

