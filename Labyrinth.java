package com.ohgiraffers.PR.Escape_to_the_Labyrinth;

public class Labyrinth {

    Option opt = new Option();
    MiniGame mGame = new MiniGame();
    int nowLocation;

    public void mainLaby () {
        realStart();
        while (true) {
            if (nowLocation == 0) {
                startPoint();
            } else if (nowLocation == 40) {
                goalPoint();
                System.out.println();
                opt.finishGame();
            } else if (nowLocation == 01 || nowLocation == 27 || nowLocation == 30 || nowLocation == 31) {
                goldPoint();
                System.out.println();
                mGame.miniGameRPSStart();
            } else {
                defPoint();
                // 포인트가 아닌 곳은 항상 여기로 롤백되어서 nowLocation 확인해서 맞는 걸로 출력
            }
            // 본격적인 시작하는 메소드로 넘어가기
            opt.defaultOption();

            //nowLocation 이동하기
        }
    }

    public void realStart() {
        // 첫 시작(최초 1회만)에 출력
        Application.line();
        System.out.println("미로 탈출을 시작합니다.");
    }

//    public void pointDivision() {
//        if ()
//    }


    // 포인트가 되는 것 4개
    public void startPoint() {
        System.out.println("[ 시작 지점 ]");
    }

    public void goldPoint() {
        System.out.println("[ ! 미니 게임 ! ]");
    }

    public void goalPoint() {
        System.out.println("[ 탈출구 ]");
    }

    public void defPoint() {
        System.out.println("[ ??? ]");
    }

    public void laby01 () {
        defPoint();
        System.out.println();
    }



    /*
                E  	  				   			  	   40
        ┌────┘    ├───────────────────┐			┌────┘    ├───────────────────┐
        │ G       │                   │			│ 01   02 │ 03   04   05   06 │
        ├────┐    │    │    ┌─────    │			├────┐    │    │    ┌─────    │
        │    │    │    │    │         │			│ 07 │ 08 │ 09 │ 10 │ 11   12 │
        │    │    │    │    │    ─────┤			│    │    │    │    │    ─────┤
        │    │    │    │    │         │			│ 13 │ 14 │ 15 │ 16 │ 17   18 │
        │    │    │    │    │    │    │			│    │    │    │    │    │    │
        │              │    │    │    │			│ 19   20   21 │ 22 │ 23 │ 24 │
        ├─────    ┌────┴────┘    │    │			├─────    ┌────┴────┘    │    │
        │         │ G            │ G  │			│ 25   26 │ 27   28   29 │ 30 │
        │    ┌────┴──────────    └────┤			│    ┌────┴──────────    └────┤
        │ G  │                        │			│ 31 │ 32   33   34   35   36 │
        └────┴──────────────┐    ┌────┘			└────┴──────────────┐    ┌────┘
                               S					  	  			  00
*/


}
