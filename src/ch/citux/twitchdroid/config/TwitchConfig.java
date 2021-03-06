package ch.citux.twitchdroid.config;

public class TwitchConfig {

    public static final String USHER_STREAM_TOKEN = "Wd75Yj9sS26Lmhve";

    public static final String URL_API_TWITCH_BASE = "https://api.twitch.tv/kraken/";
    public static final String URL_API_JUSTIN_BASE = "https://api.justin.tv/api/";
    public static final String URL_API_USHER_BASE = "http://usher.justin.tv/";

    public static final String URL_API_GET_FAVORITES = URL_API_JUSTIN_BASE + "user/favorites/{0}.json";
    public static final String URL_API_GET_CHANNEL = URL_API_TWITCH_BASE + "channels/{0}";
    public static final String URL_API_GET_STREAM = URL_API_TWITCH_BASE + "streams/{0}";
    public static final String URL_API_GET_FEATURED_STREAMS = URL_API_TWITCH_BASE + "streams/featured?limit={0}&offset={1}";
    public static final String URL_API_GET_STREAM_TOKEN = URL_API_USHER_BASE + "stream/iphone_token/{0}.json?connection=wifi&type=any";
    public static final String URL_API_GET_STREAM_PLAYLIST = URL_API_USHER_BASE + "stream/multi_playlist/{0}.m3u8?token={1}&hd={2}";

}
