//this file includes predefinitions and test runs

//Tests for Publication Entity Model
//Valid Test 1
pred show{}
run show for exactly 1 Publication,  1 Book, 1 Journal, 1 Proceedings, 2 Person, 1 PublicationVenue, 0 Event

//Invalid Test 1
pred show { all p:Publication | p.type = BC and one p.journal}
run show for exactly 1 Publication,  1 Book, 1 Journal, 1 Proceedings, 2 Person
, 1 PublicationVenue, 0 Event

//Tests for Course Entity Model
//Valid Test 2
pred show {}
run show for  40 Student, 40 Course

//Valid Test 3 -> only an empty set should be found
pred show {(all s:Student | all c:Course |  no (c.title +  s.name) ) }
run show for 40 Student, 40 Course
