# Hibernate-OneToMany-ManyToOne-Using-Xml

Hibernate: select max(id) from q501

Hibernate: select max(id) from ans501

Hibernate: insert into q501 (qname, id) values (?, ?)

Hibernate: insert into ans501 (question, answername, postedBy, id) values (?, ?, ?, ?)

Hibernate: insert into ans501 (question, answername, postedBy, id) values (?, ?, ?, ?)

Hibernate: insert into q501 (qname, id) values (?, ?)

Hibernate: insert into ans501 (question, answername, postedBy, id) values (?, ?, ?, ?)

Hibernate: insert into ans501 (question, answername, postedBy, id) values (?, ?, ?, ?)

Hibernate: update ans501 set type=? where id=?

Hibernate: update ans501 set type=? where id=?

Hibernate: update ans501 set type=? where id=?

Hibernate: update ans501 set type=? where id=?

SQL> select * from q501;

	ID	QNAME
	 1	What is Java?
	 2	What is Servlet?

SQL> select * from ans501;

	ID   QUESTION	ANSWERNAME			POSTEDBY	TYPE
	 1	    1	Java is a programming language	Ravi		0
	 2	    1	Java is a platform		Sudhir		1
	 3	    2	Servlet is an Interface		Jai		0
	 4	    2	Servlet is an API		Arun		1
