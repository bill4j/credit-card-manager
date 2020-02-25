package com.company;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //     LocalDate today = LocalDate.now();
        LocalDate today = LocalDate.of(2020,2,17);

        int year = today.getYear();
Month month = today.getMonth();
        int dayOfMonth = today.getDayOfMonth();
        LocalDate BillingDay =  LocalDate.of(year, month, dayOfMonth);
        System.out.println(today.plusDays(20));

    }

    /**
     * 计算最长免息期
     * @param billingDay
     * @param supportedBank
     * @return
     */
    private static int maximumInterestFreePeriod(String billingDay,String supportedBank) {
        return 0;
    }

    /**
     * 计算最近还款日
     * @param billingDay
     * @param supportedBank
     * @return
     */
    private static LocaleData repaymentDay(String billingDay, String supportedBank) {
        return null;
    }

    /**
     * 最后还款日倒计时
     * @param billingDay
     * @param supportedBank
     * @return
     */
    private static int repaymentDayCountdown(String billingDay, String supportedBank) {

        return 0;
    }

    /**
     * 免息期倒计时
     *
     * @param billingDay
     * @param supportedBank
     * @return
     */
    private static int interestFreePeriodCountdown(String billingDay, String supportedBank) {
        //如果是固定还款日期，那么，计算的公式为：账单日（year month day）的后一天，开始起算，到下一个月的某个日子之间的日期差）
        //固定的日期，是根据个人账户不同，需要进行个性化配置的。具体每个月的哪天，视银行而定，视个人而定，并且有可能会发生变化和调整，所以应该抽到一个配置文件、或者存储到数据库里，以便可以进行动态的修改和维护
        //    如果，当前日期大于账单日的时间，如：2020-2-17日为账单日，当前刷卡消费或者取现日期为2020-2-18，则：免息期为从刷卡消费或取现之日
        // 起算，至下个月还款日（固定）+一个月时间之后日期，之间的差值
        // 例如：
        //    如果当前日期大于账单日的时间，如：2020-2-17日为账单日，当前刷卡消费或者取现日期为2020-2-16,或17日，则：免息期为从刷卡消费或取现之日起算，至下个月还款日（固定）之间的差值
        // 例如：


        //如果是非固定还款日期，计算公式为：
        // 账单日之后，按账单日后推迟N天（具体多少天，视银行而定，并且有可能会发生变化，所以应该抽到一个配置文件、或者存储到数据库里，以便可以进行动态的修改和维护
        //如果，当前日期大于账单日的时间，如：2020-2-17日为账单日，当前刷卡消费或者取现日期为2020-2-18，所以，免息期则等于从刷卡消费或者取现日期起算，至，最近还款日+一个月时间，之间的差值。
        // 例如：
        //如果，当前日期小于账单日的时间，如：2020-2-17日为账单日，当前刷卡消费或取现的日期为2020-2-16，或者17，则，免息期为，当天起算，至最近一个还款日之间的日期差值
        // 例如：


        return 0;

    }
}
