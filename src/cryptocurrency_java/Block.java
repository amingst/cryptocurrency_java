package cryptocurrency_java;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class Block implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int index, proof;
	private String previousHash;
	private List<Transaction> transactionList;
	private LocalDateTime timestamp;
	
	Block(int bIndex, String bPrevHash, List<Transaction> bTransList, int bProof, LocalDateTime bTimestamp) {
		this.index = bIndex;
		this.previousHash = bPrevHash;
		this.transactionList = bTransList;
		this.proof = bProof;
		this.timestamp = bTimestamp;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getProof() {
		return proof;
	}

	public void setProof(int proof) {
		this.proof = proof;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
}
