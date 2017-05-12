

http://localhost:8080/simcustc1



当有多种操作在同一个service方法时手工回滚事务(暂未研究出自动化解决方案)
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();