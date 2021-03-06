package au.com.team2moro.couchdbsyncer;

public class Attachment {

	private byte[] content;
	private String filename, contentType, docId;
	private boolean stale;
	private long attachmentId, documentId;
	private long length, revision;
	
	public Attachment(String filename) {
		this.filename = filename;
		this.attachmentId = -1;
		this.documentId = -1;
	}

	public String toString() {
		return filename;
	}
	
	// override equals (used in Set functionality in DatabaseStore)
	public boolean equals(Object other) {
		if(!(other instanceof Attachment)) return false;
		return this.filename.equals(((Attachment)other).filename);
	}
	
	public int hashCode() {
		return this.filename.hashCode();
	}
	
	public long getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(long attachmentId) {
		this.attachmentId = attachmentId;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getFilename() {
		return filename;
	}

	public long getRevision() {
		return revision;
	}

	public void setRevision(long revision) {
		this.revision = revision;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}

	public boolean isStale() {
		return stale;
	}

	public void setStale(boolean stale) {
		this.stale = stale;
	}
	
	public boolean isImage() {
		return contentType.startsWith("image/");
	}
	
}
