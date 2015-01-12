module ME14
sig Student {
	name: one Int,
	likes: one Course,
	enrols: one Course
}
sig Course {
	title: one Int,
	isEnroledBy: set Student,
	isLikedBy: set Student
}
fact {
	all v: Course | #v.isEnroledBy >= 10
	all v: Course | #v.isLikedBy >= 5
	all v: Course | #v.isLikedBy =< 5
}
//Valid Test 3 -> only an empty set should be found
pred show {(all s:Student | all c:Course |  no (c.title +  s.name) ) }
run show for 40 Student, 40 Course
