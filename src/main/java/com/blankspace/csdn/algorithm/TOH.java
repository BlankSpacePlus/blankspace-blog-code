package com.blankspace.csdn.algorithm;

public class TOH {

    public int hanoi(int ringNum, int startRod, int endRod) {
        int moveNum = 0;
        if (ringNum > 0) {
            moveNum += hanoi(ringNum-1, startRod, 6-startRod-endRod);
            System.out.println("将" + ringNum + "圆盘从" + startRod + "杆移动到" + endRod + "杆");
            moveNum++;
            moveNum += hanoi(ringNum-1, 6-startRod-endRod, endRod);
        }
        return moveNum;
    }

    public static void main(String[] args) {
        TOH hanoi = new TOH();
        hanoi.hanoi(3, 1, 3);
    }

}
