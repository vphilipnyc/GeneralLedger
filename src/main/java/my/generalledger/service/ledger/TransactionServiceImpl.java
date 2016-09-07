package my.generalledger.service.ledger;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.generalledger.dao.ledger.TransactionDAO;
import my.generalledger.domain.ledger.LedgerAccount;
import my.generalledger.domain.ledger.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService {

	private final TransactionDAO dao;
	
	@Autowired
	public TransactionServiceImpl(TransactionDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void saveTransaction(Transaction transcaction) {
		dao.saveTransaction(transcaction);
	}
	
	@Override
	public void saveTransaction(Calendar date, String description, int amount, 
			LedgerAccount creditAccount, LedgerAccount debitAccount) {
		Transaction transaction = new Transaction(date, description, amount, creditAccount, debitAccount);
		dao.saveTransaction(transaction);
	}

	@Override
	public Transaction getAccountById(int id) {
		return dao.getAccountById(id);
	}

	@Override
	public List<Transaction> getTransactions() {
		return dao.getTransactions();
	}

	@Override
	public void updateTransaction(Transaction transaction) {
		dao.updateTransaction(transaction);
	}

	@Override
	public void deleteTransaction(Transaction transaction) {
		dao.deleteTransaction(transaction);
	}
}
