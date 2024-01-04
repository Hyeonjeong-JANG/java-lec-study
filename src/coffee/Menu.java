package coffee;

import java.util.List;

public class Menu {
    private List<String> item;

    // 메뉴 하나하나까지 클래스로 만들 필요는 없고 컴포지션해서 리스트 아이템으로 가지고 있으면 됨
    // 아메리카노(1500), 카푸치노(2000), 마키아또(2500), 에스프레소(2500)
    public Menu(List<String> item) {
        this.item = item;
    }
}
