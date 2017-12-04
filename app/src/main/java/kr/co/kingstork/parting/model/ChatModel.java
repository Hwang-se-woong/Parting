package kr.co.kingstork.parting.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hwang on 2017-12-01.
 */

public class ChatModel {

    public Map<String,Boolean> users = new HashMap<>(); //채팅방의 유저들
    public Map<String,Comment> comments = new HashMap<>(); //채팅방의 대화내용

    public static class Comment {
        public String uid;
        public String message;
    }
}
