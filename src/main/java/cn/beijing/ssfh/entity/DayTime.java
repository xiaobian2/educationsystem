package cn.beijing.ssfh.entity;

public class DayTime {
    private Integer dayTimeId;

    private String timeRange;

    public Integer getDayTimeId() {
        return dayTimeId;
    }

    public void setDayTimeId(Integer dayTimeId) {
        this.dayTimeId = dayTimeId;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange == null ? null : timeRange.trim();
    }
}