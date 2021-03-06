//Block class that represent <p> tag

public class Block extends Node {
	private String head;
	private String tail;

	private boolean showStarting, showEnding;
	private String starting;
	private String ending;

	public Block(boolean showStarting, boolean showEnding) {
		this.showStarting = showStarting;
		this.showEnding = showEnding;
	}

	public void setHtml() {
		String html = new String();

		if (showStarting)
			html = this.starting;
		
		html = html + this.head;

		for (Tokens token : this.token)
			html = html + token.getItem();

		html = html + this.tail;
		if (showEnding)
			html = html + this.ending;

		super.html = html;

	}

	public void setStarting(String starting) {
		this.starting = starting;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	public void setEnding(String ending) {
		this.ending = ending;
	}

}