package net.ripe.db.nrtm4.publish;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ripe.db.nrtm4.persist.NrtmVersionInfo;


public class PublishableSnapshotFile extends PublishableNrtmDocument {

    @JsonIgnore // Not used, since snapshots are streamed explicitly
    private String fileName;
    @JsonIgnore // Not used, since snapshots are streamed explicitly
    private String sha256hex;

    public PublishableSnapshotFile(
        final NrtmVersionInfo version
    ) {
        super(version);
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public void setHash(final String sha256hex) {
        this.sha256hex = sha256hex;
    }

    public String getFileName() {
        return fileName;
    }

    public String getSha256hex() {
        return sha256hex;
    }

}
