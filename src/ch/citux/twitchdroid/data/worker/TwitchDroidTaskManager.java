package ch.citux.twitchdroid.data.worker;

import ch.citux.twitchdroid.data.model.Channel;
import ch.citux.twitchdroid.data.model.Favorites;
import ch.citux.twitchdroid.data.model.StreamPlayList;
import ch.citux.twitchdroid.data.worker.tasks.TaskGetChannel;
import ch.citux.twitchdroid.data.worker.tasks.TaskGetFavorites;
import ch.citux.twitchdroid.data.worker.tasks.TaskGetStreamPlaylist;
import ch.citux.twitchdroid.data.worker.tasks.TwitchDroidTask;

public class TwitchDroidTaskManager {

    private static TwitchDroidTask currentTask;

    public static void cancelTask() {
        if (currentTask != null) {
            currentTask.cancel(true);
        }
    }

    public static void getFavorites(TwitchDroidCallback<Favorites> callback, String username) {
        cancelTask();
        TaskGetFavorites task = new TaskGetFavorites(callback);
        task.execute(username);
        currentTask = task;
    }

    public static void getChannel(TwitchDroidCallback<Channel> callback, String channel) {
        cancelTask();
        TaskGetChannel task = new TaskGetChannel(callback);
        task.execute(channel);
        currentTask = task;
    }

    public static void getStreamPlaylist(TwitchDroidCallback<StreamPlayList> callback, String channel, boolean hd) {
        cancelTask();
        TaskGetStreamPlaylist task = new TaskGetStreamPlaylist(callback);
        task.execute(channel, Boolean.toString(hd));
        currentTask = task;
    }
}
