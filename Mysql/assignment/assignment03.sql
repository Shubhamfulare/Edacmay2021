-- Display all the Supplier names with the initial letter capital.

select * from s where binary Sname between 'A' and 'Z';



-- Display all the Supplier names in upper case.

select upper(sname) from s; 

-- Display all the Supplier names in lower case.

select lower(sname) from s;

-- Display all the Supplier names padded to 25 characters, with spaces on the left.

select lpad(sname , 25,' ') from s;

-- Display all the Supplier names (with ‘la’ replaced by ‘ro’). HINT: REPLACE

select replace(sname ,'a' ,'r') from s;


-- Implement the above command such that ‘l’ is replaced with ‘r’ and ‘a’ is replaced with ‘o’.

select replace(sname ,'l' ,'a')  from s;


-- Display the Supplier names and the lengths of the names.

select sname as name, length(sname) from s;

-- Use the soundex function to search for a supplier by the name of ‘BLOKE’.



-- Display the Supplier name and the status (as Ten, Twenty, Thirty, etc.).
select sname as name , Status
from s
where 10 as ten
;


-- Display the current day (e.g. Thursday). 
select current_date();