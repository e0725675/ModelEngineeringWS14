//add your implemented constraint here
fact {
	all p:Publication | 
(p.type = PublicationType.JA implies #p.journal = 1 and #p.book = 0 and p.proceedings = 0) and 
(p.type = PublicationType.BC implies #p.journal = 0 and #p.book = 1 and p.proceedings = 0) and 
(p.type = PublicationType.WP or p.type = PublicationType.CP implies #p.journal = 0 and #p.book = 0 and p.proceedings = 1)
}