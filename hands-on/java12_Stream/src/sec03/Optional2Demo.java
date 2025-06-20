// 스트림 연산과 옵션 타입2
package sec03;

import java.util.Optional;
import sec01.Util;

public class Optional2Demo {
    public static void main(String[] args) {
        String s1 = "안녕";     // or String s1 = null; // 없음 없음 없음 없음
        Optional<String> o = Optional.ofNullable(s1);

        //출력1
        o.ifPresentOrElse(Util::print, () -> Util.print("없음"));

        //출력2
        if(o.isPresent())
            Util.print(o.get());
        else
            Util.print("없음");

        //출력3
        String s2 = o.orElse("없음");
        Util.print(s2);

        //출력4
        o.ifPresentOrElse(Util::print, ()->System.out.println("없음" + //
                        ""));
    }
}
