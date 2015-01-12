module ME14
sig Publication {
	title: one Int,
	keywords: lone Int,
	doi: lone Int,
	year: lone Int,
	fromPage: lone Int,
	untilPage: lone Int,
	type: one PublicationType,
	assignedFaculty: one Faculty,
	field: one ResearchField,
	authors: some Person,
	proceedings: lone Proceedings,
	journal: lone Journal,
	book: lone Book
}
sig Person {
	firstname: one Int,
	lastname: one Int,
	email: one Int,
	external: lone Int,
	faculty: lone Faculty,
	publibations: one Publication
}
sig Proceedings {
	publisher: lone Int,
	volume: lone Int,
	isbn: lone Int,
	event: one Event,
	editors: set Person
}
sig Journal {
	id: one Int,
	volume: lone Int,
	number: lone Int
}
sig Book {
	publisher: lone Int,
	isbn: lone Int
}
sig PublicationVenue {
	title: one Int
}
sig Event {
	etitle: one Int,
	city: lone Int,
	country: lone Int,
	fromDate: lone Int,
	untilDate: lone Int,
	admissionFrom: lone Int
}
enum Faculty {
	AP, CE, MIE, EEIT, MG, P, TC, I
}
enum ResearchField {
	CSE, QPQT, MM, ICT, EE
}
enum PublicationType {
	JA, BC, CP, WP
}
fact {
	all e1:Person, e2:Publication | (e1.publibations in e2 implies e2.authors in e1) and (e2.authors in e1 implies e1.publibations in e2)
}
fact {
	all p:Publication | (p.type = JA implies #p.journal = 1 and #p.book = 0 and #p.proceedings = 0)
}
//Invalid Test 1
pred show { all p:Publication | p.type = BC and one p.journal}
run show for exactly 1 Publication,  1 Book, 1 Journal, 1 Proceedings, 2 Person
, 1 PublicationVenue, 0 Event
