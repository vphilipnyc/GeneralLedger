package my.generalledger.dao;

import java.util.List;

import my.generalledger.domain.ledger.LedgerAccount;

public interface LedgerAccountDAO {
	
	void saveAccount(LedgerAccount ledgerAccount);
	LedgerAccount getAccountById(int Id);
	LedgerAccount getAccountByNumber(String number);
	List<LedgerAccount> getAccounts();
	void updateAccount(LedgerAccount ledgerAccount);
	void deleteAccount(LedgerAccount ledgerAccount);
}
