package homework;

public class Scene {
    Monster toad;//蛤蟆精
    Monster centipede;//蜈蚣精
    Monster spider;//蜘蛛精
    Monster pinkbat;//粉色蝙蝠精
    Monster yellowbat;//黄色蝙蝠精
    SixthGourdBaby sixthGourdBaby;//六娃
    Flagon flagon;//酒壶
    Gate gate;//大门
    Nail nail;//大门上的钉子
    SpiderWeb spiderweb;//蜘蛛网

    public Scene(){
        toad=new Monster(25,5,0,1);
        centipede=new Monster(50, 10, 0, 1);
        spider=new Monster(25, 5, 0, 1);
        pinkbat=new Monster(25, 5, 0, 1);
        yellowbat=new Monster(25, 5, 0, 1);
        sixthGourdBaby=new SixthGourdBaby();
        flagon=new Flagon();
        gate=new Gate();
        nail=new Nail();
        spiderweb=new SpiderWeb();
    }

    public void play(){
        centipede.speakTo(toad, "喂，你留点神，好好的把好这一门！");
        toad.blink();
        toad.speakTo(centipede, "你算老几，多管闲事！");
        sixthGourdBaby.blink();
        toad.speakTo(centipede, "这儿有我把门，谁也进不来！");
        sixthGourdBaby.listen("这里只有蛤蟆在守门");
        toad.speakTo(centipede, "你还是自己管好自己，别像上回那样再掉进网里了！");
        toad.laughAtSomeone(centipede);
        centipede.touchHead();
        centipede.bePissed();
        centipede.move();

        sixthGourdBaby.touchHead();
        sixthGourdBaby.LeverageObject(flagon, "pick up");
        sixthGourdBaby.sniff(flagon);
        sixthGourdBaby.blink();
        sixthGourdBaby.rolleyes();
        sixthGourdBaby.smile();
        sixthGourdBaby.LeverageObject(flagon, "incline");
        flagon.emitFragrance();
        toad.sniff(flagon);
        toad.smile();
        toad.speakTo(toad, "好香啊！");
        toad.LeverageObject(gate, "open");
        gate.open();
        sixthGourdBaby.useSkill();
        sixthGourdBaby.LeverageObject(gate, "enter");
        toad.LeverageObject(flagon, "pick up");
        toad.LeverageObject(gate, "close");
        gate.close();
        toad.LeverageObject(flagon, "dump");
        sixthGourdBaby.smile();
        toad.speakTo(toad, "去你的！");
        toad.LeverageObject(flagon, "kick away");
        flagon.rollWithNoise();

        pinkbat.listen("the noise made by the flagon");
        centipede.listen("the noise made by the flagon");
        pinkbat.speakTo(toad, "谁？");
        centipede.speakTo(toad, "谁？");
        centipede.rolleyes();
        toad.laughAtSomeone(centipede);
        toad.laughAtSomeone(pinkbat);
        toad.speakTo(pinkbat, "我扔了个空酒壶，又惹到你们了，大惊小怪！");
        toad.speakTo(centipede, "我扔了个空酒壶，又惹到你们了，大惊小怪！");
        pinkbat.bePissed();
        centipede.bePissed();
        toad.sleep();

        sixthGourdBaby.useSkill();
        sixthGourdBaby.LeverageObject(nail, "pull out");
        nail.bounce();
        centipede.speakTo(pinkbat, "你在这守着，别走开！");
        centipede.move();
        centipede.speakTo(yellowbat, "可别打盹，把眼睛睁大点儿，哼！");
        nail.bounce();
        centipede.move();
        centipede.LeverageObject(nail, "step on");
        centipede.jump();
        centipede.receiveAttack(5);
        centipede.LeverageObject(spiderweb, "fall into");
        spider.LeverageObject(spiderweb, "pull");
        spiderweb.shrink();
        centipede.speakTo(spider, "是我！快放开我！");
        toad.speakTo(centipede,"哈哈！又掉进网里了吧！");
        pinkbat.beShocked();
        centipede.speakTo(spider, "快放开我！又是你这个瞎了眼的混蛋！");

        sixthGourdBaby.move();
        sixthGourdBaby.cancleSkill();
        sixthGourdBaby.smile();
        sixthGourdBaby.useSkill();
        sixthGourdBaby.move();
    } 

    public static void main(String[] args) {
        new Scene().play();
    }
}
