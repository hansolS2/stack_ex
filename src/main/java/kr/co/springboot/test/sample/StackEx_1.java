package kr.co.springboot.test.sample;

import java.util.Arrays;
import java.util.Stack;

public class StackEx_1 {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        Stack<Integer> st = new Stack();

        for(int i=0; i< heights.length; i++){
            st.push(heights[i]);
        }

        for(int i=0; i< heights.length; i++) {
            answer[heights.length-1-i] = 0;
            int tmp = st.peek();
            for (int j = 1; j <= st.size(); j++) {
                if (heights[(st.size() - j)] > tmp) {
                    answer[heights.length-1-i] = (st.size() - j+1);
                    break;
                }
            }
            st.pop();
        }
        System.out.println("결과 :"+ Arrays.toString(answer));
        //1.stack에 내용을 담음
        //2.for문 돌면서 값 비교
        //3.인덱스 int 배열에 저장 후 리턴
        return answer;
    }
}
