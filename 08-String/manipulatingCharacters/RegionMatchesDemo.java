package manipulatingCharacters;

public class RegionMatchesDemo {
    public static void main(String... args) {
        String searchMe = "Green Eggs and Ham";
        String findMe = "Eggs";
        //直接可以判断是否在里面
        System.out.println(searchMe.contains(findMe));
        System.out.println(searchMe.indexOf(findMe));

        //使用区域匹配去查找
        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();

        boolean findIt = false;

        for (int i = 0; i <= searchMeLength - findMeLength; i++) {
            findIt = searchMe.regionMatches(i, findMe, 0, findMeLength);
            if (findIt) {
                System.out.println(searchMe.substring(i, i + findMeLength));
                break;
            }
        }
        if (!findIt)
            System.out.println("Not matched!");
    }
}
