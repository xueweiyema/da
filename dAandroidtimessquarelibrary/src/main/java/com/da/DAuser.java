package com.da;

import android.content.Context;

import com.squareup.timessquare.R;

import java.text.ParseException;
import java.util.Date;

public class DAuser {

    private static final String TAG = "DAuser";
    private String mTeam;
    private String mStation;
    private String[] mTeams;
    private String[] mDuties;
    private String[] mStations;
    private int mT;
    private int mS;

    public DAuser(Context context) {
        mTeams = context.getResources().getStringArray(R.array.teams);
        mDuties = context.getResources().getStringArray(R.array.duties);
        mStations = context.getResources().getStringArray(R.array.stations);
    }

    public String getmTeam() {
        return mTeam;
    }

    public void setmTeam(int mT) {
        this.mT = mT;
        this.mTeam = mTeams[mT];
    }

    public int getmT() {
        return mT;
    }

    public String getmStation() {
        return mStation;
    }

    public void setmStation(int mS) {
        this.mS = mS;
        this.mStation = mStations[mS];
    }

    public int getmS() {
        return mS;
    }

    public String getDuty(Date d) {


        String mDuty = mDuties[0];

        switch (mS) {

            case 0:
                int subtraction = datebetween(d, 5);
                // Log.i(TAG, "subtraction==" + subtraction);
                // 茂盛围
                switch (mT) {
                    case 0:
                        // 1队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[5]; // 晚班
                                break;
                            case 1:
                                mDuty = mDuties[4]; // 中班
                                break;
                            case 2:
                                mDuty = mDuties[3]; // 早班
                                break;
                            case 3:
                                mDuty = mDuties[7]; // 下通宵
                                break;
                            case 4:
                                mDuty = mDuties[1]; // 休息
                                break;
                            default:
                                break;
                        }

                        break;
                    case 1:
                        // 2队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[3]; // 早班
                                break;
                            case 1:
                                mDuty = mDuties[7]; // 下通宵
                                break;
                            case 2:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 3:
                                mDuty = mDuties[5]; // 晚班
                                break;
                            case 4:
                                mDuty = mDuties[4]; // 中班
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        // 3队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[7]; // 下通宵
                                break;
                            case 1:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 2:
                                mDuty = mDuties[5]; // 晚班
                                break;
                            case 3:
                                mDuty = mDuties[4]; // 中班
                                break;
                            case 4:
                                mDuty = mDuties[3]; // 早班
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        // 4队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[4]; // 中班
                                break;
                            case 1:
                                mDuty = mDuties[3]; // 早班
                                break;
                            case 2:
                                mDuty = mDuties[7]; // 下通宵
                                break;
                            case 3:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 4:
                                mDuty = mDuties[5]; // 晚班
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        // 5队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 1:
                                mDuty = mDuties[5]; // 晚班
                                break;
                            case 2:
                                mDuty = mDuties[4]; // 中班
                                break;
                            case 3:
                                mDuty = mDuties[3]; // 早班
                                break;
                            case 4:
                                mDuty = mDuties[7]; // 下通宵
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;

            case 1:
                subtraction = datebetween(d, 5);
                // Log.i(TAG, "subtraction==" + subtraction);
                // 横琴
                switch (mT) {
                    case 0:
                        // 1队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 1:
                                mDuty = mDuties[4]; // 中班
                                break;
                            case 2:
                                mDuty = mDuties[3]; // 早班
                                break;
                            case 3:
                                mDuty = mDuties[5];// 晚班
                                break;
                            case 4:
                                mDuty = mDuties[7];// 下通宵
                                break;
                            default:
                                break;
                        }
                        break;
                    case 1:
                        // 2队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[3]; // 早班
                                break;
                            case 1:
                                mDuty = mDuties[5];// 晚班
                                break;
                            case 2:
                                mDuty = mDuties[7];// 下通宵
                                break;
                            case 3:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 4:
                                mDuty = mDuties[4]; // 中班
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        // 3队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[7];// 下通宵
                                break;
                            case 1:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 2:
                                mDuty = mDuties[4]; // 中班
                                break;
                            case 3:
                                mDuty = mDuties[3]; // 早班
                                break;
                            case 4:
                                mDuty = mDuties[5];// 晚班
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        // 4队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[3]; // 早班
                                break;
                            case 1:
                                mDuty = mDuties[5];// 晚班
                                break;
                            case 2:
                                mDuty = mDuties[7];// 下通宵
                                break;
                            case 3:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 4:
                                mDuty = mDuties[4]; // 中班
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        // 5队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[5];// 晚班
                                break;
                            case 1:
                                mDuty = mDuties[7];// 下通宵
                                break;
                            case 2:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 3:
                                mDuty = mDuties[4]; // 中班
                                break;
                            case 4:
                                mDuty = mDuties[3]; // 早班
                                break;
                            default:
                                break;
                        }
                        break;


                    default:
                        break;
                }
                break;
            case 2:
                subtraction = datebetween(d, 4);
                //拱北
                switch (mT) {
                    case 0:
                    case 5:
                        // 1队和6队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[3];// 早班
                                break;
                            case 1:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 2:
                                mDuty = mDuties[5]; // 晚班
                                break;
                            case 3:
                                mDuty = mDuties[4]; // 中班
                                break;
                            default:
                                break;
                        }
                        break;
                    case 1:
                    case 6:
                        // 2队和7队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[5]; // 晚班
                                break;
                            case 1:
                                mDuty = mDuties[4]; // 中班
                                break;
                            case 2:
                                mDuty = mDuties[3];// 早班
                                break;
                            case 3:
                                mDuty = mDuties[1]; // 休息
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                    case 7:
                        // 3队和8队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 1:
                                mDuty = mDuties[5]; // 晚班
                                break;
                            case 2:
                                mDuty = mDuties[4]; // 中班
                                break;
                            case 3:
                                mDuty = mDuties[3];// 早班
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                    case 4:
                        // 4队和5队
                        switch (subtraction) {
                            case 0:
                                mDuty = mDuties[4]; // 中班
                                break;
                            case 1:
                                mDuty = mDuties[3];// 早班
                                break;
                            case 2:
                                mDuty = mDuties[1]; // 休息
                                break;
                            case 3:
                                mDuty = mDuties[5]; // 晚班
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
        return mDuty;
    }

    // 计算间隔天数
    private int datebetween(Date d, int i) {
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
        Long tempday = null;
        int days = 0;
        try {
            java.util.Date beginDate = format.parse("2011-10-30");
            tempday = (d.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        days = tempday.intValue();
        System.out.println("相隔的天数=" + days);
        if (days % i < 0) {
            return days % i + i;
        } else {
            return days % i;
        }
    }
}
