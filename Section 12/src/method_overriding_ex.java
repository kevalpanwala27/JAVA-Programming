class TV {
    public void switchON() {
        System.out.println("TV is Switched ON");
    }
    public void changeChannel() {
        System.out.println("TV Channel is Changed ");
    }
}
class SmartTV extends TV {
    @Override
    public void switchON() {
        System.out.println("Smart TV is Switched ON");
    }
    @Override
    public void changeChannel() {
        System.out.println("SmartTV Channel is Changed ");
    }
    public void browse() {
        System.out.println("Smart Tv Browsing");
    }
}
public class method_overriding_ex {
    public static void main(String[] args) {
        TV t = new TV();
        t.switchON();
        t.changeChannel();
        System.out.println();
        SmartTV st = new SmartTV();
        st.browse();
        st.changeChannel();
        st.switchON();
        System.out.println();
        TV tv=new SmartTV();
        tv.switchON();
        tv.changeChannel();
    }
}


