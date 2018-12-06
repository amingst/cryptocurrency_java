package cryptocurrency_java;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BlockChain implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String owner;
	private List<Block> blockChain;
	private List<Transaction> openTransactions;
	
	BlockChain(String bcOwner) {
		this.owner = bcOwner;
		this.blockChain = new ArrayList<>();
		this.openTransactions = new ArrayList<>();
		Block genesisBlock = new Block(0, "", new ArrayList<Transaction>(), 100, LocalDateTime.now());
		
		this.blockChain.add(genesisBlock);
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<Block> getBlockChain() {
		return blockChain;
	}

	public void setBlockChain(List<Block> blockChain) {
		this.blockChain = blockChain;
	}

	public List<Transaction> getOpenTransactions() {
		return openTransactions;
	}

	public void setOpenTransactions(List<Transaction> openTransactions) {
		this.openTransactions = openTransactions;
	}
}
