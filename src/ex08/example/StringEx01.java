package ex08.example;

import java.util.ArrayList;
import java.util.HashSet;

public class StringEx01 {
    static String data = "";
    static String encodingData = "";

    public static String encoding(String data) {
        int count;
        char head = 0;

        int dataLength = data.length();

        char[] dataArr = new char[dataLength];
        for (int i = 0; i < dataLength; i++) {
            dataArr[i] = data.charAt(i);
        }

        char branchPoint = dataArr[0]; // 데이터 배열의 첫 번째 것을 일단 분기점으로 잡아

        ArrayList<Character> branchPointList = new ArrayList<>(); // 분기점들을 담은 리스트
        branchPointList.add(branchPoint); // 분기점 리스트에 데이터 배열의 첫 번째 것을 넣음

        // 각 글자들이 처음 나타나는 지점 찾기
        ArrayList<Integer> branchOrder = new ArrayList<>(); // 각 분기점들의 인덱스를 담은 리스트
        for (int i = 0; i < dataLength - 1; i++) { // 0부터 시작해서 그 다음 녀석과 비교해야 하니까 1을 뺌
            if (dataArr[i] != dataArr[i + 1]) {
                branchPoint = dataArr[i + 1];
                branchPointList.add(branchPoint);
            }

            // 인덱스를 찾아서 어레이리스트에 넣음
            int index = data.indexOf(branchPoint); // 분기점들이 몇 번째 순서에 있는지 인덱스를 찾아서
            branchOrder.add(index); // 넣음
        }

        //System.out.println("분기점: " + branchPointList);

        // 해시셋으로 중복되는 숫자를 제거
        HashSet<Integer> uniqueSet = new HashSet<>(branchOrder);
        ArrayList<Integer> uniqueBranchOrder = new ArrayList<>(uniqueSet);

        // 위에 찾은 문자와 숫자를 토대로 아래의 코드를 다시 만들기!!!
        ArrayList<String> encodingList = new ArrayList<>();
        String headStr = " ";
        String countStr = " ";

/////////////////////배열 전체 돌기
        for (int j = 0; j < branchPointList.size(); j++) {
            count = 1;
            for (int i = uniqueBranchOrder.get(j); i < dataLength; i++) {
                if ((branchPointList.get(j) == dataArr[i]) && (i != uniqueBranchOrder.get(j))) {
                    head = branchPointList.get(j);
                    headStr = Character.toString(head);
                    count++;
                    countStr = Integer.toString(count);

                }
            }
            encodingList.add(headStr);
            encodingList.add(countStr);
        }
        String encodingData = String.join("", encodingList); // 인코딩 된 데이터라는 뜻.
        return encodingData;
    }

    public static StringBuilder decoding(String encodingData) {
        int codeLength = encodingData.length();
        char[] codeArr = new char[codeLength];

        for (int i = 0; i < codeLength; i++) {
            codeArr[i] = encodingData.charAt(i);
        }

        // 짝수에 들어가는 애는 분기점, 홀수에 들어가는 애는 몇 번 반복
        char branchChar = 0;
        char countChar = 0;
        ArrayList<Character> branchCharList = new ArrayList<>();
        ArrayList<Integer> countIntList = new ArrayList<>();
        ArrayList<Character> decodingList = new ArrayList<>();

        int countInt = 0;

        for (int i = 0; i < codeArr.length; i++) {
            if (i % 2 == 0) {
                branchCharList.add(codeArr[i]);
            }
            if (i % 2 != 0) {
                countIntList.add(Character.getNumericValue(codeArr[i]));
            }
        }

        for (int j = 0; j < countIntList.size(); j++) {
            for (int i = 0; i < countIntList.get(j); i++) {
                decodingList.add(branchCharList.get(j));
            }
        }

        // 어레이리스트 문자열로 변환하기
        StringBuilder decoding = new StringBuilder();
        for (char c : decodingList) {
            decoding.append(c);
        }
        return decoding;
    }

    public static void main(String[] args) {
        data = "AABBBCCCCDDDDDDRRRㅁㅁㅁaaa777";
        System.out.println(encoding(data));
        encodingData = encoding(data);
        System.out.println(decoding(encodingData));

    }
}