package java10;
// import java.util.ArrayList;
// import java.util.List;

// class Car {
// }

// private static Car[] carArray = { // 고칠 부분
//     new Car(1, "BENS SCLASS", "BLACK", 11000),
//     new Car(2, "BMW 9", "BLUE", 8000),
//     new Car(3, "KEA 9", "WHITE", 7000)
// };
// private static List<Car> carList = Arrays.asList(carArray);

// // 첫번째 버전 : 매개 변수가 없음
// private static List<Car> filterWhiteCars(List<Car> inventory) { // 매개변수 없음
//     List<Car> result = new ArrayList<>(); // white인 자동차 저장할 리스트
//     for (Car car: inventory) {
//         if ("WHITE".equals(car.getColor()))
//             result.add(car);
//     }
//     return result;
// }

// // 두번째 버전 : 값 매개 변수화
// private static List<Car> filterCarByColor(List<Car> inventory, Color color) { //color 값을 매개변수로 받음
//     List<Car> result = new ArrayList<>();
//     for (Car car: inventory) {
//         if (car.getColor().equals(color))
//             result.add(car);
//     }
//     return result;
// }
// public static List<Car> filterCars(List<Car> inventory, Color color, int price) {
//     List<Car> result = new ArrayList<>();
//     for (Car car: inventory) {
//         if ( (car.getColor().equals(color)) || (car.getPrice() <= price) )
//             result.add(car);
//     }
// }

// // 세번쨰 버전 : 동작 매개 변수화
// public interface CarPredicate {
//     boolean test (Car car);
// }
// private static List<Car> filterCars(List<Car> inventory, CarPredicate p) { =
//     List<Car> result = new ArrayList<>();
//     for (Car car: inventory) {
//         if (p.test(car)) 
//             result.add(car);
//     }
//     return result;
// }
// public class whiteCheapPredicate implements CarPredicate { //조건을 함수처럼 test 메서드로 전달
//     public boolean test(Car car) {
//         return "WHITE".equals(car.getColor())&& car.getPrice() <= 5000;
//     }
// }
// List<Car> whiteCheapCars = filterCars(carList, new whiteCheapPredicate());


// // 네 번째 버전 : 익명 클래스
// List<Car> whiteCar = filterCars(carList, new CarPredicate() {
//     public boolean test(Car car) {
//         return "WHITE".equals(car.getColor());
//     }
// });

// // 다섯번째 버전 : 람다식 사용
// List<Car> whiteCars = filterCars(carList, (Car car) -> "WHITE".equals(car.getColor()));
