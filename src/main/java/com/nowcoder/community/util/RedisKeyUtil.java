package com.nowcoder.community.util;

public class RedisKeyUtil {
    private static final String SPILIT = ":";
    private static final String PREFIX_ENTITY_LIKE = "like:entity";
    private static final String PREFIX_USER_LIKE = "like:user";
    private static final String PREFIX_FOLLOWER = "follower";
    private static final String PREFIX_FOLLOWEE = "followee";
    private static final String PREFIX_KAPTCHA = "kaptcha";
    private static final String PREFIX_TICKET = "ticket";
    private static final String PREFIX_USER = "user";
    private static final String PREFIX_UV = "uv";
    private static final String PREFIX_DAU = "dau";
    private static final String PREFIX_POST = "post";
    private static final String PREFIX_POSTLIST = "post:list";
    private static final String PREFIX_POSTROWS = "post:rows";

    // 某个实体的赞
    // like:entity:entityType:entityId -> set(userId)
    public static String getEntityLikeKey(int entityType, int entityId) {
        return PREFIX_ENTITY_LIKE + SPILIT + entityType + SPILIT + entityId;
    }

    // 某个用户的赞
    // like:user:userId -> int
    public static String getUserLikeKey(int userId) {
        return PREFIX_USER_LIKE + SPILIT + userId;
    }

    // 某个用户关注的实体
    // followee:userId:entityType -> zset(entityId, now)
    public static String getFolloweeKey(int userId, int entityType) {
        return PREFIX_FOLLOWEE + SPILIT + userId + SPILIT + entityType;
    }

    // 某个用户拥有的粉丝
    // follower:entityType:entityId -> zset(userId, now)
    public static String getFollowerKey(int entityType, int entityId) {
        return PREFIX_FOLLOWER + SPILIT + entityType + SPILIT + entityId;
    }

    // 登录验证码
    public static String getKaptchaKey(String owner) {
        return PREFIX_KAPTCHA + SPILIT + owner;
    }

    // 登录凭证
    public static String getTicketKey(String ticket) {
        return PREFIX_TICKET + SPILIT + ticket;
    }

    // 用户
    public static String getUserKey(int userId) {
        return PREFIX_USER + SPILIT + userId;
    }

    // 单日uv
    public static String getUVKey(String date) {
        return PREFIX_UV + SPILIT + date;
    }

    // 区间uv
    public static String getUVKey(String startDate, String endDate) {
        return PREFIX_UV + SPILIT + startDate + SPILIT + endDate;
    }

    // 单日dau
    public static String getDAUKey(String date) {
        return PREFIX_DAU + SPILIT + date;
    }

    // 区间dau
    public static String getDAUKey(String startDate, String endDate) {
        return PREFIX_DAU + SPILIT + startDate + SPILIT + endDate;
    }

    // 帖子分数
    public static String getPostScoreKey() {
        return PREFIX_POST + SPILIT + "score";
    }

    // 首页帖子列表
    public static String getPostListKey(int offset, int limit) {
        return PREFIX_POSTLIST + SPILIT + offset + SPILIT + limit;
    }

    // 首页帖子总数
    public static String getPostRowsKey(int userId) {
        return PREFIX_POSTROWS + SPILIT + userId;
    }
}
