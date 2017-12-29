package app.tasknearby.yashcreations.com.tasknearby.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import app.tasknearby.yashcreations.com.tasknearby.models.Attachment;

/**
 * @author shilpi
 */

@Dao
public interface AttachmentDao {

    @Insert
    public long insertAttachment(Attachment attachment);

    @Insert
    public List<Long> insertAttachments(List<Attachment> attachmentList);

    @Update
    public void updateAttachment(Attachment attachment);

    @Delete
    public void deleteAttachment(Attachment attachment);

    @Query("SELECT * FROM attachments ")
    public List<Attachment> getAllAttachments();

    @Query("SELECT * FROM attachments WHERE id = :attachmentId")
    public Attachment getAttachmentWithId(long attachmentId);
}
