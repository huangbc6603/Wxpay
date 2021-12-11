package com.github.wxpay.sdk;

/**
 * @author huangbc
 * @version 1.0
 * @date 2021/12/11 7:49
 */
public class Month {
    //周一到周日
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thrusday;
    private String friday;
    private String saturday;
    private String sunday;
    //一月到十二月
    private String january;//monday
    private String faburary;//tuesday
    private String march;//wednesday
    private String april;//thuresday
    private String may;//friday
    private String june;//saturday
    private String july;//sunday
    private String august; //八月
    private String september;//九月
    private String actober;//十月
    private String november;//十一月
    private String december;//十二月

// 一、zero、one、、two、、three、、four、five、six、seven、eight、nine、ten。（0—10）
// 二、eleven、twelve、thirteen、fourteen、fifteen、sixteen、seventeen、eighteen、nineteen。（10—19）
// 三、twenty、twenty-one、twenty-two、twenty-three、twenty-four、twenty-five、twenty-six、
// twenty-seven、twenty-eight、twenty-nine。（20—29）     　　
// 四、thirty、thirty-one、thirty-two、thirty-three、thirty-four、thirty-five、
// thirty-six、thirty-seven、thirty-eight、thirty-nine。（30—39）
//五、forty、forty-one、forty-two、forty-three、forty-four、forty-five、forty-six、
// forty-seven、forty-eight、forty-nine。（40—49）
// 六、fifty、fifty-one、fifty-two、fifty-three、fifty-four、fifty-five、fifty-six、
// fifty-seven、fifty-eightfifty-nine（50—59）
// 七、sixty、sixty-one、sixty-two、sixty-three、sixty-four、sixty-five、
// sixty-six、sixty-seven、sixty-eight、sixty-nine。（60—69）
//八、seventy、seventy-one、seventy-two、seventy-three、seventy-four、seventy-five、
// seventy-six、seventy-seven、seventy-eight、seventy-nine。（70—79）
//九、eighty、eighty-one、eighty-two、eighty-three、eighty-foureighty-five、
// eighty-six、eighty-seven、eighty-eight、eighty-nine。（90——）
//十、onehundred（100）
//一月 January、//二月 Feburary、//三月 March、
//四月 April、//五月 May、//六月 June、
//七月 July、//八月 August、//九月 September、
//十月 October、//十一月 November、//十二月 December
//星期一：Monday、星期二：Tuesday、星期三：Wednesday、
// 星期四：Thursday星期五：Friday、星期六：Saturday、
// 星期日：Sunday

    public static void eat() {
        System.out.println("吃饭....");
    }

    public static void eat(String s, int a) {
        System.out.println("重载...");
    }

}
