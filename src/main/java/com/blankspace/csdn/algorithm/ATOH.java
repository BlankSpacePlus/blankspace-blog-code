package com.blankspace.csdn.algorithm;

public class ATOH {

    public int aHanoi(int ringNum, int startRod, int endRod) {
        int moveNum = 0;
        if (ringNum == 1) {
            System.out.println("将" + ringNum + "圆盘从" + startRod + "杆移动到" + (6-startRod-endRod) + "杆");
            System.out.println("将" + ringNum + "圆盘从" + (6-startRod-endRod) + "杆移动到" + endRod + "杆");
            moveNum+=2;
        } else {
            moveNum += aHanoi(ringNum-1, startRod, endRod);
            System.out.println("将" + ringNum + "圆盘从" + startRod + "杆移动到" + (6-startRod-endRod) + "杆");
            moveNum++;
            moveNum += aHanoi(ringNum-1, endRod, startRod);
            System.out.println("将" + ringNum + "圆盘从" + (6-startRod-endRod) + "杆移动到" + endRod + "杆");
            moveNum++;
            moveNum += aHanoi(ringNum - 1, startRod, endRod);
        }
        return moveNum;
    }

    public static void main(String[] args) {
        ATOH hanoi = new ATOH();
        hanoi.aHanoi(3, 1, 3);
    }

}
