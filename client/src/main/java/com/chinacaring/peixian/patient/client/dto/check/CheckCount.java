package com.chinacaring.peixian.patient.client.dto.check;

public class CheckCount {
    // 项目名称
    private String name;
    // 项目单数
    private CheckCountItem<Integer> count = new CheckCountItem<>(0,0);
    // 总金额
    private CheckCountItem<Integer> totalMoney = new CheckCountItem<>(0,0);
    // 微信单数
    private CheckCountItem<Integer> wxCount = new CheckCountItem<>(0,0);
    // 微信金额
    private CheckCountItem<Integer> wxMoney = new CheckCountItem<>(0,0);
    // 支付宝单数
    private CheckCountItem<Integer> aliCount = new CheckCountItem<>(0,0);
    // 支付宝金额
    private CheckCountItem<Integer> aliMoney = new CheckCountItem<>(0,0);

    /**
     * 分别统计瞰聆和his的数据
     * @param <T>
     */
    public class CheckCountItem<T> {
        private T caringVal;
        private T hisVal;

        public CheckCountItem(T caringVal, T hisVal) {
            this.caringVal = caringVal;
            this.hisVal = hisVal;
        }

        public T getCaringVal() {
            return caringVal;
        }

        public void setCaringVal(T caringVal) {
            this.caringVal = caringVal;
        }

        public T getHisVal() {
            return hisVal;
        }

        public void setHisVal(T hisVal) {
            this.hisVal = hisVal;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckCountItem<Integer> getCount() {
        return count;
    }

    public void setCount(CheckCountItem<Integer> count) {
        this.count = count;
    }

    public CheckCountItem<Integer> getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(CheckCountItem<Integer> totalMoney) {
        this.totalMoney = totalMoney;
    }

    public CheckCountItem<Integer> getWxCount() {
        return wxCount;
    }

    public void setWxCount(CheckCountItem<Integer> wxCount) {
        this.wxCount = wxCount;
    }

    public CheckCountItem<Integer> getWxMoney() {
        return wxMoney;
    }

    public void setWxMoney(CheckCountItem<Integer> wxMoney) {
        this.wxMoney = wxMoney;
    }

    public CheckCountItem<Integer> getAliCount() {
        return aliCount;
    }

    public void setAliCount(CheckCountItem<Integer> aliCount) {
        this.aliCount = aliCount;
    }

    public CheckCountItem<Integer> getAliMoney() {
        return aliMoney;
    }

    public void setAliMoney(CheckCountItem<Integer> aliMoney) {
        this.aliMoney = aliMoney;
    }
}
