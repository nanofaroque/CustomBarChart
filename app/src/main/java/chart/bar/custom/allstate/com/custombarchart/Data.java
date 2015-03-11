package chart.bar.custom.allstate.com.custombarchart;

/**
 * Created by ofaro on 3/11/2015.
 */
public class Data {
    private String totalVal;
    private float firstVal;
    private float secondVal;
    private float thirdVal;
    private String day;

    public Data(String totalVal, float firstVal, float secondVal, float thirdVal,String day) {
        this.totalVal = totalVal;
        this.firstVal = firstVal;
        this.secondVal = secondVal;
        this.thirdVal = thirdVal;
        this.day=day;
    }

    public String getTotalVal() {
        return totalVal;
    }

    public void setTotalVal(String totalVal) {
        this.totalVal = totalVal;
    }

    public float getFirstVal() {
        return firstVal;
    }

    public void setFirstVal(float firstVal) {
        this.firstVal = firstVal;
    }

    public float getSecondVal() {
        return secondVal;
    }

    public void setSecondVal(float secondVal) {
        this.secondVal = secondVal;
    }

    public float getThirdVal() {
        return thirdVal;
    }

    public void setThirdVal(float thirdVal) {
        this.thirdVal = thirdVal;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
