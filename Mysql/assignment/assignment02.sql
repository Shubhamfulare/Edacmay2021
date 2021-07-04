use spj;

select * from s
order by city desc;

select * from p
order by city,Pname;

select * from s
where status between 10 and 20;


select * from p
where weight not between 15 and 20;

select * from p
where Pname like 'S%'
;

select * from s
where City LIKE'L%';

#incomplete
select * from j
where Jname LIKE'n';