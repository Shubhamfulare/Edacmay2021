-- Display the minimum Status in the Supplier table.

select min(status) from s; 

-- Display the maximum Weight in the Parts table.

select max(Weight) from p;

-- Display the average Weight of the Parts.

select avg(Weight) from p;

-- Display the total Quantity sold for part ‘P1’.


select Qty from spj
where Pno= "P1";

-- Display the total Quantity sold for each part.

select Pno, Qty from spj;


-- Display the average Quantity sold for each part.

select avg(Qty) from spj;

-- Display the maximum Quantity sold for each part, provided the maximum Quantity is greater than 800.

select max(Qty) from spj;


-- Display the Status and the count of Suppliers with that Status.

select status , count(Sno) from s;

-- Display the count of Projects going on in different cities.

select city,count(Jno) from j group by city ;


-- What is the difference between COUNT(Status) and COUNT(*) ?



-- Display the Status and the Count of Suppliers with that Status in the following format as shown below:

select
case
	when status=10 then 'Ten' 
    when status=20 then 'Twenty' 
    when status=30 then 'Thirty' 
    else 'others'
    
end as Sts, count(Sname) from s group by status;