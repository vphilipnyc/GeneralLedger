package my.generalledger.service;

import java.util.List;

import my.generalledger.domain.ledger.LedgerAccount;

public interface LedgerAccountService {

	void saveAccount(LedgerAccount ledgerAccount);
	LedgerAccount getAccountById(int id);
	LedgerAccount getAccountByNumber(String number);
	List<LedgerAccount> getAccounts();
	void updateAccount(LedgerAccount ledgerAccount);
	void deleteAccount(LedgerAccount ledgerAccount);
}
