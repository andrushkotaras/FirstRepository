import java.util.HashMap;
import java.util.Map;
public class Main {
        public static void main(String[] args) {

                Map<String, Words> wordsHashMap = new HashMap<>();

                Words hello = new Words("Hello","Hallo","こんにちは");
                wordsHashMap.put("Привіт", hello);

                Words sun = new Words("Sun","Sonne","太陽");
                wordsHashMap.put("Сонце", sun);

                Words happiness = new Words("Happiness","Glück","幸せ");
                wordsHashMap.put("Щастя", happiness);

                Words life = new Words("Life","Leben","人生");
                wordsHashMap.put("Життя", life);

                Words robot = new Words("Robot","Roboter","ロボット");
                wordsHashMap.put("Робот", robot);

                Words butterfly = new Words("Butterfly","Schmetterling","蝶");
                wordsHashMap.put("Метелик", butterfly);

                Words tank = new Words("Tank","Panzer","タンク");
                wordsHashMap.put("Танк", tank);

                Words give = new Words("Give","Gib es","それを与える");
                wordsHashMap.put("Дайте", give);

                Words toUs = new Words("To us","Zu uns","私たちへ");
                wordsHashMap.put("Нам", toUs);

                Words f16 = new Words("F-16","F-16","F-16");
                wordsHashMap.put("F-16", f16);

                System.out.println(wordsHashMap.get("Привіт"));
                System.out.println(wordsHashMap.get("Дайте"));
                System.out.println(wordsHashMap.get("Нам"));
                System.out.println(wordsHashMap.get("F-16"));
        }
}
