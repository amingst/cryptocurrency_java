package utils;

import java.security.MessageDigest;
import java.util.List;

import cryptocurrency_java.Block;
import cryptocurrency_java.Transaction;

public class HashUtils {
	
	public static String hashBlock(Block block) {
		String hashableBlock = buildHashableBlock(block);
		String hash = sha256(hashableBlock);
		
		return hash;
	}
	
	private static String sha256(String input) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();
			
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}
			
			return hexString.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private static String buildHashableBlock(Block block) {
		String blockString = "";
		List<Transaction> transactionList = block.getTransactionList();
		String transactionString = buildTransactionString(transactionList);
		
		blockString = block.getIndex() + block.getPreviousHash() + block.getProof() + transactionString;
		
		return blockString;
	}
	
	private static String buildTransactionString(List<Transaction> transactionList) {
		StringBuffer transactionString = new StringBuffer();
		
		for (int i = 0; i < transactionList.size(); i++) {
			Transaction current = transactionList.get(i);
			transactionString.append(" " + current.getSender() + " " + current.getRecipient() + " " + current.getAmount());
		}
		
		return transactionString.toString();
	}
}
