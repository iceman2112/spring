package xmlconfig;

public class TestBean {
    public TestBean(MegaBean megaBean) {
        this.megaBean = megaBean;
    }

    private MegaBean megaBean;

    public TestBean() {
    }

    public MegaBean getMegaBean() {
        return megaBean;
    }

    public void setMegaBean(MegaBean megaBean) {
        this.megaBean = megaBean;
    }
}
